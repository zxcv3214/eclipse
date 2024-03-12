package ex21_4_4_DAO1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Emp_DAO1 {

	public ArrayList<Emp> selectAll() {
		ArrayList<Emp> list = new ArrayList<>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url , "scott" , "tiger");
			stmt = conn.createStatement();
			
			String sql = "select * from emp";
			
			rs= stmt.executeQuery(sql);
			
			while (rs.next()) {
				Emp e = new Emp();
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
