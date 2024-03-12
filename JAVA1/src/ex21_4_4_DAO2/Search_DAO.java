package ex21_4_4_DAO2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Search_DAO {

	public ArrayList<Emp2> search(int col_index, String search_word) {
		ArrayList<Emp2> list = new ArrayList<>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs=null;
		String column_name[] = {"empno","ename","job","mgr","hiredate","sal","comm","deptno"};
		
		String sql ="select * from emp ";		

		if (col_index != 8) {//8은 종료의 의미
			String single = "";
			
			if(col_index ==1 || col_index == 2 || col_index ==4)
				single = "'";
			
			sql = sql + "where " + column_name[col_index] + "="
					+ single + search_word + single;
		}
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url , "scott" , "tiger");
			stmt = conn.createStatement();
			
			rs= stmt.executeQuery(sql);
			
			while (rs.next()) {
				Emp2 e = new Emp2();
				int empno = rs.getInt("empno");
				e.setEmpno(empno);
				
				String ename =rs.getString("ename");
				e.setEname(ename);
				
				String job = rs.getString("job");
				e.setJob(job);
				
				int mgr = rs.getInt("mgr");
				e.setMgr(mgr);
				
				Date hiredate = rs.getDate("hiredate");
				e.setHiredate(hiredate);
				
				int sal = rs.getInt("sal");
				e.setSal(sal);
				
				int comm = rs.getInt("comm");
				e.setComm(comm);
				
				int deptno = rs.getInt("deptno");
				e.setDeptno(deptno);
				
				list.add(e);
				
			}
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		}catch (SQLException se) {
			System.out.println(se.getMessage());
		}finally {
			if(rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if(stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
			}
		}//finally end
		return list;	
		}

}
