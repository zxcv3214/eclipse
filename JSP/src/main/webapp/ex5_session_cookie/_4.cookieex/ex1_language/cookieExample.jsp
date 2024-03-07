<%@page import="javax.swing.plaf.metal.MetalBorders.Flush3DBorder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키를 이용한 화면 설정 예제</title>
<style type="text/css">
body {margin: 100px auto;text-align: center;width: 500px;}
fieldset {width: 100%;}
form {height: 3em; line-height: 3em;}
</style>
<%--src="/JSP/js/jquery-3.7.1.js" --%>
<script src="<%=request.getContextPath()%>/js/jquery-3.7.1.js"></script>

<%
	String language = "korea";

	//header의 이름 중에서 Cookie의 값을 가져옵니다.
	String cookie = request.getHeader("Cookie");
	
	//쿠키가 존재하는지 확인합니다.
	if(cookie != null) {
		Cookie cookies[] = request.getCookies();
		
		//쿠키의 이름이 "language1"인 값을 찾기 위해 쿠키 배열들을 모두 확인합니다.
		for(int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("language1")){
				language = cookies[i].getValue();
			}
		}
	}
%>

<%--
	<script type="text/javascript">
		$(function() {
			$(<%=language%>).prop('checked',ture);
		});
	</script>
	 --%>
</head>
<script type="text/javascript">
$(function() {
	const id = "#<%=language%>";
	console.log(id);//#korea 또는 #english
	$(id).prop('checked',true);
});
</script>
<body>
<%
	if (language.equals("korea")) {
%>
	<h3>안녕하세요. 이것은 쿠키 예제입니다.</h3>
<%
	}else {
%>
	<h3>Hello. This is Cookie example.</h3>
<%
	}
%>
	<form action="cookieExample2.jsp" method="post">
		<fieldset>
			<input type="radio" name="language" value="korea" id="korea">한국어 페이지 보기
			<input type="radio" name="language" value="english" id="english">영어 페이지 보기
			<input type="submit" value="설정">
		</fieldset>
	</form>

</body>
</html>