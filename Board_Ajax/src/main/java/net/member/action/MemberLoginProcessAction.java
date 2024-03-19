package net.member.action;

import java.io.IOException;
import java.io.PrintWriter;
import net.member.db.MemberDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import net.common.action.Action;
import net.common.action.ActionForward;

public class MemberLoginProcessAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ActionForward forward = new ActionForward();
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		MemberDAO mdao = new MemberDAO();
		int result = mdao.isId(id, pass);
		System.out.println("결과는 " + result);
		
		//로그인 성공
		if (result == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			
			String IDStore = request.getParameter("remember");
			Cookie cookie = new Cookie("id", id);
			
			//ID 기억하기를 체크한 경우
			if (IDStore != null && IDStore.equals("store")) {
				//cookie.setMaxAge(60*60*24); //쿠키의 유효시간을 24시간으로 설정한다.
				cookie.setMaxAge(2 * 60);
				//클라이언트로 쿠키 전송
				response.addCookie(cookie);
				System.out.println("쿠키확인");
			} else {
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
			
			forward.setRedirect(true);
			forward.setPath("BoardList.bo");
			return forward;
		} else {
			String message = "비밀번호가 일치하지 않습니다.";
			if (result == -1)
				message = "아이디가 존재하지 않습니다.";
			
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print("<script>");
			out.print("alert('"+message+"');");
			out.print("location.href='login.net';");
			out.print("</script>");
			out.close();
			return null;
		}
	}
}