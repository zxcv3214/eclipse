<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>input.jsp</title>
<link rel="stylesheet" type="text/css" href="/css/ch03-5.css">
</head>
<body>
	<form action="search">
	<b>검색할 부서 번호를 입력하세요.</b>
	<input type="text" name="deptno" required pattern="[0-9]{2}"> 
	<input type="submit" value="전송">
	</form>
</body>
</html>