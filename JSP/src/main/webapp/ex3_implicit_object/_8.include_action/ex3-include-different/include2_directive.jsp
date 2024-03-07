<%--
	1.	include 액션 태그
		include 액션은 page 속성의 페이지 처리가 끝나면 처리 결과를 원래 페이지로 리턴하는 방식
	   
	2.	include 디렉티브와 차이점
		include 디렉티브는 원래 페이지 안으로 include 지시어로 지정한 페이지의 소스 코드가 그대로 복사 되어 실행되지만
		include 액션 태그는 page 속성의 실행 결과를 현재 위치에 포함시킵니다.
		
	 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<%@include file="include1.jsp" %>
</body>
</html>