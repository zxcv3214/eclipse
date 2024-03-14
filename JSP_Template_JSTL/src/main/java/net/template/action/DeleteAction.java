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

public class DeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		DAO dao = new DAO();
		
		
		int result = dao.delete(id);
		String message = "삭제 실패입니다.";
		if(result ==1) {
			message = "삭제 성공입니다.";
		}
		System.out.println(message);
		HttpSession session = request.getSession();
		session.setAttribute("message", session);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/template/list.jsp");
		return forward;
	}

}
