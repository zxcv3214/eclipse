<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 중복 확인창</title>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
</head>
<body>
	<div id="message"></div>
	<button>버튼을 클릭해 주세요</button>
	<script type="text/javascript">
	let message = ["사용중인 아이디 입니다.","사용가능한 아이디 입니다."];
	let color = ["red", "green"];
	let index=${result +1 };
	$("#message").text(message[index]).css('color',color[index]);
	
	//버튼을 클릭한 경우
	$("button").click(function() {
		//opener : 현재 창을 열어준 창
		$(opener.document).find("#opener_message")
						  .text(message[index]).css('color',color[index]);
		$(opener.document).find("#result").val('${result}');
		window.close();
	});
	</script>
</body>
</html>