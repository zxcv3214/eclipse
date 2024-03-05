package _2include_ex_3;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ex2_jsp/_2.include_ex_3/loginProcess")
public class loginProcess_Servlet extends jakarta.servlet.http.HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, 
		 	HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html;charset=utf-8");

		String id = request.getParameter("id");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("id", id);
		
		response.sendRedirect("template.jsp");
	}
}
