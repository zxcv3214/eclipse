<%@page import="java.util.*,ex8.Dept, ex8.Dept_search"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<head>
<style type="text/css">
.container {
	width: 500px;
	margin-top: 3em;
}
table, h4 {
	text-align: center;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<%
			ArrayList<Dept> list = (ArrayList<Dept>) request.getAttribute("list");
		
			if(!list.isEmpty()) {	
		%>
		<table class="table">
			<thead>
				<tr>
					<th>DEPTNO</th>
					<th>DNAME</th>
					<th>LOC</th>
				</tr>
			</thead>
			<tbody>
				<%
					for (Dept dept : list) {
						
				%>
				<tr>
					<td><%=dept.getDeptno()%></td>
					<td><%=dept.getDname() %></td>
					<td><%=dept.getLoc() %></td>
				</tr>
				<%
			}
				%>
			</tbody>
		</table>
		<%
		} else {
			out.print("<h4>조회된 데이터가 없습니다.</h4>");
		}
		%>
	</div>
</body>
</html>