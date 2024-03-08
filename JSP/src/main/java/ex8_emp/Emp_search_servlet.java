package ex8_emp;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Emp_search_servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet (HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Emp_search_DAO dao = new Emp_search_DAO();
		ArrayList<Emp> list = dao.selectwhere();
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ex8_db/_2.list.emp/list.jsp");
		request.setAttribute("list",list);
		dispatcher.forward(request, response);
	}
}
