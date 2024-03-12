package net.template.action;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import net.common.action.Action;
import net.common.action.ActionForward;
import net.template.db.DAO;
import net.template.db.Template_join;

public class JoinProcessAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id= request.getParameter("id");
		
		String password = request.getParameter("password");
		
		String jumin1 = request.getParameter("jumin1");
		String jumin2 = request.getParameter("jumin2");
		String jumin = jumin1 + "-" + jumin2;
		
		String email = request.getParameter("email") + "@" + request.getParameter("domain");
		String gender = request.getParameter("gender");
		
		String[] hobbys = request.getParameterValues("hobby");
		String hobby = hobbys[0];
		for (int i=1; i<hobbys.length; i++) {
			hobby +=","+ hobbys[i];
		}
		
		String post1 =request.getParameter("post1");
		String address =request.getParameter("address");
		String intro = request.getParameter("intro");
		
		Template_join join = new Template_join();
		join.setId(id); join.setPassword(password); join.setJumin(jumin);
		join.setEmail(email);join.setGender(gender);join.setHobby(hobby);
		join.setPost(post1);join.setAddress(address);join.setIntro(intro);
		
		DAO dao = new DAO();
		
		int result = dao.insert(join);
		
		HttpSession session = request.getSession();
		String message="회원가입 성공입니다.";
		if(result !=1)
			message="회원 가입 실패 입니다.";
		session.setAttribute("message", message);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("templatetest.net");
		return forward;
	}
}
