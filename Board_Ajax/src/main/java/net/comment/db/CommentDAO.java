package net.comment.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class CommentDAO {

	private DataSource ds;
	
	//생성자에서 JNDI 리소스를 참조하여 Connection 객체를 얻어온다.
	public CommentDAO() {
		try {
			Context init = new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
		} catch (Exception ex) {
			System.out.println("DB 연결 실패 : " + ex);
		}
	}
	
	public int commentsInsert(Comment co) {
		int result = 0;
		String sql = "insert into comm "
				+ " values(com_seq.nextval, ?, ?, sysdate, ?, ?, ?, com_seq.nextval)";
		try (Connection con = ds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, co.getId());
			pstmt.setString(2, co.getContent());
			pstmt.setInt(3, co.getComment_board_num());
			pstmt.setInt(4, co.getComment_re_lev());
			pstmt.setInt(5, co.getComment_re_seq());
			result=pstmt.executeUpdate();
			if(result == 1) 
				System.out.println("데이터 삽입 완료되었습니다.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public int getListCount(int comment_board_num) {
		int x = 0;
		String sql = "select count(*) "
				+ " from comm "
				+ " where comment_board_num = ?";
		try(Connection con = ds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, comment_board_num);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					x = rs.getInt(1);
				}
			}
		}catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("getListCount() 에러 :" + ex);
		}
		return x;
	}//getListCount() end

	public JsonArray getCommentList(int comment_board_num, int state) {
		String sort ="asc";//등록순
		if(state==2) {	//최신순
			sort="desc";
		}
		String sql = "select num, comm.id, content, reg_date, comment_re_lev, "
				+ "			comment_re_seq, "
				+ "			comment_re_ref, member.memberfile "
				+ "	from	comm join member "
				+ "	on		comm.id=member.id "
				+ "	where	comment_board_num = ? "
				+ "	order	by comment_re_ref " + sort + ", "
				+ "			comment_re_seq asc";
		JsonArray array =new JsonArray();
		
		try (Connection con = ds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			
			pstmt.setInt(1, comment_board_num);
			
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					JsonObject object = new JsonObject();
					object.addProperty("num", rs.getInt(1));
					object.addProperty("id", rs.getString(2));
					object.addProperty("content", rs.getString(3));
					object.addProperty("reg_date", rs.getString(4));
					object.addProperty("comment_re_lev", rs.getInt(5));
					object.addProperty("comment_re_seq", rs.getInt(6));
					object.addProperty("comment_re_ref", rs.getInt(7));
					object.addProperty("memberfile", rs.getString(8));
					array.add(object);
				}
			}
		}catch (Exception ex) {
			System.out.println("getCommentList() 에러 : " + ex);
		}
		return array;
	}//

	public int commentsUpdate(Comment co) {
		int result=0;
		String sql = "update comm set content=? "
					+ "where num = ? ";
		
		try(Connection con = ds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, co.getContent());
			pstmt.setInt(2, co.getNum());
			
			result = pstmt.executeUpdate();
			if(result == 1) 
				System.out.println("데이터가 수정 되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}//commentUpdate()메서드

	public int commentsReply(Comment c) {
		int result = 0;
		
		try(Connection con = ds.getConnection();) {
			con.setAutoCommit(false);
			
			try {
				reply_update(con, c.getComment_re_ref(), c.getComment_re_seq());
				result=reply_insert(con, c);
				con.commit();
			} 
			catch (Exception e) {
				e.printStackTrace(); //오류 확인용
				if (con != null) {
					try {
						con.rollback(); // rollback 합니다.
					}catch (SQLException ex) {
						ex.printStackTrace();
					}
				}
			}	
			con.setAutoCommit(true);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	private int reply_insert(Connection con, Comment c) throws SQLException {
		int result= 0;
		String sql = "insert into comm "
				+ " values(com_seq.nextval, ?, ?, sysdate, ? ,? ,? ,?)";
				try(PreparedStatement pstmt = con.prepareStatement(sql);) {
					pstmt.setString(1, c.getId());
					pstmt.setString(2, c.getContent());
					pstmt.setInt(3, c.getComment_board_num());
					pstmt.setInt(4, c.getComment_re_lev()+1);
					pstmt.setInt(5, c.getComment_re_seq()+1);
					pstmt.setInt(6, c.getComment_re_ref());
					result = pstmt.executeUpdate();
				}
		return result;
	}

	private void reply_update(Connection con, int comment_re_ref, int comment_re_seq) throws SQLException {
		
		String update_sql = "update comm "
						+ "set		comment_re_seq=comment_re_seq +1 "
						+ "where	comment_re_ref= ? "
						+ "and		comment_re_seq > ?";
		try(PreparedStatement pstmt = con.prepareStatement(update_sql);) {
			pstmt.setInt(1, comment_re_ref);
			pstmt.setInt(2, comment_re_seq);
			pstmt.executeUpdate();
		}
		
	}

	public int commentsDelete(int num) {
	    int	result = 0;
	    String Delete_sql= "delete comm where num=? ";
	    
	    try(Connection con = ds.getConnection();
	    		PreparedStatement pstmt = con.prepareStatement(Delete_sql);){
	    	pstmt.setInt(1, num);
	    	result = pstmt.executeUpdate();
	    	if(result == 1) 
	    		System.out.println("데이터가 삭제 되었습니다.");
	    }catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}//commentsDelete() 메서드

}
