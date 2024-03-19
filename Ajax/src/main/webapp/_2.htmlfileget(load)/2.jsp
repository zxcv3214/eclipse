<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/ex2.css">
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
<style type="text/css">
	div {
		width: 180px;	height: 80px;
		margin: 3px;	float: left;
	}
</style>
<script type="text/javascript">
	/*
		- jQuery에서 제공해주는 load()메서드를 사용해서 버서의 menu.html 페이지의
			데이터를 가져와서 특정 엘리먼트에 추가합니다.
	*/
	$(function() {
		$('#menu1').click(function() {
			//load() 메서드를 이용해서 menu.html 문서전체를 르도하여
			//id가 message1인 엘리먼트에 넣습니다.
			$('#message1').load('menu.html');
		});
		$('#menu2').click(function() {
			//load() 메서드를 이용해서 menu.html 문서의 내용중 li 엘리먼트만 읽어서
			//id가 message2인 엘리먼트에 넣습니다.
			$('#message2').load('menu.html li');
		});
		
	});
</script>
</head>
<body>
	<div>
	<%-- href="#"는 클릭시 현재 페이지 상단으로 이동합니다. --%>
	<a href="#" id="menu1">메뉴 보기1</a>
	<p>
		<span id="message1"></span>
	</p>
	</div>
	<div>
		<a href="#" id="menu2">메뉴 보기2</a>
		<p>
			<span id="message2"></span>
		</p>
	</div>
</body>
</html>