<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 모드(회원 정보 보기)</title>
<jsp:include page="/board/header.jsp" />
<style type="text/css">
	tr>td:nth-child(odd) {font-weight: bold}
	td{text-align: center;}
	.container{width:50%;}
</style>
</head>
<body>
<div class="container">
	<table class="table table-bordered">
			<tr>
				<td>아이디</td>
				<td>${memberinfo.id}</td> <%--Member 클래스 --%>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>${memberinfo.password}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>${memberinfo.name}</td>
			</tr>
			<tr>
				<td>나이</td>
				<td>${memberinfo.age}</td>
			</tr>
			<tr>
				<td>성별</td>
				<td>${memberinfo.gender}</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>${memberinfo.email}</td>
			</tr>
			<tr>
				<td colspan="2">
				<a href="memberList.ne">리스트로 돌아가기</a>
				</td>
			</tr>
	</table>
</div>
</body>
</html>