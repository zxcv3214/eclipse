<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<title>applicationTest2 - 초기화 파라미터 읽어오기</title>
</head>
<%--
	-초기화 파라미터는 web.xml에 작성합니다.
	 1. getInitParameterNames()	: 웹 어플리케이션 초기화 파라미터의 이름 목록을 리턴합니다.
	 2. getInitParameter(Name)	:	이름이 Name인 웹 어플리케이션 초기화 파라미터의 값을 읽어옵니다.
	 							존재하지 않을 경우 null을 리턴합니다.
--%>
<body>
	<h2>초기화 파라미터 목록</h2>
	<ul>
	<%
		Enumeration<String> initParamEnum = application.getInitParameterNames();
	
		while (initParamEnum.hasMoreElements()) {
			String initParamName = initParamEnum.nextElement();
		
	%>
		<li>
			<%=initParamName %> =
			<%= application.getInitParameter(initParamName) %>
		</li>
	<%
		}
	%>
	</ul>
</body>
</html>