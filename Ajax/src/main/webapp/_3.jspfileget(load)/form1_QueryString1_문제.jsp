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
		$("form").submit(function(e){//전송 버튼 클릭시
			e.preventDefault(); //기본이벤트 제거
			const name ="name="+$("#name").val();//퀴리스트링 작성시 매개변수와 "="사이에 공백없이 작성합니다.
			const age="age=" +$("#age").val();
			const address="address="+$("#address").val();
			const data= name + "&" + age + "&" + address;
			
			//쿼리스트링 형식으로 파라미터의이름과 값의 형태로 전달합니다.
			// $("div").load("process.jsp",
			//				 "name=love&age=21&address=서울시");
			$("div").load("process.jsp",data);
				
		});
	});
</script>
<body>
<%--
	form태그의 action 속성 없습니다. 이 상태에서 전송을 클릭하면 현재 URL를 다시 불러옵니다.
 --%>
	<form>
		<span>이름</span>
		<input type="text" placeholder="이름" id="name" name="name" required><br>
		<span>나이</span>
		<input type="text" placeholder="나이" id="age" name="age" required><br>
		<span>주소</span>
		<input type="text" placeholder="주소" id="address" name="address" required><br>
		<input type="submit" value="전송">
		<div></div>
	</form>
</body>
</html>
