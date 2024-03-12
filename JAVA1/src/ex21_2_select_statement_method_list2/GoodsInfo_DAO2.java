package ex21_2_select_statement_method_list2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodsInfo_DAO2 {

	public List<Map<String, Object>> select() {
	//Map<String, Object> map = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<>();
		
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs=null;
	try {
		
		//1단계 : JDBC 드라이버 로드한다
		String driver="oracle.jdbc.driver.OracleDriver";
		Class.forName(driver);
		
		//2단계 : DB에 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		conn = DriverManager.getConnection(url , "scott" , "tiger");
		
		stmt = conn.createStatement();
		
		String select_sql="select * from goodsInfo";
		
		rs= stmt.executeQuery(select_sql);
		
		while (rs.next()) {//더 이상 읽을 데이터가 없을 때까지 반복
		
			Map<String, Object> h = new HashMap<>();
			
			h.put("code",rs.getString("code"));
			
			h.put("name",rs.getString("name"));
			
			h.put("price",rs.getInt("price"));
			
			h.put("maker",rs.getString("maker"));

			list.add(h);
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
	return list;
	}
}
