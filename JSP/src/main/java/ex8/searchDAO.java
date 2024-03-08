package ex8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class searchDAO {
	public ArrayList<Dept> selectwhere(int inputdeptno) {
		Connection conn =null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		ArrayList<Dept> list = new ArrayList<>();
		try {
			
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
			
			String select_sql="select * from dept where deptno=?";
			
			//PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(select_sql);
			pstmt.setInt(1, inputdeptno);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
			int deptno = rs.getInt("deptno");
			String dname= rs.getString("dname");
			String loc = rs.getString("loc");
			
			Dept dept =new Dept();
			
			dept.setDeptno(deptno);
			dept.setDname(dname);
			dept.setLoc(loc);
			list.add(dept);
			/*
			  ResulSet 객체로부터 select문의 실행 결과를 얻기 위해서는 먼저 next() 메서드를 호출해야 합니다.
			  rs.next() - 다음 행 위치로 이동하는 메소드 리턴값은 boolean으로 실제로 행을 읽어 왔는지 여부입니다.
			 */
			}
		} catch (Exception se) {
			se.printStackTrace();
		}finally {
			if (rs !=null)
				try {
					rs.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if(pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if(conn != null)
				try {
					conn.close();	//4단계 : DB연결을 끊는다.
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}	// finally
		return list;
	}
}