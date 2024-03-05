package _7.attribute_ex_3;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class attribiteTestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public attribiteTestServlet() {
		super();
	}
	protected void doPost (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
	
	}
}
