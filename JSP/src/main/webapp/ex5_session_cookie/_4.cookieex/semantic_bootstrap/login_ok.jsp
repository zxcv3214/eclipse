<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>login_ok</title>
</head>
<body>
	<%
		//입력한 아이디 비밀번호를 가져옵니다.
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String remember = request.getParameter("remember");
		
		//web.xml에 설정한 값을 가져옵니다.
		String xmlid = application.getInitParameter("id");
		String xmlpass= application.getInitParameter("pass");
		//web.xml에서 가져온 값과 입력한 값을 비교
		if(xmlid.equals(id) && xmlpass.equals(pass)) {
			session.setAttribute("id",id);	
	%>
		<script>
			alert('<%=id%>님 환영합니다.');
			location.href = "templatetest.jsp";
		</script>
	<%	
		//쿠키 객체로 생성하고 cookie이라는 쿠키 이름에
		//입력받은 cookie설정 값을 저장합니다.
		Cookie cookie = new Cookie("id" ,id);
		if (remember != null && remember.equals("store")) {
			cookie.setMaxAge(2*60);//쿠키의 유효시간을 설정합니다.(단위는 초)
			response.addCookie(cookie);//클라이언트로 쿠키값을 전송합니다.
		} else {
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
	%>
	<%
	}  else if (id.equals(xmlid)) {
	%>
		<script>
			alert("비밀번호를 확인하세요.");
			history.back();
		</script> 
		<%
	} else {
		%>
	<script>
			alert("아이디를 확인하세요.");
			history.back();
		</script> 
	<%
	}
	%>
</body>
</html>