package _6.getJSON;

import java.io.IOException;

import com.google.gson.JsonObject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/get_name_lib")
public class Get_name_lib extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doGet (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException { response.setContentType("application/json;charset=utf-8");
		
		JsonObject json = new JsonObject();
		json.addProperty("name","홍길동2");
		
		System.out.println(json.toString());
		response.getWriter().print(json.toString());
	}
}
