<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../../../css/ch03-2.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>
	<table class="table table-striped">
			<tr>
				<th>Application 영역에 저장된 내용들</th>
			</tr>
			<tr>
				<td>이름</td>
				<td><%=application.getAttribute("name")%></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><%=application.getAttribute("id")%></td>
			</tr>
			<tr>
				<th>Session 영역에 저장된 내용들</th>
			</tr>
			<tr>
				<td>email</td>
				<td><%=session.getAttribute("email") %></td>
			</tr>
			<tr>
				<td>address</td>
				<td><%=session.getAttribute("address") %></td>
			</tr> 
			<tr>
				<td>tel</td>
				<td><%=session.getAttribute("tel") %></td>
			</tr>
	</table>
</body>
</html>