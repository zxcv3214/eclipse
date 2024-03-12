package ex22_board;

import java.sql.*;
import java.util.*;
public class BoardDAO {
	
	//글 등록
	public int boardInsert(Board board) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		int result = 0;		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "board", "1234");
			
			String insert_sql = "insert into board "
					+ "(BOARD_NUM, BOARD_NAME, BOARD_PASS, BOARD_SUBJECT,"
					+ " BOARD_CONTENT, BOARD_RE_REF,"
					+ " BOARD_RE_LEV, BOARD_RE_SEQ, BOARD_READCOUNT,"
					+ " BOARD_DATE) "
					+ " values(board_seq.nextval,?,?,?,"
					+ " ?, board_seq.nextval,"
					+ " ?, ?, ?,"
					+ " sysdate)";
			
			//새로운 글을 등록하는 부분
			pstmt = conn.prepareStatement(insert_sql);
			pstmt.setString(1, board.getBoard_name());
			pstmt.setString(2, board.getBoard_pass());
			pstmt.setString(3, board.getBoard_subject());
			pstmt.setString(4, board.getBoard_content());
			
			//원문의 경우 BOARD_RE_LEV, BOARD_RE_SEQ 필드 값은 0이다.
			pstmt.setInt(5, 0);
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 0);
		
			result = pstmt.executeUpdate();
			
	} catch (ClassNotFoundException cnfe) {
		System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
	} catch (SQLException se) {
		System.out.println(se.getMessage());
	} finally {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	return result;
	}
	
	public List<Board> getBoardlist(int page, int limit) {
		List<Board> list = new ArrayList<Board>();
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		String sql =
				  "select * "
				+ "from "
				+ "     (select rownum rnum, b.* "
				+ "       from (select * from board "
				+ "             order by BOARD_RE_REF desc, BOARD_RE_SEQ asc) b"
				+ "       where rownum<=?) "
				+ "where rnum>=? and rnum<=?";
//				"select * "
//				+ "from ( select rownum rum, s.* "
//				+ "from (select board_num, board_name, board_subject, board_content, "
//				+ "board_file, board_original, board_re_ref, board_re_lev, "
//				+ "board_re_seq, board_readcount, board_date from board order by board_re_ref desc, board_re_seq asc ) S "
//				+ "where rownum <= ? ) "
//				+ "where rum>=? and rum<=?";
//			int startrow = (page * limit) - limit + 1 ;
//			int endrow = page * limit;
		//한 페이지당 10개씩 목록인 경우								   1페이지,2페이지,3페이지,4페이지 ...
		int startrow = (page - 1) * limit + 1; //읽기 시작할 row 번호(   1	   11 	  21	 31 ... )
		int endrow = startrow + limit - 1;     //읽을 마지막 row 번호(   10   20     30     40 ... )
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "board", "1234");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, endrow);
			pstmt.setInt(2, startrow);
			pstmt.setInt(3, endrow);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Board board = new Board();
				
				int board_num = rs.getInt("board_num");
				String board_name = rs.getString("board_name");
				String board_pass = rs.getString("board_pass"); //비밀번호 확인시 사용
				String board_subject = rs.getString("board_subject");
				String board_content = rs.getString("board_content");
//				String board_file = rs.getString(6);
//				String board_original = rs.getString(7);
				int board_re_ref = rs.getInt("board_re_ref");
				int board_re_lev = rs.getInt("board_re_lev");
				int board_re_seq = rs.getInt("board_re_seq");
//				int board_readcount = rs.getInt(11);
				String board_date = rs.getString("board_date");
				
				board.setBoard_num(board_num);
				board.setBoard_name(board_name);
				board.setBoard_pass(board_pass);
				board.setBoard_subject(board_subject);
				board.setBoard_content(board_content);
//				board.setBoard_file(board_file);
//				board.setBoard_original(board_original);
				board.setBoard_re_ref(board_re_ref);
				board.setBoard_re_lev(board_re_lev);
				board.setBoard_re_seq(board_re_seq);
//				board.setBoard_readaccount(board_readcount);
				board.setBoard_date(board_date);
				
				list.add(board);
			}
	} catch (ClassNotFoundException cnfe) {
		System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
	} catch (SQLException se) {
		System.out.println(se.getMessage());
	} finally {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		if (conn != null)
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	return list;
	}
	
	public int count() {
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		String Page_sql = "select count(*) from board";
		int count=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "board", "1234");
			
			pstmt = conn.prepareStatement(Page_sql);
			rs= pstmt.executeQuery();
			
			if (rs.next()) {
				count = rs.getInt(1);// 조회시 첫번째 컬럼의 값을 가져옵니다.
				
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("count() 에러 : " + ex);
		}	finally{
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}
		return count;
	}
	
	//댓글 삭제 부분
	public int boardDel(Board board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
			String del_sql= " delete from board "
					+ "			where	board_re_ref = ?"
					+ "			and		board_re_lev >=?"
					+ "			and		board_re_seq >=?"
					+ "			and		board_re_seq <= ("
					+ "						nvl((select min(board_re_seq )-1 "
					+ "						from	board"
					+ "						where	board_re_ref=? "
					+ "						and		board_re_lev=? "
					+ "						and		board_re_seq>?) , "
					+ "						(select max(board_re_seq) "
					+ "						from	board"
					+ "						where	board_re_ref=?))"
					+ "					)";
			
			int result= 0;
			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "board", "1234");
			pstmt = conn.prepareStatement(del_sql);
			
			pstmt.setInt(1, board.getBoard_re_ref());
			pstmt.setInt(2, board.getBoard_re_lev());
			pstmt.setInt(3, board.getBoard_re_seq());
			pstmt.setInt(4, board.getBoard_re_ref());
			pstmt.setInt(5, board.getBoard_re_lev());
			pstmt.setInt(6, board.getBoard_re_seq());
			pstmt.setInt(7, board.getBoard_re_ref());
			result = pstmt.executeUpdate();
			pstmt.close();
			
		}  catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}
		return result;
		}
	
	
	//답글 추가 부분
	public int boardReply(Board board) {
		Connection conn=null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		/*
	 		답변을 할 원문 글 그룹 번호입니다.
	 		답변을 달게 되면 답변 글은 이 번호와 같은 번호를 갖게 처리되면서
	 		같은 그룹에 속하게 됩니다. 글 목록에서 보여줄때 하난의 그룹으로 묶어서 출력됩니다.
		 */
		int re_ref= board.getBoard_re_ref();
		/*
		 	답글 깊이를 의미합니다.
		 	원문에 대한 답글이 출력될 때 한 번 들여쓰기 처리가 되고 답글에 대한 답글은 들여쓰기가 두 번 처리되게
		 	합니다. 원문인 경우에는 이 값이 0이고 원문의 답글은 1, 답글의 답글은 2가 됩니다.
		 */
		int re_lev = board.getBoard_re_lev();
		
		// 같은 관련 글 중에서 해당 글이 출력되는 순서입니다.
		int re_seq = board.getBoard_re_seq();
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"board","1234");
			
			//트랜잭션을 이용하기 위해서 setAutoCommit을 false로 설정합니다.
			conn.setAutoCommit(false);
			
			//BOARD_RE_REF, BOARD_RE_SEQ 값을 확인하여 원문 글에 다른 답글이 있으면
			//다른 답글들의 BOARD_RE_SEQ값을 1씩 증가시킵니다.
			//현재 글을 다른 답글보다 앞에 출력되게 하기 위해서 입니다.
			String  reply_sql = " update board " 
				     + "set    BOARD_RE_SEQ = BOARD_RE_SEQ + 1 " 
					 + "where  BOARD_RE_REF = ? "
				  	 + "and    BOARD_RE_SEQ > ?";
			
			pstmt = conn.prepareStatement(reply_sql);
			
			pstmt.setInt(1, board.getBoard_re_ref());
			pstmt.setInt(2, board.getBoard_re_seq());
			pstmt.executeUpdate();
			pstmt.close();
			
			//등록할 답변 글이 BOARD_RE_LEV, BOARD_RE_SEQ 값을 원문 글보다 1씩 증가시킵니다.
			++re_seq;
			++re_lev;
			
			reply_sql=  "insert into board " 
				     + "(BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,"
					 + " BOARD_CONTENT, BOARD_FILE, BOARD_RE_REF," 
				     + " BOARD_RE_LEV, BOARD_RE_SEQ,"
					 + " BOARD_READCOUNT,BOARD_DATE) " 
				     + "values(board_seq.nextval,?,?,?,?,?,?,?,?,?,sysdate)";
			
			pstmt = conn.prepareStatement(reply_sql);
			pstmt.setString(1, board.getBoard_name());
			pstmt.setString(2, board.getBoard_pass());
			pstmt.setString(3, board.getBoard_subject());
			pstmt.setString(4, board.getBoard_content());
			
			pstmt.setString(5, "");//답변에는 파일을 업로드하지 않습니다.
			
			pstmt.setInt(6, re_ref);
			//pstmt.setInt(7, board.getBoard_re_lev()+1);
			pstmt.setInt(7, re_lev);
			//pstmt.setInt(8, board.getBoard_re_seq()+1);
			pstmt.setInt(8, re_seq);
			pstmt.setInt(9,0); //board_readcount(조회수)는 0
			result = pstmt.executeUpdate();
			conn.commit(); // commit 합니다.
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("boardreply() 에러 " + ex);
			try {
				if (conn != null)
				conn.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		return result;
	}
	
	//글 수정 부분
	public int boardModify(Board modifyboard) {
		Connection conn=null;
		PreparedStatement pstmt = null;
		int result = -1;
		
		String update_sql = "update board "
				+ "set board_subject=?, board_content=? "
				+ "where board_num = ?";
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"board","1234");

			pstmt = conn.prepareStatement(update_sql);
			
			pstmt.setString(1, modifyboard.getBoard_subject());
			pstmt.setString(2, modifyboard.getBoard_content());
			pstmt.setInt(3, modifyboard.getBoard_num());
			
			result = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		return result;
	}		
	
	public Board getDetail(int num) {
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		Board board = null;
		String select_sql = "select board_num, board_name, board_pass, board_subject, board_content, "
				+ "board_re_ref, board_re_lev, board_re_seq, board_date "
				+ "from board "
				+ "where board_num = ?";
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"board","1234");
			
			pstmt = conn.prepareStatement(select_sql);
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				board = new Board();
				board.setBoard_num(rs.getInt("board_num"));
				board.setBoard_name(rs.getString("board_name"));		
				board.setBoard_pass(rs.getString("board_pass"));
				board.setBoard_subject(rs.getString("board_subject"));
				board.setBoard_content(rs.getString("board_content"));
				board.setBoard_re_ref(rs.getInt("board_re_ref"));
				board.setBoard_re_lev(rs.getInt("board_re_lev"));
				board.setBoard_re_seq(rs.getInt("board_re_seq"));
				board.setBoard_date(rs.getString("board_date"));
			} 
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		return board;
	}
}