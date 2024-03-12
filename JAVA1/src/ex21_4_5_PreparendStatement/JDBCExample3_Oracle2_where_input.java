package ex21_4_5_PreparendStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample3_Oracle2_where_input {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("상품명 입력하세요.");
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
			
			String sel_where_sql="select * "
					+ "from goodsinfo where name=?";
			
			pstmt = conn.prepareStatement(sel_where_sql);
			
			pstmt.setString(1, args[0]);
			rs= pstmt.executeQuery();
			
			System.out.println("번호\t코드\t이름\t가격\t브랜드");
			System.out.println("--------------------------------------");
			
			int i = 0;
			while (rs.next()) {//더 이상 읽을 데이터가 없을 때까지 반복
				String code = rs.getString("code");
				
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