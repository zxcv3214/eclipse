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
		
		function error(responseTxt, status, xhr) {
			console.log(responseTxt);
			
			if(xhr.status =='404'){
				alert("해당 파일이 존재하지 않습니다.")
			}
		}
		
	$("button").click(function() {// 변경을 클릭하면
		$("button").text("로딩완료").css('color','red');
	//<p>테그 영역에 "sample12.txt"의 내용을 불러옵니다.
	$("p").load("sample12.txt", error);
	//$("pre").load("sample1.txt");
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