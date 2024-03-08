package ex8;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dept_search")
public class Dept_search extends HttpServlet{
	private static final long serialVersionUID = 3L;
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		RequestDispatcher dispatcher
		= request.getRequestDispatcher("/ex8_db/_3.search/iuput.jsp");
	dispatcher.forward(request, response);
	}
}
