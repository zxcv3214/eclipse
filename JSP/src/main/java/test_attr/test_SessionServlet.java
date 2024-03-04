package test_attr;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;


@WebServlet("/ex1/test_attr/test_SessionServlet")
public class test_SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public test_SessionServlet() {
		super();
	}
	/*	페이지 이동
		- Redirect 방식 : 이동할 때 브라우저의 주소 표시줄의 URL이 변경 되므로 요청이 바뀌게 됩니다.
		- 이동한 JSP페이지에서는 서블릿에서 request 영역의 속성 값에 접근할 수 없습니다.
	 */
	protected void doGet (HttpServletRequest request, HttpServletResponse response)
							throws ServletException, IOException {
	
	response.setContentType("text/html;charset=utf-8");
	
	//request.getSession() : 세션 객체를 가져 옵니다.
	HttpSession session = request.getSession();
	
	String value = request.getParameter("food");
	request.setAttribute("food", value); //request 객체에 저장합니다.
	session.setAttribute("food", value); //session 객체에 저장합니다.
	
	response.sendRedirect("daum.jsp");
	}
}