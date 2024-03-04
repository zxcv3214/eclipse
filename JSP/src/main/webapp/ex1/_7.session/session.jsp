<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redirect.jsp</title>
</head>
<style>
	body{background-color: #c7c7ef;}
	div{color: white;
		font-size:30px;
		font-weight:bold;}
</style>
<body>
	<!-- request객체의 getParamter() 메서드를 이용해서 파라미터 "food"의 값을 가져옵니다. -->
	<%-- jsp에서 <%=값 또는 수식 또는 변수 %>는 '값 또는 수식 또는 변수' 를 출력하라는 의미입니다. --%>
	<div>
		request 속성 food 값 : <%=request.getParameter("food") %> <br>
		session 속성 food 값 : <%=session.getAttribute("food") %>
	</div>
	<p>
		요청주소 <%=request.getRequestURL() %>
	</p>
</body>
</html>