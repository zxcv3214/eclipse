<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h1>쿠키, URL/URI, 요청방식에 관련된 정보 예제</h1>
	<table class="table table-striped">
		<tr>
		<td>쿠키정보</td>
		<%
			Cookie[] cookie = request.getCookies();
			if (cookie == null) { //처음 요청할때
		%>
		<td>쿠키가 존재하지 않습니다.</td>
		<%
			} else {
			for(int i = 0; i < cookie.length; i++) {
		%>
			<td><%=cookie[i].getName()%>(<%=cookie[i].getValue()%>)
				%nbp;%nbsp;</td>
		<%
			} //for end
		}// else end
		%>
		</tr>
		<tr>
			<td>세션 ID</td>
			<td><%=session.getId()%></td>
		</tr>
		<%--
		1.	톰캣은 web.xml에 기본 세션시간을 아래와 같이 30분(1800초)으로 설정되어 있습니다.
			<session-config>
				<session-timeout>30</session-timeout>
			</session-config>
		2.	getMaxInactiveIterval() : 세션 유효 시간을 초 단위로 가져옵니다.
		 --%>
		 
		 <tr>
			<td>세션 유효 시간</td>
			<td><%=session.getMaxInactiveInterval()/60 + "분"%></td>
		</tr>
		<tr>
			<td>세션 설정</td>
			<td>속성 "id"에 "hong" 설정<%session.setAttribute("id", "hong"); %></td>
		</tr>
		<tr>
			<td>세션 설정값 가져오기</td>
			<td><%=session.getAttribute("id") %></td>
		</tr>
	</table>
</div>
</body>
</html>