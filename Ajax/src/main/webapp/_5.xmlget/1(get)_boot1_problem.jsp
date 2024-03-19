<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>XML 파일을 GET 방식으로 로드하기</title>
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style type="text/css">
td:nth-child(3) {text-align: right;}
</style>
<script type="text/javascript">
	/*
	- $.get() 메서드를 이용해서 item.xml 파일을 불러옵니다.
	- $.get() 메서드의 첫번째 매개변수에는 서버의 URL 주소를 지정합니다.
	- $.get() 메서드의 두번째 매개변수인 콜백함수를 이용해서 서버에서 보내온
	  XML 형삭우ㅏ 테이터를 변수 data로 받습니다.
	*/
	$(function() {
		$("button").click(function() {
			$.get('item.xml', function(data){
				$("table").remove();
				
				let output= "<table class='table'><thead>"
				+ "<tr><th>id</th><th>name</th><th>price</th>"
				+ "<th>description</th></tr></thead><tbody>"
				//서버에서 얻어온 데이터에서 셀렉터로 item태그를 찾습니다.
				$(data).find('item').each(function() {
				// each() : 반복 하는 메소드로 item을 찾을 때마다 반복해서 아래 문장들을 수행합니다.
				// 6개의 item태그 중 현재 처리중인 item태그를 this로 접근합니다.
				// $(this)를 사용하여 jQuery객체를 생성합니다.
				
				const $this = $(this);
				output += "<tr>"
					   + "<td>" + $this.attr("id") + "</td>"
					   + "<td>" + $this.attr("name") + "</td>"
					   + "<td>" + $this.find("price").text() + "</td>"
					   + "<td>" + $this.find("description").text() + "</td>"
					   + "</tr>";
				/*
				 $this.attr("id") : 속성 id의 값을 구해옵니다.
				 $this.find("price") : price 태그를 찾습니다.
				 $this.find("price").text() : price태그 사이의 값을 구해옵니다.
				 $this.find("description").text() : description 태그 사이의 값을 구해옵니다.
				*/
				});// each end
				output += "</tbody></table>"
				$(".container").append(output);
			});
		});
	});
</script>
</head>
<body>
	<div class="container">
		<button class="btn btn-info">XML형식으로 데이터 가져옵니다.</button>
	</div>
</body>
</html>