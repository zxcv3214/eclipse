package net.common.action;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public interface Action {
	public ActionForward execute(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException;
}
