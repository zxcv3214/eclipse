package ex8;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class searchServlet extends HttpServlet {

	private static final long serialVersionUID = 3L;
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		searchDAO dao = new searchDAO();
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		ArrayList<Dept> list  = dao.selectwhere(deptno);
		RequestDispatcher dispatcher
		= request.getRequestDispatcher("/ex8_db/_2.list/list.jsp");
		request.setAttribute("list",list);
	dispatcher.forward(request, response);
	}
}
