package net.board.action;

import java.io.IOException;
import java.io.PrintWriter;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.board.db.BoardBean;
import net.board.db.BoardDAO;
import net.common.action.Action;
import net.common.action.ActionForward;

public class BoardModifyProcessAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BoardDAO boarddao = new BoardDAO();
		BoardBean boarddata = new BoardBean();
		ActionForward forward = new ActionForward();
			
		String saveFolder = "boardupload";
		
		int fileSize = 5 * 1024 * 1024; //업로드할 파일의 최대 사이즈입니다. 5MB
		
		//실제 저장 경로를 저장합니다. 
		ServletContext sc = request.getServletContext();
		String realFolder = sc.getRealPath(saveFolder);
		System.out.println("realFolder= " + realFolder);
		try {
			MultipartRequest multi = 
					new MultipartRequest (request, realFolder, fileSize, "utf-8",
										new DefaultFileRenamePolicy());
		
			int num = Integer.parseInt(multi.getParameter("board_num"));
			String pass = multi.getParameter("board_pass");
			
			//글쓴이 인지 확인하기 위해 저장된 비밀번호와 입력한 비밀번호를 비교합니다.
			boolean usercheck = boarddao.isBoardWriter(num, pass);
			System.out.println(usercheck);
			//비밀번호가 다른 경우
			if (!usercheck) {
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('비밀번호가 다릅니다.');");
				out.println("history.back();");
				out.println("</script>");
				out.close();
				return null;
			}
			//비밀번호가 일치하는 경우 수정 내용을 설정합니다.
			// BoardBean 객체에 글 등록 폼에서 입력 받은 정보들을 저장합니다.
			boarddata.setBoard_num(num);
			boarddata.setBoard_subject(multi.getParameter("board_subject"));
			boarddata.setBoard_content(multi.getParameter("board_content"));
			
			String check = multi.getParameter("check");
			System.out.println("check=" + check);
			if(check != null) { //파일첨부를 변경하지 않으면
				boarddata.setBoard_file(check);
			}else {
				//업로드된 파일의 시스템 상에 업로드된 실제 파일명을 얻어 옵니다.
				String filename = multi.getFilesystemName("board_file");
				boarddata.setBoard_file(filename);
			}
			
			//DAO에서 수정 메서드 호출하여 수정합니다.
			boolean result = boarddao.boardModify(boarddata);
			
			//수정에 실패한 경우
			if(!result) {
				System.out.println("게시판 수정 실패");
				forward.setRedirect(false);
				request.setAttribute("message", "게시판 수정이 되지 않았습니다.");
				forward.setPath("error/error.jsp");
			}else {
				//수정 성공의 경우
				System.out.println("게시판 수정 완료");
				forward.setRedirect(true);
				//수정한 글 내용을 보여주기 위해 글 내용 보기 페이지로 이동하기위해 경로를 설정합니다.
				forward.setPath("BoardDetail.bo?num=" + boarddata.getBoard_num());
			}
		return forward;
		} catch (IOException e) {
			e.printStackTrace();
			forward.setPath("error/error.jsp");
			request.setAttribute("message", "게시판 업로드 중 실패입니다.");
			forward.setRedirect(false);
			return forward;
		}
	}
}