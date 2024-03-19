<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSON 이용하기</title>
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<script type="text/javascript">
/*
	$.ajax(object)
	  ① url : 요청 전송 url,
	  ② type : 전송 방식(get(기본) 또는 post),
	  ③ data : 전송할 자료들,
	  ④ cache : false를 설정하면 jQuery는 Ajax 요청에 브라우저의 캐시를 사용하지 않도록 합니다.
	  			이렇게 하면 매번 서버로부터 최신 데이터를 가져오며, 캐시된 응답을 사용하지 않습니다.
	  ⑤ dataType : return data의 Type(에이잭스 성공 후, 돌려받은 자료의 형을 정의 - "json","xml","html"),
	  ⑥ success : HTTP 요청이 성공한 경우 실행할 함수 정의,
	  ⑦ error : HTTP 요청이 실패한 경우 실행할 함수 정의,
	  ⑧ complete : 요청의 실패, 성공과 상관 없이 완료 될 경우 실행할 함수 정의
 */
	$(function() {
		$("button").click(function() {
			$.ajax({
				url : ,
				dataType : "json" ,
				cache : false ,
				success : function(rdata) { },
				error : function(request, status, error) {},
				complete : function(){}
			});
		});	
	});
</script>
<body>
	<div class="container">
		<button class="btn btn-info">JSON 데이터를 불러옵니다.</button>
	</div>
</body>
</html>