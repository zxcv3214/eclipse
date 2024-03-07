<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login_ok</title>
</head>
<body>
	<%
		//입력한 아이디 비밀번호를 가져옵니다.
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		//web.xml에 설정한 값을 가져옵니다.
		String xmlid = application.getInitParameter("id");
		String xmlpass= application.getInitParameter("pass");
		//web.xml에서 가져온 값과 입력한 값을 비교
		if(id.equals(xmlid) && pass.equals(xmlpass)) {
			session.setAttribute("id",id);
	%>
		<script>
			alert('<%=id%>님 환영합니다.');
			location.href = "templatetest.jsp";
		</script> 
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