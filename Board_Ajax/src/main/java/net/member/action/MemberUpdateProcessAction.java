package net.member.action;

import java.io.IOException;
import java.io.PrintWriter;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.common.action.Action;
import net.common.action.ActionForward;
import net.member.db.Member;
import net.member.db.MemberDAO;

public class MemberUpdateProcessAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String realFolder = "";
		
		//webapp아래에 꼭 폴더 생성하기
		String saveFolder = "memberupload";
		
		int fileSize = 5 * 1024 * 1024;// 업로드할 파이의 최대 사이즈입니다. 5MB
		
		//실제 저장 경로로 지정합니다.
		ServletContext sc = request.getServletContext();
		realFolder = sc.getRealPath(saveFolder);
		System.out.println("realFolder=[ " + realFolder);
		try {
			MultipartRequest multi = new MultipartRequest(request, realFolder, fileSize, "utf-8",
					new DefaultFileRenamePolicy());
					
			String id = multi.getParameter("id");
			//String pass = multi.getParameter("pass");
			String name= multi.getParameter("name");
			int age = Integer.parseInt(multi.getParameter("age"));
			String gender = multi.getParameter("gender");
			String email = multi.getParameter("email");
			
			String memberfile = multi.getFilesystemName("memberfile");
			System.out.println("memberfile=" + memberfile);
			
			Member m = new Member();
			m.setAge(age);		m.setEmail(email);		m.setGender(gender);
			m.setId(id);		m.setName(name);		//m.setPassword(pass);
			m.setMemberfile(memberfile);
			
			if(memberfile != null) {	//파일을 선택할 경우
				m.setMemberfile(memberfile);
			}else {
				m.setMemberfile(multi.getParameter("check"));
			}
			
			MemberDAO mdao = new MemberDAO();
			int result = mdao.update(m);
			
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			// 삽입이 된 경우
			if (result == 1) {
				out.println("alert('수정되었습니다.');");
				out.println("location.href='BoardList.bo';");
			} else {
				out.println("alert('회원 정보 수정에 실패했습니다.');");
				out.println("history.back()");
			}
			out.println("</script>");
			out.close();
			return null;
			
		} catch (IOException ex) {
			ex.printStackTrace();
			ActionForward forward = new ActionForward();
			forward.setPath("error/error.jsp");
			request.setAttribute("message", "프로필 사진 업로드 실패입니다.");
			forward.setRedirect(false);
			return forward;
		}// catch end
	}//execute end
}
