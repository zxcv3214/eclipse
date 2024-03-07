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
	//쿠키 객체로 생성하고 language1이라는 쿠키 이름에
	//입력받은 language설정 값을 저장합니다.
	Cookie cookie = new Cookie("language1" , request.getParameter("language"));
	
	//시간을 설정하지 않으면(setMaxAge()메소드 사용하지 않을때)
	//브라우저 종료시 쿠키도 삭제됩니다.
	//또는 메서드를 호출할 때 인자 값으로 0을 주면 쿠키는 삭제 됩니다.
	cookie.setMaxAge(60*60*24);//쿠키의 유효시간을 24시간으로 설정합니다.(단위는 초)
	
	response.addCookie(cookie);//클라이언트로 쿠키값을 전송합니다.
	
%>
<script>
	location.href="cookieExample.jsp"//cookieExample.jsp로 돌아갑니다.
</script>
</head>

<body>
</body>
</html>