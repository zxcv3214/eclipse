<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>500</title>
<style type="text/css">
	body {
	background: #f1d39b;
	text-align: center;
}
@keyframes textColorAnimation {
	0%{ color : red;}
	20%{color : orange;}
	40%{color : yellow;}
	60%{color : green;}
	80%{color : blue;}
	100%{color: magenta;}
}
	span {
	font-weight : bold;
	font-size: 40px;
	animation-name : textColorAnimation;
	animation-duration : 5s;
	animation-iteration-count : infinite;
}
</style>
</head>
<body>
	<span>500 error</span><br>
	<strong>요청한 페이지에 서버 내부 에러 발생</strong>
	<br>
	<br> 소스 코드의 오타를 확인해 주세요.
</body>
</html>