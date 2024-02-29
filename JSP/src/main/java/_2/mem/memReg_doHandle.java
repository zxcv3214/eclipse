package _2.mem;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

public class memReg_doHandle extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1957404748329104624L;

	protected void doPost(HttpServletRequest request, 
 			  HttpServletResponse response) throws ServletException, IOException{
		doHandle(request, response);
	}
	
	protected void doGet(HttpServletRequest request, 
 			  HttpServletResponse response) throws ServletException, IOException{
		doHandle(request, response);
	}
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		
	}
}
