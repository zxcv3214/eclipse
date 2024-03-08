package ex8_emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Emp_search_DAO {

	public ArrayList<Emp> selectwhere() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Emp> list = new ArrayList<>();
		try {
			
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
			
			String select_sql = "selsct * from emp where ? = '%' + '%' ";
			
			pstmt=conn.prepareStatement(select_sql);
			
			
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				
			}
		}catch (Exception se) {
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
