<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax입력창</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/form.css">
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
</head>
<script type="text/javascript">
	$(function() {
		$("button").click(function(){
			const data = {"name"	: $("#name").val(),
						  "age"		: $("#age").val(),
						  "address" : $("#address").val()
						  };
			$("div").load("process.jsp",data);
		});
	});
</script>
<body>
<%--
	form태그의 action 속성 없습니다. 이 상태에서 전송을 클릭하면 현재 URL를 다시 불러옵니다.
 --%>
		<span>이름</span>
		<input type="text" placeholder="이름" id="name" required><br>
		<span>나이</span>
		<input type="text" placeholder="나이" id="age" required><br>
		<span>주소</span>
		<input type="text" placeholder="주소" id="address" required><br>
		<button type="button">전송</button>
		<div></div>
</body>
</html>
