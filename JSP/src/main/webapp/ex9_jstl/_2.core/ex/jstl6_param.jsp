<%@ page language="java" contentType="text/html; charset=UTF-8"%>
 <%--JSP페이지에 core 라이브러리를 등록합니다. --%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core 라이브러리 사용 예제6</title>
</head>
<body>
	<c:out value="${param.id}"/>는
	<c:out value="${param.name}"/>입니다.
</body>
</html>