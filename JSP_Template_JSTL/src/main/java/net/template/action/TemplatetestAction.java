package net.template.action;

import java.io.IOException;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.common.action.Action;
import net.common.action.ActionForward;

public class TemplatetestAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pagefile = request.getParameter("page");
		if (pagefile == null) {
			pagefile = "newitem";
		}
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		request.setAttribute("pagefile", pagefile);
		forward.setPath("template/templatetest.jsp");
		return forward;
		
	}
	
}
