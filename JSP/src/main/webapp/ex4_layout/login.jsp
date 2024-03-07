<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
<link rel="stylesheet" type="text/css" href="../css/ch03-2.css">
</head>
<body>
	<form action="login_ok.jsp" method="post">
		<h1>로그인</h1>
		<b>아이디</b>
		<input type="text" id="id" name="id" placeholder="Enter id" required>
		<b>비밀번호</b>
		<input type="text" id="pass" name="pass" placeholder="Enter pass" required>
		<div class="clearfix">
		<input type="checkbox" name="language" id="language">아이디 기억하기
		<button type="submit" class="submitbtn" value="전송">Submit</button>	
		<button type="reset" class="cancelbtn" value="전송">Cancel</button>	   		
		</div>
	</form>
</body>
</html>