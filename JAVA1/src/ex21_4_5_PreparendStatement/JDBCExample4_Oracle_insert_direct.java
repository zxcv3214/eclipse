package ex21_4_5_PreparendStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCExample4_Oracle_insert_direct {
	public static void main(String[] args) {
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
			
			/*
			  1. 직접 데이터를 입력하는 경우
			  insert into goodsinfo
			  values('A5000','키보드',300,'손의나라')
			 */
			String sql="insert into goodsinfo "
					+ "values(?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "A5000");
			pstmt.setString(2, "키보드");
			pstmt.setInt(3, 300);
			pstmt.setString(4, "손의나라");
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum + "행이 추가되었습니다.");
			
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