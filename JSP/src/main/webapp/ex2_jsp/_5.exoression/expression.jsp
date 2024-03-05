<%--
	3. 표현식 (Expression)
		(1) 선언문 또는 스크립트릿 태그에서 선언된 변수나 메서의 리턴값을 출력하기 위해 사용되는 방법
		(2) 웹 컨테이너에 의해 _jspService()메소드 내부에 출력 객체의 print()메소드 괄호안에
			통째로 들어가므로 scriptlet과는 달리 세미클론을 사용해서는 안됩니다.
		(3) 형식
			<%=변수 %>
			<%=리턴값이 있는 메소드%>
			<%=수식 %>
 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
//1부터 100까지의 합을 구하는 sum()메서드를 선언
	public int sum() {
	int total= 0;
	for(int i=1; i <= 100; i++) {
		total +=i;
	}
	return total;
}
	%>
	<%
	//변수에 할당합니다.
	String str = "1부터 100까지의 합";
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
span {
	color: red;
}
</style>
</head>

<body>
	<h1><%=str %>은<span> <%=sum() %></span>입니다.</h1>
	<h1><%=str %>은 <span><%=sum()*3 %>입니다.</span></h1>
	<h1><%=str %>을 1000으로 나누면  <span><%=sum() /1000.0%></span>가 됩니다.</h1>
</body>
</html>