package _2include_ex_3;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ex2_jsp/_2.include_ex_3/logout")
public class logoutProcess_Servlet extends jakarta.servlet.http.HttpServlet {

	private static final long serialVersionUID = 2L;

	protected void doGet(HttpServletRequest request, 
		 	HttpServletResponse response) throws ServletException, IOException{
		
		HttpSession session = request.getSession();
		session.invalidate();//세션의 모든 속성 삭제합니다.
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("alert('로그아웃 되었습니다.')");
		out.println("location.href='template.jsp';");
		out.println("</script>");
		out.close();
		
	}
}