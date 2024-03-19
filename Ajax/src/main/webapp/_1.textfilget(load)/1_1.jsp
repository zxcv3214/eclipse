<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sample1</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/ex1.css">
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
<link rel="icon" href="${pageContext.request.contextPath}/image/home.png">
<script type="text/javascript">
	$(function() {
		$("button").click(function() {
		$("button").text("로딩완료").css('color','red');
		
	/*
	- load() 메서드를 이용한 ajax 처리
		(1) 서버에서 데이터를 가져오는 가장 간단한 형태의 메서드입니다.
		(2) 서버로부터 데이터를 받아서 일치하는 요소 안에 HTML을 추가합니다.
				만약 선택자와 일치하는 요소가 존재하지 않으면 ajax요청이 전송되지 않습니다.
				예) $("p").load() 인 경우 p 태그가 존재하지 않으면 ajax요청이 전송되지 않습니다.
		(3) 형식)
			load(url [, data] [, complete])
			① url : 정보를 요청할 URL
			② data : 서버에 보낼 데이터
			③ complete : 요청이 완료되면 실행될 콜백 함수
		(4) 콜백 함수
			function(responeTxt, status, xhr)
			① responseTxt : 서버로 부터 리턴된 텍스트 데이터를 가져옵니다.
			② status : 서버로 부터의 상태를 가져옵니다.(성공인 경우 "success", 실패인 경우 "error")
			③ xhr : XMLHttpRequest 객체
				- xhr.statusText : 상태 설명 문자열을 가져 옵니다. (주로 오류 내용을 가져오기 위해 사용합니다.)
				- xhr.status : 상태 코드를 가져옵니다.
					예)	200 : 서버가 응답을 완료했으며 아무런 문제가 없을 경우
						404 : 파일을 찾지 못하는 경우
						500 : 서버에서 클라이언트 요청을 처리 중에 에러 발생한 경우
*/
	//<p>테크 영역에 "sample1.txt"의 내용을 불러옵니다.
	$("p").load("sample1.txt");
	
	$("pre").load("sample1.txt");
		});
	});
</script>
</head>
<body>
	<button>변경</button>
	<p>변경전 : 줄이 안바뀌어요</p>
	<br>
	<pre>변경전 : 줄이 바뀝니다.(입력한 대로 출력됩니다.)</pre>
</body>
</html>