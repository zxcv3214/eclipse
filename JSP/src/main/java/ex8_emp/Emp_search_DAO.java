package ex8_emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Emp_search_DAO {

	public ArrayList<Emp> selectwhere(int field, String search_word) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Emp> list = new ArrayList<>();
		try {
			
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
			
			String field_name[] = {"empno", "ename", "job" , "mgr", "to_char(hiredate,'yyyy-mm-dd')","sal", "comm", "deptno"};
			String select_sql = "select * from emp where " + field_name[field]+ " like ?";
			
			System.out.println(select_sql);
			//prepareStatement객체 얻어오기
			pstmt=conn.prepareStatement(select_sql);
			pstmt.setString(1,"%"+ search_word+"%");
			rs=pstmt.executeQuery();
			
			//컬럼으로 가져오는 방식을 통해 1번부터 순서대로 가져온다.
			while (rs.next()) {
				int empno= rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				
				Emp st = new Emp();
				st.setEmpno(empno);
				st.setEname(ename);
				st.setJob(job);
				st.setMgr(mgr);
				st.setHiredate(hiredate);
				st.setSal(sal);
				st.setComm(comm);
				st.setDeptno(deptno);
				list.add(st);
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
