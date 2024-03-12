package ex21_2_select_statement_method_list3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCExample2_Oracle2_colum_index_input {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명을 입력해주세요.");
		String search= sc.nextLine();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs=null;
		try {
			//1단계 : JDBC 드라이버 로드한다
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계 : DB에 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url , "scott" , "tiger");
			stmt = conn.createStatement();
			
			String sel_where_sql=
					"select code name,price,maker from goodsinfo where name='" +search +"'";
			
			rs= stmt.executeQuery(sel_where_sql);
			
			System.out.println("번호\t코드\t상품명\t\t가격\t브랜드");
			System.out.println("----------------------------------------------");
			
			/*
			 ResultSet 객체로부터 select문의 실행 결과를 얻기 위해서는 먼저 next() 메소드를 호출해야합니다.
			 rs.next() - 다음 행 위치로 이동하는 메소드
			 			 리턴값은 boolean으로 실제로 행을 읽어 왔는지 여부
			 */
			int i = 0;
			while (rs.next()) {//더 이상 읽을 데이터가 없을 때까지 반복
				//getInt("컬럼명") : 컬럼 값을 int 형으로 리턴하는 메소드
				String code = rs.getString("code");
				
				//getString("컬럼명") : 컬럼 값을 String 형으로 리턴하는 메소드
				String name= rs.getString("name");
				
				int price = rs.getInt("price");
				
				String maker = rs.getString("maker");
			
				System.out.printf("%d\t%-7s\t%-10s\t%d\t%-5s\n",
							++i,code,name,price,maker);
			}
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