<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입폼</title>
<link href="./css/join.css" type="text/css" rel="stylesheet" >
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
<script src="./js/validate2(jQuery).js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script> 
</head>
<body>
<div class="container">
  <form name="myform" method="post" action="joinProcess.net" id="myform"> 
    <fieldset>
     <legend>유효성 검사</legend>
		<label for="id">ID</label>
	<div>
		<input  type="text" placeholder="Enter id" size="10" name="id" id="id" maxlength="20">
		<input type="button" value="ID중복검사" id="idcheck">
		<div id="opener_message"></div><input type="hidden" id="result">
	</div>
		<label for="pass">비밀번호</label>
		<input type="password" placeholder="Enter Password" name="pass" id="pass">

		<label for="jumin1">주민번호</label>
		<input  type="text" placeholder="주민번호 앞자리" size="6" 
			maxLength="6" name="jumin1" id="jumin1" >
			<b> - </b>
               <!-- 주민번호 뒷자리 --> 
		<input type="text" placeholder="주민번호 뒷자리" size="7" 
			maxLength="7" name="jumin2" id="jumin2" >

		<label>E-Mail</label>
			<input type="text" name="email" id="email"> @ 
			<input type="text" name="domain" id="domain"> 
			<select name="sel" id="sel">
				<option value="">직접입력</option>
				<option value="naver.com">네이버</option>
				<option value="daum.net">다음</option>
				<option value="nate.com">네이트</option>
			</select>

		<label>성별</label>
	<div class="container2">
		<input type="radio" name="gender" value="m" id="gender1">남자
		<input type="radio" name="gender" value="f" id="gender2">여자
	</div>
<label>취미</label>
	<div class="container2">
		<input type="checkbox" name="hobby" id="hobby1" value="공부">공부
		<input type="checkbox" name="hobby" id="hobby1" value="게임">게임
		<input type="checkbox" name="hobby" id="hobby1" value="운동">운동
		<input type="checkbox" name="hobby" id="hobby1" value="등산">등산
		<input type="checkbox" name="hobby" id="hobby1" value="낚시">낚시
	</div>
		
	<label for="post1">우편번호</label>
		<input type="text" maxLength="5" name="post1" id="post1">
		<input type="button" value="우편검색" id="postcode">

	<label for="address">주소</label>
		<input type="text" size="50" name="address" id="address">

	<label>자기소개</label>
		<textarea rows="10" id="intro" name="intro"></textarea>
	<div class="clearfix">
		<button type="submit" class="signupbtn">회원가입</button>
		<button type="reset" class="cancelbtn">취소</button>
	</div>
     </fieldset>
   </form>
</div>
</body>
</html>