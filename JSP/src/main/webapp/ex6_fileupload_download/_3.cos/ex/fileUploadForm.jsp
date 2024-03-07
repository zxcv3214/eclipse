<%-- 1.인코딩 타입을 지켜야한다.(multipart/form-data)
	 2.method는 post 방식으로 해줘야한다.--%>
<%-- webapp 폴더 아래 "upload" 폴더 생성 후 실행해주세요. --%>
<%--
	 일반 파라미터를 전송할 때 사용하는 인코딩과 파일을 업로드 할 때 사용하는 인코딩은 다릅니다.
	 POST방식은 다음의 두 가지 인코딩 방식에 따라서 전송하는 데이터 형싱이 달라집니다.
	 1. application/x-www-form-urlencoded
	 2. multipart/form-data
	 
	 	지금까지의 예제들은 1번 인코딩을 사용해서 데이터를 전송했습니다.
	 	파일을 업로드 하기 위해서는 2번 인코딩을 사용해야 합니다.
	 	form 태그의 enctype 속성 값을 "multpart/form-data"로 지정해주면됩니다.
	 	method는 post방식 입니다.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FlieUpload Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<style type="text/css">
	.container{width:500px;margin-top:3em;}
	.input-group-text{width:74px;}
</style>
</head>
<body>
	<div class="container">
		<%--파일을 업로드하기 위해서 enctype 속성을 "multipart/form-data"로 설정합니다. --%>
		<form action="<%=request.getContextPath()%>/fileUpload" method="post"
			  enctype="multipart/form-data">
			  <p class="h4 mb-4 text-center">파일 업로드 폼</p>
			  <div class="input-group mb-3">
			  	<div class="input-group-prepend">
			  		<span class="input-group-text">작성자</span>
			  	</div>
			  	<input type="text" class="form-control" name="name">
			  </div>
			  <div class="unput-group mb-3">
			  	<div class="input-group-prepend">
			  		<span class="input-group-text">제  목</span>
			  	</div>
			  	<input type="text" class="form-control" name="subject">
			  </div>
			  
			  <div class="form-group">
			  	<input type="file" class="form-control-file border" name="fileName1">
			  	<!-- 파일을 선택하여 존송할 수 있도록 type속성을 file로 설정합니다. -->
			  </div>
			  
			  <div class="form-group">
			  	<input type="file" class="form-control-file border" name="fileName2">
			  </div>
			  
			  <button type="submit" class="btn btn-info my-4 btn-block">Submit</button>
		</form>
	</div>
</body>
</html>