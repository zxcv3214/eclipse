<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../../../css/ch03-2.css">
<title>이름과 아이디</title>
</head>
<body>
	<h1>영역과 속성 테스트</h1>
	<form action="attributeTest1_Test1.jsp" method="post">
		<h2>Application 영역에 저장할 내용들</h2>
		<b>이름</b>
		<input type="text" id="name" name="name" placeholder="Enter name" required>
		<b>아이디</b>
		<input type="text" id="id" name="id" placeholder="Enter id" required>
		<div class="clearfix">
		<button type="submit" class="submitbtn" value="전송">Submit</button>	  		
		</div>
	</form>
</body>
</html>