<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원관리 시스템 회원수정 페이지</title>
<link rel="stylesheet" type="text/css" href="css/join.css">

<style type="text/css">
	h3{text-align: center; color: #1a92b9;}
	input[type=file] {display: none;}
</style>
</head>
<body>
	<jsp:include page="../board/header.jsp" />
	<form name="joinform" action="updateProcess.net" method="post" enctype="multipart/form-data">
		<h3>회원 정보 수정</h3>
		<hr>
		<b>아이디</b>
		<input type="text" name="id" value="${memberinfo.id}" readonly>
		
		<b>비밀번호</b>
		<input type="password" name="pass" value="${memberinfo.password}" readonly>
		
		<b>이름</b>
		<input type="text" name="name" value="${memberinfo.name}" placeholder="Enter Name" required>
		
		<b>나이</b>
		<input type="text" name="age" value="${memberinfo.age}" maxlength="2"
				placeholder="Enter age" required>
				
		<b>성별</b>
			<div>
				<input type="radio" name="gender" value="남"><span>남자</span>
				<input type="radio" name="gender" value="여"><span>여자</span>
			</div>
		<b>이메일 주소</b>
			<input type="text" name="email" value="${memberinfo.email}" placeholder="Enter email" 
					required><span id="email_message"></span>
		<b>프로필 사진</b>
		<label>
			<img src="image/attach.png" width="10px">
			<span id="filename">${memberinfo.memberfile}</span>
			<span id="showImage">
				<c:if test="${empty memberinfo.memberfile}">
					<c:set var="src" value="image/profile.png" />
				</c:if>
				<c:if test="${!empty memberinfo.memberfile}">
				<%--두개에 값을 연결할때는 두개 나란히 쓰면 된다. --%>
					<c:set var="src" value='${"memberupload/"}${memberinfo.memberfile}'/>
					<input type="hidden" name="check" value="${memberinfo.memberfile}"><%--파일이 있는데 변경하지 않는 경우 --%>
				</c:if>
				<img alt="profile" src="${src}" width="20px">
			</span>
			<%--accept : 업로드할 파일 타입을 설정합니다.
				<input type="file" accept="파일 확장자|audio/*|video/*|image/*">
					(1) 파일 확장자는 .png, .jpg, .pdf, .hwp 처럼 (.)으로 시작되는 파일 확장자를 의미합니다.
										예)".png, .jpg, .pdf, .hwp"
					
					(2) audio/* : 모든 타입의 오디오 파일
					(3) image/* : 모든 타입의 이미지 파일
			 --%>
			 <input type="file" name="memberfile" accept="image/*">
		</label>
		<div class="clearfix">
		    <button type="submit" class="submitbtn">수정</button>
		    <button type="reset" class="cancelbtn">취소</button>			
		</div>
	</form>
<script>
	$("input[value='${memberinfo.gender}']").prop('checked',true);
	
	$(".cancelbtn").click(function(){
		history.back();
	});

	//처음 화면 로드시 보여줄 이메일은 이미 체크 완료된 것이므로 기본 checkemail=true입니다.
	let checkemail=true;
	$("input[name=email]").on('keyup' ,
			function() {
				$("#email_message").empty();
				//[A-Za-z0-9_]와 동일한 것이 \w
				//+는 1회 이상 반복을 의미합니다. {1,}와 동일합니다.
				//\w+ 는 [A-Za-z0-9_]를 1개이상 사용하라는 의미입니다.
				const pattern = /^\w+@\w+[.]\w{3}$/;
				const email = $(this).val();
				if (!pattern.test(email)) {
					$("#email_message").css('color','red').html("이메일형식이 맞지 않습니다.");
					checkemail=false;
				}else{
					$("#email_message").css('color', 'green').html("이메일형식이 맞습니다.");
					checkemail=true
				}
				
			})//email keyup 이벤트 처리 끝
	$('form[name=joinform]').submit(function() {
		if (!$.isNumeric($("input[name=age]").val())) {
			alert("나이는 숫자를 입력하세요.");
			$("input[name='age']").val('').focus();
			return false;
		}
		if(!checkemail) {
			alert("email 형식을 확인하세요.");
			$("input[name=email]").focus();
			return false;
		}
	});//submit()
	
	$('input[type=file]').change(function(event) {
		const inputfile = $(this).val().split('\\');
		const filename=inputfile[inputfile.length - 1];//inputfile.length -1 = 2
		
		const pattern = /(gif|jpg|jpeg|png)$/i; //i(ignore case)는 댓문자 무시를 의미
		if(pattern.test(filename)) {
			$('#filename').text(filename);
			
			const reader = new FileReader(); //파일을 읽기 위한 객체 생성
			
			//DataURL 형식 (접두사 data:가 붇은 URL이며 바이너리 파일을 Base64로 인코딩하여 ASCII문자열 형식으로)
			//파일을 읽어옵니다. (참고-Base64 인코딩은 바이너리 데이터를 Text로 변경하는 Encoding입니다.)
			//읽어온 결과는 reader객체의 result 속성에 저장됩니다.
			//event.target.fils[0] : 파일리스트에서 첫번째 객체를 가져옵니다.
			reader.readAsDataURL(event.target.files[0]);
			
			reader.onload = function() {// 읽기에 성공했을 때 실행되는 이벤트 핸들러
				$('#showImage > img').attr('src', this.result);
			};
		} else {
			alert('이미지 파일(gif,jpg,jpeg,png)이 아닌 경우는 무시됩니다.');
			$('#filename').text('');
			$('#showImage > img').attr('src', 'image/profile.png');
			$(this).val('');
			$('input[name=check]').val('');
		}
	}); //change()
</script>
</body>
</html>