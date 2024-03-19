<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서버의 데이터를 대상 엘리먼트에 삽입하기</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/ex2.css">
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	$(function() {
		$('button').click(function() {
			$('button').text('로딩 완료').css('color','red');
			//html파일 가져옵니다.
			$('#container').load('resource1.html');
		});
	})
</script>
</head>
<body>
	<button>서버로부터 데이터 가져오기</button>
	<div id="container">데이터 가져오기 전</div>
</body>
</html>