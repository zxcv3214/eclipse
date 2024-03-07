package test_attr;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;


@WebServlet("/ex4_layout/bootstap/send")
public class test_sendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public test_sendServlet() {
		super();
	}
	/*	페이지 이동
		- Redirect 방식 : 이동할 때 브라우저의 주소 표시줄의 URL이 변경 되므로 요청이 바뀌게 됩니다.
		- 이동한 JSP페이지에서는 서블릿에서 request 영역의 속성 값에 접근할 수 없습니다.
	 */
	protected void doPost (HttpServletRequest request, HttpServletResponse response)
							throws ServletException, IOException {
	
	response.setContentType("text/html;charset=utf-8");
	
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	String jumin1 = request.getParameter("jumin1");
	String jumin2 = request.getParameter("jumin2");

	String gender = request.getParameter("gender");
	String gender_result = "남자";
	if(gender.equals("f")) {
		gender_result = "여자";
	}
	String hobby[] =request.getParameterValues("hobby");
	String hobby_result = "";
	for(int num = 0; num < hobby.length; num++) {
		hobby_result += hobby[num]+" ";
	}	
	String email = request.getParameter("email");
	String domain = request.getParameter("domain");
	
	String post1 = request.getParameter("post1");
	String address = request.getParameter("address");
	String intro = request.getParameter("intro");
	
	request.setAttribute("id", id);
	request.setAttribute("pass", pass);
	request.setAttribute("jumin", jumin1 + "-" + jumin2);
	request.setAttribute("gender", gender_result);
	request.setAttribute("hobby", hobby_result);
	request.setAttribute("email", email + "@" + domain);
	request.setAttribute("post1", post1);
	request.setAttribute("address", address);
	request.setAttribute("intro", intro);

	//http://localhost:8088/Jsp/esnd
	//http://localhost:8088/Jsp/ex1/test_attr/view.jsp
	RequestDispatcher dispatcher = request.getRequestDispatcher("/ex1/test_attr/result.jsp");
	//이동합니다.
	dispatcher.forward(request, response);
	}
}