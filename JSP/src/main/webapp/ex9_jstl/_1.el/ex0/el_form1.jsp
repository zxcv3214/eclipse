<%--
	* 표현언어(Empression Language:EL)
		- JSP 스크립트 대신하여 속성 값들을 좀 더 편리하게 출력하기 위해 제공하는 언어입니다.
		- 톰켓에서 제공하기 때문에 따로 설정할 필요 없습니다.
		- 형식) ${ }
		
			표현식 태그
		1.	<%=article.getId()%>	//article이 자바빈인 경우
			=> ${article.id} 또는	${article["id"]}	또는		${article['id']}
			
		2.	<%=request.getParameter("name")%>
			=	${param.name}
		
		3.	<%=request.getParameterValues("hobby")%>
			=>	${paramValues.hobby} 결과는 스트링 배열 (String[])
					차례대로 출력할 경우
			- ${paramValues.hobby[0] }
			- ${paramValues.hobby[1] }
			- ${paramValues.hobby[2] }
			
		4.	<%=request.getAttribute("hoho")%>
			=> ${requestScope.hoho}
			
		5.	<%=session.getAttribute("id")%>
			=>	${sessionScope.id}
			
		6.	${hoho}
					이 경우에는 pageContext -> request -> session -> application 객체의 영역 순으로
			'hoho' 이름의 attribute를 찾습니다.
 --%>
<%
	pageContext.setAttribute("id", "pageContext");
	request.setAttribute("id","request");
	session.setAttribute("id","session");
	application.setAttribute("id","application");
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 내장객체 사용 예제</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
.container {
	width: 800px;
}
table {
	margin: auto;
}
td:nth-child(1),h3 {
	text-align: center;
}
</style>
</head>
<body>
	<div class="container">
	<form action="el_result1.jsp" method="post">
		<h3>EL 예제</h3>
	<table class="table">
		<tr>
			<td>이름 </td>			
			<td><input type="text" name="name" value="홍길동" class="form-control"></td>
		</tr>	
		<tr>
			<td>취미</td>
			<td>
			<input type="checkbox" name="hobby" id="hobby1" value="독서">독서
			<input type="checkbox" name="hobby" id="hobby2" value="놀기">놀기
			</td>
		</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="입력" class="btn btn-info btn-block">
				</td>
			</tr>
		</table>
</form>
	<h5>page영역의 속성 id의 값 : ${pageScope.id }</h5>
	<h5>request영역의 속성 id의 값 : ${requestScope.id }</h5>
	<h5>어느 영역의 속성 id의 값 : ${id }</h5>
	</div>
</body>
</html>