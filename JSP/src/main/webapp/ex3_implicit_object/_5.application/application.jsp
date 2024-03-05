<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<title>application 테스트</title>
</head>
<body>
<%-- application 객체는 웹 어플리케이션 전반에 걸쳐서 사용되는 정보를 담고 있습니다.--%>
<div class="container">
	<h2>application</h2>
	<table class="table table-striped">
		<tr>
			<td>Servlet API스펙의 비전</td>
			<td><%=application.getMajorVersion()%>.
				<%=application.getMinorVersion()%></td>
		</tr>
		 <tr>
			<td>컨테이너 이름과 비전</td>
			<td><%=application.getServerInfo()%></td>
		</tr>
		<tr>
			<td>웹 어플리케이션의 context경로</td>
			<td><%=application.getContextPath()%></td>
		</tr>
		<tr>
			<td>웹 어플리케이션의 실제 파일시스템 경로</td>
			<td><%=application.getRealPath("/") %></td>
		</tr>
	</table>
<%--
		getRealPath("/") : /는 context경로 입니다.
		즉 , 웹 애플리케이션 경로까지 구하라는 의미입니다.
		위의 경우 ~~~~/JSP/까지 구합니다.	
--%>
</div>
</body>
</html>