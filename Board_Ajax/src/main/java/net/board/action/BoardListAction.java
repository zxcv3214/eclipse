package net.board.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.board.db.BoardBean;
import net.board.db.BoardDAO;
import net.common.action.Action;
import net.common.action.ActionForward;

public class BoardListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		BoardDAO boarddao = new BoardDAO();
		List<BoardBean> boardlist = new ArrayList<BoardBean>();
		
		//로그인 성공시 파라미터 page가 없다. 그래서 초기값이 필요하다.
		int page=1; //보여줄 페이지
		int limit=10; //한 페이지에 보여줄 게시판 목록의 수
		if (request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		System.out.println("넘어온 page ="+page);
		
		//추가
		if (request.getParameter("limit") != null) {
			limit = Integer.parseInt(request.getParameter("limit"));
		}
		System.out.println("넘어온 limit =" + limit);
		
		//총 리스트 수를 받아 온다
		int listcount = boarddao.getListCount();
		
		//리스트를 받아온다.
		boardlist = boarddao.getBoardList(page, limit);
		
		/*
		 * 총 페이지 수
		 * =(DB에 저장된 총 리스트의 수 + 한 페이지에 보여주는 리스트의 수 - 1)/한 페이지에서 보여주는 리스트의 수
		 * 
		 * eg)한 페이지에서 보여주는 리스트의 수가 10개인 경우
		 * 1) DB에 저장된 총 리스트의 수가 0이면 총 페이지수는 0
		 * 2) DB에 저장된 총 리스트의 수가 ( 1~10)이면 총 페이지수는 1
		 * 3) DB에 저장된 총 리스트의 수가 (11~20)이면 총 페이지수는 2
		 * 4) DB에 저장된 총 리스트의 수가 (21~30)이면 총 페이지수는 3
		 */
		int maxpage = (listcount + limit - 1) / limit;
		System.out.println("총 페이지수 =" + maxpage);
		
		/*
		 * startpage : 현재 페이지 그룹에서 맨 처음에 표시될 페이지 수를 의미한다.
		 * ([1], [11], [21] 등..) 보여줄 페이지가 30개일 경우
		   [1][2][3]...[30]까지 다 표시하기에는 너무 많기 때문에 보통 한 페이지에는
		   10페이지 정도까지 이동할 수 있게 표시한다.
		 * 예) 페이지 그룹이 아래와 같은 경우
		      [1][2][3][4][5][6][7][8][9][10]
		 * 페이지그룹의 시작 페이지는 startpage에 마지막 페이지는 endpage에 구한다.
		 * 예로 1~10페이지의 내용을 나타낼때는 페이지 그룹은 [1][2][3]...[10]로 표시되고
		 * 11~20페이지의 내용을 나타낼때는 페이지 그룹은 [11][12][13]...[20]까지 표시된다.
		 */
		int startpage = ((page - 1) / 10) * 10 + 1;
		System.out.println("현재 페이지에 보여줄 시작 페이지 수 :" + startpage);
		
		//endpage : 현재 페이지 그룹에서 보여줄 마지막 페이지 수([10], [20], [30] 등...)
		int endpage = startpage + 10 - 1;
		System.out.println("현재 페이지에 보여줄 마지막 페이지 수 :" + endpage);
		
		/*
		 * 마지막 그룹의 마지막 페이지 값은 최대 페이지 값이다.
		 * 예로 마지막 페이지 그룹이 [21]~[30]인 경우
		 * 시작페이지는 21(startpage=21)와 마지막페이지는 30(endpage=30)이지만
		 * 최대페이지(maxpage)가 25라면 [21]~[25]까지만 표시되도록 한다.
		 */
		if (endpage > maxpage)
			endpage=maxpage;
		
		String state = request.getParameter("state");
		
		if (state == null) {
			System.out.println("state==null");
			request.setAttribute("page", page); //현재 페이지 수
			request.setAttribute("maxpage", maxpage); //최대 페이지 수
			
			//현재 페이지에 표시할 첫 페이지 수
			request.setAttribute("startpage", startpage);
			
			//현재 페이지에 표시할 끝 페이지 수
			request.setAttribute("endpage", endpage);
			
			//총 글의 수
			request.setAttribute("listcount", listcount);
			
			//해당 페이지의 글 목록을 갖고 있는 리스트
			request.setAttribute("boardlist", boardlist);
			
			request.setAttribute("limit", limit);
			
			ActionForward forward = new ActionForward();
			forward.setRedirect(false);
			
			//글 목록 페이지로 이동하기 위해 경로를 설정한다.
			forward.setPath("board/boardList.jsp");
			return forward; //BoardFrontController.java로 리턴된다.
		} else {
			System.out.println("state=ajax");
			
			//위에서 request로 담았던 것을 JsonObejct에 담는다.
			JsonObject object = new JsonObject();
			object.addProperty("page", page); //{"page" : 변수 page의 값} 형식으로 저장
			object.addProperty("maxpage", maxpage);
			object.addProperty("startpage", startpage);
			object.addProperty("endpage", endpage);
			object.addProperty("listcount", listcount);
			object.addProperty("limit", limit);
			
			//JsonObject에 List 형식을 담을 수 있는 addProperty()가 존재하지 않는다.
			//void com.google.gson.JsonObject.add(String property, JsonElement value)
			//메소드를 통해서 List형식을 JsonElement로 바꾸어 주어야 object에 저장할 수 있다.
			
			//List -> JsonElement
			JsonElement je = new Gson().toJsonTree(boardlist);
			System.out.println("boardlist="+je.toString());
			object.add("boardlist", je);
			
			response.setContentType("application/json;charset=utf-8");
			response.getWriter().print(object);
			System.out.println(object.toString());
			return null; //Ajax 형식으로 보낼 거니까 여기서는 ActionForward객체를 생성하지 않는다
		} // else end
	}//execute end
}//class end
