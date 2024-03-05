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
	<h1>영역과 속성 테스트</h1><br>
		<%
			String name = request.getParameter("name");
	  		application.setAttribute("name",name);
	  		String id = request.getParameter("id");
	  		application.setAttribute("id", id);
		%>
		
	<h2><%=application.getAttribute("name")%>님 반갑습니다.</h2>
	<h2><%=application.getAttribute("name") %>의 아이디는 
		<%=application.getAttribute("id")%>입니다.</h2>
	
	
	<form action="attributeTest1_Test2.jsp" method="post">
	<h2>Session 영역에 저장할 내용들</h2>
	  	<b>e-mail 주소</b>
	  	<input type="text" id="email" name="email" placeholder="Enter e-mail" required>
	  	<b>집 주소</b>
	  	<input type="text" id="address" name="address" placeholder="Enter id" required>
	  	<b>전화번호</b>
	  	<input type="text" id="tel" name="tel" placeholder="Enter id" required>
	  	<div class="clearfix">
	  	<button type="submit" class="submitbtn">Submit</button>
	  	</div>
	  </form>
</body>
</html>