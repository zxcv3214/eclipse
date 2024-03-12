package ex21_4_5_PreparendStatement_Stidemt3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Student_DAO {
	
	public int insert(Student student) { 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			//1단계 : JDBC 드라이버 로드한다
			String driver="oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			//2단계 : DB에 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url , "scott" , "tiger");
			
			String ins_sql = "insert into student "
					+ "values(student_seq.nextval,?,?,?,?,?,?, "
					+ "(select grade from hakjum "
					+ "where ? between lowscore and hiscore)"
					+ ")";
			 
			pstmt = conn.prepareStatement(ins_sql);
			pstmt.setString(1, student.getName());
			pstmt.setInt(2, student.getKor());
			pstmt.setInt(3, student.getMath());
			pstmt.setInt(4, student.getEng());
			pstmt.setInt(5, student.getTot());
			pstmt.setFloat(6, student.getAvg());
			pstmt.setFloat(7, student.getAvg());
			
			result = pstmt.executeUpdate();
			System.out.println(result + "행이 추가되었습니다.");
			
		}  catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		}catch (SQLException se) {
			System.out.println(se.getMessage());
		}finally {
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
		return result;
	}
	public ArrayList<Student> selectAll() {
		ArrayList<Student> list = new ArrayList<>();
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
			
			String sel_all= "select * from student order by no";
			System.out.println(sel_all);
			
			pstmt = conn.prepareStatement(sel_all);
			rs= pstmt.executeQuery();
			
			while (rs.next()) {
				Student student = new Student();
				
				int no = rs.getInt(1);
				String name = rs.getString(2);
				int kor = rs.getInt(3);
				int math = rs.getInt(4);
				int eng = rs.getInt(5);
				int tot = rs.getInt(6);
				Float avg = rs.getFloat(7);
				String grade = rs.getString(8);
				
				student.setNo(no);
				student.setName(name);
				student.setKor(kor);
				student.setMath(math);
				student.setEng(eng);
				student.setTot(tot);
				student.setAvg(avg);
				student.setGrade(grade);
				
				list.add(student);
				
			}
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		return list;
		
	}
}

	


