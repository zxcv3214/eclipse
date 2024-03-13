<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<head>
<style type="text/css">
	.container {
	margin-top: 3em;
	}
	table, h4 {
	text-align: center;
	}
	caption {
	text-align: center;
	font-weight: bold;
	caption-side: top;
	font-size: 1.5em;
	}
</style>
<meta charset="UTF-8">
<title>회원 정보 상세</title>
</head>
<body>
<jsp:include page="top.jsp"/>
<c:if test="${!empty temp}">
<div class="container">
		<table class="table table-striped">
			<caption>${temp.id}님의 상세 정보</caption>
			<tbody>
				<tr>
					<td>아이디</td>
					<td>${temp.id}</td>
				</tr>
				<tr>
					<td>주민번호</td>
					<td>${temp.jumin}</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td>${temp.email}</td>
				</tr>
				<tr>
					<td>성별</td>
					<td>${temp.genderView}</td>
				</tr>
				<tr>
					<td>취미</td>
					<td>${temp.hobby}</td>
				</tr>
				<tr>
					<td>우편번호</td>
					<td>${temp.post }</td>
				</tr>
				<tr>
					<td>주소</td>
					<td>${temp.address }</td>
				</tr>
				<tr>
					<td>자기소개</td>
					<td>${temp.intro }</td>
				</tr>
				<tr>
					<td>가입일</td>
					<td>${temp.register_date}</td>
				</tr>
			</tbody>
		</table>
	</div>
</c:if>
<c:if test="${empty temp}">
	<h4>조회된 정보가 없습니다.</h4>
</c:if>
</body>
</html>