package ex8_emp;

import javax.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;

/*
  DAO(Data Access Object) 클래스
  - 데이터 베이스와 연동하여 레코드의 추가, 수정, 삭제 작업이 이루어지는 클래스 입니다.
 */
public class empDAO {
	public ArrayList<Emp> selectAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Emp> list = new ArrayList<Emp>();
		try {
			
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
			
			String select_sql="select * from emp";
			
			//PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(select_sql);
			rs= pstmt.executeQuery();
			
			while (rs.next()) {// 더 이상 읽을 데이터가 없을 때까지 반복\
				int empno=rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				Emp emp = new Emp();
				emp.setEmpno(empno);
				emp.setEname(ename);
				emp.setJob(job);
				emp.setMgr(mgr);
				emp.setHiredate(hiredate);
				emp.setSal(sal);
				emp.setComm(comm);
				emp.setDeptno(deptno);
				list.add(emp);
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
		//return null;
	}//selectAll() end
}//class end