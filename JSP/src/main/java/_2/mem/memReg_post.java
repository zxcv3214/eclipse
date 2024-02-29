package _2.mem;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet ("/ex1/_2.mem/memReg")
public class memReg_post extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1957404748329104624L;

	protected void doPost(HttpServletRequest request, 
 	HttpServletResponse response) throws ServletException, IOException{
	
		response.setContentType("text/html;charset=utf-8");
	
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String tel = request.getParameter("tel");
		String hobby = request.getParameter("hobby");
		PrintWriter out = response.getWriter();
		out.println("<HTML><body>");
		out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/memRegtable.css\">");
		out.println("<body>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>" + "회원명"+"</td>"+"<td>"+ name + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>" + "주소"+"</td>" +"<td>"+ addr + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>" + "전화번호"+ "</td>" +"<td>"+ tel + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>" + "취미"+ "</td>" + "<td>"+ hobby + "</td>");
		out.println("</tr>");
		out.println("</table>");
		out.write("</body></html>");
		out.close();
	}
}
