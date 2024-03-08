package ex8_emp;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/emp_select")
public class EMP_select extends HttpServlet{
	private static final long serialVersionUID = 2L;

	protected void doGet (HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		empDAO dao = new empDAO();
		ArrayList<Emp> list  = dao.selectAll();
		RequestDispatcher dispatcher
			= request.getRequestDispatcher("/ex8_db/_2.list/list2.jsp");
		request.setAttribute("list",list);
		dispatcher.forward(request, response);	
	}
}
