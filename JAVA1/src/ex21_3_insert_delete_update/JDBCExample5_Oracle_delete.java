//데이터베이스의 테이블에 데이터를 추가하는 프로그램
//executeUpdate 메소드 사용
package ex21_3_insert_delete_update;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample5_Oracle_delete {

	public static void main(String[] args) {
		if(args.length != 1) {//"A2000"
			System.out.println(
					"상품코드를 입력하세요");
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

			String sigle="'";
			String del_sql = "delete from Goodsinfo where code="+sigle + args[0] +sigle+"";
			
			System.out.println(del_sql+"\n");
			/*
			 	INSERT, UPDATE, DEETE 문을 실행하는 메소드는 executeUpdate()입니다.
			 	executeUpdate()의 리턴값은 INSERT,UPDATE,DELETE 수행 된 row의 수입니다.
			 */
			int rowNum = stmt.executeUpdate(del_sql);
			System.out.println(rowNum + "행이 삭제되었습니다.");	
		} catch (ClassNotFoundException cnfe) {
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