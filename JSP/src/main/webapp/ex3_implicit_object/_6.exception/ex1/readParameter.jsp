<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--	1.현재 페이지를 실행하면  errorNullPointer.jsp가 실행됩니다. --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 출력</title>
</head>
<body>
	name 파라미터 값 : <%= request.getParameter("name").toUpperCase() %>
	<%-- name 파라미터의 값을 대문자로 변환하여 출력합니다. --%>
</body>
</html>