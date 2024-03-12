package ex21_4_5_PreparendStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample4_Oracle_Update_input {
	//코드 10001의 제조사를 HTA로 변경해 보세요
	//"10001" "HTA"
	public static void main(String[] args) {
		if(args.length != 2) { 
			System.out.println("상품코드,제조사 입력하세요");
			return;
		}
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			//1단계 : JDBC 드라이버 로드한다
			String driver="oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			//2단계 : DB에 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url , "scott" , "tiger");
			
			String upd_where_sql="update goodsinfo set maker=? where code=?";
			
			pstmt = conn.prepareStatement(upd_where_sql);
			
			pstmt.setString(1, args[1]);
			pstmt.setString(2, args[0]);
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum + "행이 수정되었습니다.");
	
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		}catch (SQLException se) {
			System.out.println(se.getMessage());
		}finally {
			if(rs != null)
				try {
					rs.close();//4단계 : DB연결하기
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if(pstmt != null)
				try {
					pstmt.close();//4단계 : DB연결하기
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if(conn != null)
				try {
					conn.close();//4단계 : DB연결하기
				} catch (SQLException e) {
					System.out.println(e.getMessage());
			}
		}//finally end
	}
}