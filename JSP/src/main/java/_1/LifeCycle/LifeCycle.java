package _1.LifeCycle;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet(urlPatterns= {"/LifeCycle","/a"})
public class LifeCycle extends jakarta.servlet.http.HttpServlet{

	private static final long serialVersionUID = 1284214465161685088L;
	public LifeCycle() {
		super();
		System.out.println("저는 생성자 입니다.~~");
	}
	
	public void init() throws ServletException {
		System.out.println("저는 init() 입니다.");
	}
	
	public void destroy() {
		System.out.println("저는 destroy()3 입니다.");
	}
	public void service(HttpServletRequest request,
						HttpServletResponse response) 
						throws ServletException, IOException{
		System.out.println("저는 service() 입니다.");
		System.out.println("요청 주소 " + request.getRequestURL());
	}
}
