<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인정보 수정</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link href="./css/join.css" type="text/css" rel="stylesheet" >
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
<script src="./js/validate2(jQuery).js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script> 
</head>
<body>

<jsp:include page="top.jsp"/>
<c:if test="${!empty temp}">	
  <form name="myform" method="post" action="updateProcess.net" id="myform"> 
  	<div class="container">
    <fieldset>
     <legend>정보 수정</legend>
		<label for="id">ID</label>
	<div>
		<input  type="text" placeholder="Enter id" name="id" id="id" readonly
				value="${temp.id}" style="background: #ccc; width: 100%">
	</div>
		<label for="pass">비밀번호</label>
		<input type="password" placeholder="Enter Password" name="pass" id="pass"
				value="${temp.password}">

		<label for="jumin1">주민번호</label>
		<input  type="text" placeholder="주민번호 앞자리" maxLength="6" 
				name="jumin1" id="jumin1" value="${temp.jumin.substring(0,6)}">
			<b> - </b>
               <!-- 주민번호 뒷자리 --> 
		<input type="text" placeholder="주민번호 뒷자리" maxLength="7"
				name="jumin2" id="jumin2" value="${temp.jumin.substring(7)}">

		<label>E-Mail</label>
			<input type="text" name="email" id="email"
					value='${temp.email.split("@")[0]}'> @ 
			<input type="text" name="domain" id="domain"
					value='${temp.email.split("@")[1]}'> 
			<select name="sel" id="sel">
				<option value="">직접입력</option>
				<option value="naver.com">네이버</option>
				<option value="daum.net">다음</option>
				<option value="nate.com">네이트</option>
			</select>

		<label>성별</label>
	<div class="container2">
		<input type="radio" name="gender" value="m" id="gender1" onclick="return false">남자
		<input type="radio" name="gender" value="f" id="gender2" onclick="return false">여자
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
		<input type="text" maxLength="5" name="post1" id="post1" value="${temp.post}">
		<input type="button" value="우편검색" id="postcode">

	<label for="address">주소</label>
		<input type="text" size="50" name="address" id="address"
				value="<c:out value='${temp.address}' />">

	<label>자기소개</label>
		<textarea rows="10" id="intro" name="intro">${temp.intro}</textarea>
	<div class="clearfix">
		<button type="submit" class="signupbtn">update</button>
		<button type="reset" class="cancelbtn">Cancel</button>
	</div>
	<a href="templatetest.net">templatetset.jsp 이동하기</a>
	<a href="javascript:history.back();">이전페이지로 이동하기</a>
     </fieldset>
     </div>
   </form>
   <script>
   	const gender = '${temp.gender}';
   	$("input[value=" +gender + "]").prop("checked",true); //성별 체크
   	
   	const hobbys = '${temp.hobby}'.split(',');
   	for (let i=0; i< hobbys.length; i++)
   		$("input[value=" + hobbys[i] + "]").prop("checked",true);
   </script>
   </c:if>
   <c:if test="${empty temp}">
   	<h3 style="text-align: center; position: relative; top: 3em;">해당 정보가 존재하지 않습니다.</h3>
   </c:if>
</body>
</html>