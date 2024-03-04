package _9.context;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

/*  실행방법
 	1. 크롬에서 실행
 	http://localhost:8088/JSP/ex1/_9.context/input.jsp
 	2. 크롬을 제외한 다른 브라우저에서 실행
 	http://localhost:8088/JSP/ex1/_9.context/scope.jsp
 */
@WebServlet("/ex1/_9.context/context")
public class contextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public contextServlet() {
		super();
	}
	/*	페이지 이동
		- Redirect 방식 : 이동할 때 브라우저의 주소 표시줄의 URL이 변경 되므로 요청이 바뀌게 됩니다.
		- 이동한 JSP페이지에서는 서블릿에서 request 영역의 속성 값에 접근할 수 없습니다.
	 */
	protected void doGet (HttpServletRequest request, HttpServletResponse response)
							throws ServletException, IOException {

	String value = request.getParameter("food");
	request.setAttribute("food", value); //request 객체에 저장합니다.
	
	HttpSession session = request.getSession();
	session.setAttribute("food", value); //session 객체에 저장합니다.
	
	/*
	  웹 애플리케이션이 서비스되고 있는 동안 유지하는 것을 의미합니다.
	  생명주기가 웹 어플리케이션과 같은 객체는 ServletContext 입니다.
	  ServletContext는 웹 애플리케이션 서비스가 시작될 때 생성되고 종료될 때 소멸합니다.
	 */
	ServletContext sc = request.getSession().getServletContext();
	sc.setAttribute("food", value);
	
	response.sendRedirect("scope.jsp");
	}
}