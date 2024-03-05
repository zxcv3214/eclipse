<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

<head>
<meta charset="UTF-8">
<title>회원가입 정보 결과</title>
</head>
<body>
	<table class="table">
		
		<tbody>
			<tr>
				<th>아이디</th>
				<td><%= request.getAttribute("id") %></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><%= request.getAttribute("pass") %></td>
			</tr>
			<tr>
				<th>주민번호</th>
				<td><%= request.getAttribute("jumin") %></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><%= request.getAttribute("email") %></td>
			</tr>
			<tr>
				<th>성별</th>
				<td><%= request.getAttribute("gender") %></td>
			</tr>
			<tr>
				<th>취미</th>
				<td><%= request.getAttribute("hobby") %></td>
			</tr>
			<tr>
				<th>우편번호</th>
				<td><%= request.getAttribute("post1") %></td>
			</tr>
			<tr>
				<th>주소</th>
				<td><%= request.getAttribute("address") %></td>
			</tr>
			<tr>
				<th>자기소개</th>
				<td><%= request.getAttribute("intro") %></td>
			</tr>
		</tbody>
	</table>
</body>
</html>