package ex21_3_insert_delete_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample6_Oracle_update {
	//10004 오라클
			//4		10004	전자사전		180000
			
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("상품코드, 제조사를 입력하세요");
			return;
		}
		Connection conn = null;
		Statement stmt = null;
		try {
			//1단계 : JDBC 드라이버 로드한다
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2단계 : DB에 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url , "scott" , "tiger");
			stmt = conn.createStatement();
			
			String single="'";
			String upd_sql="update Goodsinfo "
					+ "set maker="  + single + args [1] + single
					+ "where maker="+ single + args [0] + single;
			
			System.out.println(upd_sql +"\n");
			int rowNum = stmt.executeUpdate(upd_sql);
			System.out.println(rowNum +"행이 수정되었습니다.");
		}catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		}catch (SQLException se) {
			System.out.println(se.getMessage());
			se.printStackTrace();
		}finally {
			if(stmt != null)
				try {
					stmt.close();//4단계 : DB연결하기
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
