<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../../../css/ch03-2.css">
</head>
<body>
		<%	
			String email = request.getParameter("email");
			String address = request.getParameter("address");
			String tel = request.getParameter("tel");
			
			session.setAttribute("email", email);
			session.setAttribute("address", address);
			session.setAttribute("tel", tel);
		%>
	<h2>Session 영역에 저장할 내용들</h2>
	<h3><%=application.getAttribute("name")%>님 정보가 모두 저장되었습니다.</h3>
	<a href="attributeTest1_Test3.jsp">확인하러 가기</a>
	
</body>
</html>