<%@page import="java.util.*, ex8_emp.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<head>
<style type="text/css">
.container {
	width: 800px;
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
			ArrayList<Emp> list = (ArrayList<Emp>) request.getAttribute("list");
		
			if(!list.isEmpty()) {	
		%>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>사원번호</th>
					<th>사원이름</th>
					<th>직급</th>
					<th>매니저</th>
					<th>입사일자</th>
					<th>급여</th>
					<th>커미션</th>
					<th>부서번호</th>
				</tr>
			</thead>
			<tbody id="myTable">
				<%
					for (Emp emp : list) {
				%>
				<tr>
					<td><%=emp.getEmpno() %></td>
					<td><%=emp.getEname() %></td>
					<td><%=emp.getJob() %></td>
					<td><%=emp.getMgr() %></td>
					<td><%=emp.getHiredate() %></td>
					<td><%=emp.getSal() %></td>
					<td><%=emp.getComm() %></td>
					<td><%=emp.getDeptno()%></td>
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
<script>
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
    	$(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)  
    });
  });
</script>
</body>
</html>