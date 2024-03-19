package net.board.action;

import java.io.IOException;
import net.common.action.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.bo")
public class BoardFrontController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doProcess(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException {
		System.out.println("요청 주소: " + request.getRequestURL());
/*
 * 요청된 전체 URL 중에서 포트 번호 다음부터 마지막 문자열까지 반환된다.
 * eg) httt://localhost:8088/JspProject/BoardList.bo인 경우
 * 	   "/JspProject/BoardList.bo" 반환된다.
 */
		String RequestURI = request.getRequestURI();
		System.out.println("RequestURI = " + RequestURI);
		
		//getContextPath() : 컨텍스트 경로가 반환된다.
		//contextPath는 "/JspProject"가 반환된다.
		String contextPath = request.getContextPath();
		System.out.println("contextPath = " + contextPath);
		
		//RequestURI에서 컨텍스트 경로 길이 값의 인덱스 위치의 문자부터
		//마지막 위치의 문자까지 추출한다
		//command는 "/BoardList.bo" 반환된다
		String command = RequestURI.substring(contextPath.length());
		System.out.println("command = " + command);
		
		//초기화
		ActionForward forward = null;
		Action action = null;
		
		switch (command) {
			case "/BoardList.bo":
				action = new BoardListAction();
				break;
			case "/BoardWrite.bo":
				action = new BoardWriteAction();
				break;
			case "/BoardAddAction.bo":
				action = new BoardAddAction();
				break;
			case "/BoardDetail.bo" :
				action = new BoardDetailAction();
				break;			
			case "/BoardModify.bo" :
				action = new BoardModifyAction();
				break;
			case "/BoardModifyProcess.bo" :
				action = new BoardModifyProcessAction();
				break;
		} //switch (command)
		
		forward = action.execute(request, response);
		
		if (forward != null) {
			if (forward.isRedirect()) {//리다이렉트 된다.
				response.sendRedirect(forward.getPath());
			} else { //포워딩된다.
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}//if (forward != null)
	} //doProcess
	
	//doProcess(request,response)메소드를 구현하여 요청이 GET방식이든
	//POST방식으로 전송되어 오든 같은 메소드에서 요청을 처리할 수 있도록 작업
	protected void doGet(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
}