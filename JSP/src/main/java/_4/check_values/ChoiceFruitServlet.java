package _4.check_values;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.Iterator;
@WebServlet("/ex1/_4.check_values/choiceFruit")
public class ChoiceFruitServlet extends jakarta.servlet.http.HttpServlet {

	private static final long serialVersionUID = 8374838945766481451L;

	public ChoiceFruitServlet() {
		super();
	}
	protected void doGet(HttpServletRequest request, 
 	HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		/*
		 1.	getParameterValues()
		 	예) fruit=apple.png&fruit=grape.png&fruit=strawberry.png&fruit=water-melon.png
		 		하나의 파라미터 이름(fruit)으로 값이 여러 개 전송되어 올 경우에 사용하는 메서드
		 		체크 박스의 이름은 공통적으로 fruit로 지정되어 있으므로 각 체크 박스의 값으로
		 		과일 이미지 파일명을 지정하여 파라미터 값으로 과일 이미지 이름이 전송되도록 하고 있습니다.
		 2.	gerParameter()	:하나의 파라미터로 하나의 값만 오는 경우 사용하는 메서드
		 		하나의 파라미터 이름(fruit)으로 값이 여러 개 전송되어 올 경우에 이 메서드를 사용하면
		 		처음에 선택한 값만 알 수 있습니다.
		 	예)	fruit=apple.png&fruit=grape.png&fruit=strawberry.png&fruit=water-melon.png
				fruit=apple.png에서 값을 가져옵니다.
		 */	
			System.out.println("request.gerParameter(\"fruit\")) =>"+ request.getParameter("fruit"));
			String[] f = request.getParameterValues("fruit");
			
			System.out.println("==== 선택한 모드 과일 시작 ====");
			for(String fruit : f) {
				System.out.println(fruit);
			}
			System.out.println("==== 선택한 모든 과일 끝====");
			
	}

}
