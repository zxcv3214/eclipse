<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>버튼을 클릭하면 ajax 실행하기</title>
</head>
<script type="text/javascript">
	$(function() {
		$("button").click(function() {
			$(".container div").remove()//div 요소 제거합니다.
			
			$.ajax({
				url : "${pageContext.request.contextPath}/get_dept", //요청전송 url
				type : post ,
				dataType : "json" , //return data의 Type(에이잭스 성공 후 돌려받은 자료 형을 정의)
				cache : false ,	//브라우저 캐시 값이 아닌 현재의 데이터를 받아오도록 합니다.
				success : function(adata) { //HTTP 요청이 성공한 경우 실행할 함수 정의(이벤트 핸들러)
											//rdata는 서버에서 보낸 데이터입니다.
				$(adata).each(function() {
					if(adata.length>0) {	//rdata는 서버에서 보낸 데이터입니다.
						let output= "<table class='table'><thead>"
							+ "<tr><th>id</th><th>name</th><th>price</th>"
							+ "<th>description</th></tr></thead><tbody>"
						
						$(adata).each(function() { //반복문
							output += " <tr><td>" + this.deptno + "</td>"
									+ "		<td>" + this.dname + "</td>"
									+ "		<td>" + this.loc + "</td></tr>"
						});//each end
						output += "</tbody></table>";
						$("button").after(output);//button의 다음 형제요소로 output이 생성됩니다.
					}else {
						$("button").after("<div>데이터가 존재하지 않습니다.</div>");
					}
				},
				error : function(request, status, error) {
					$("body .container").append("<div id='error'>code :"
							+ request.status + "<br>"
							+ "받은 데이터 : " + request.responseText + "<br>"
							+ "error status : " + status + "<br>"
							+ "error 메시지 : " + error + "</div>");
				}
			}); //ajax end
		});	
	});
</script>
<body>

	<div class="container">
		<button class="btn btn-info">JSON 데이터를 불러옵니다.</button>
	</div>
</body>
</html>