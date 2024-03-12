// ID 중복 검사 부분
function idcheck() {
	var id =document.getElementById("id");
	if(id.value.trim() ==''){ //id를 입력하지않는 경우
		alert("ID를 입력하세요.");
		id.focus();
	}else {
	//첫글자는 대문자이고 두번째부터는 대소문자, 숫자 _로 총 4개 이상
	//^ : 시작
	//$ : 끝
		var pattern = /^[A_Z][a-zA-Z_0-9]{3,}$/;
		if (pattern.test(id.value)){//id 값이 정규 표현식을 만족하는지 체크합니다.
									//만족하면 true, 만족하지 않으면 false를 반환합니다.
			
		//사용자가 입력한 방식을 get방식으로 넘깁니다.
		var ref= `idcheck.html?id=${id.value}`;
		
		window.open(ref,"", "width=300, height=250")
	} else {
		alert("첫글자는 대문자이고 두번째부터는 대소문자, 숫자, _로 총 4개이상이어야합니다.")
		id.value='';
		id.focus();
	}
	}
}// idcheck

function move(){
	var jumin1 = document.getElementById("jumin1");
	var jumin2 = document.getElementById("jumin2");
	
	//주민번호 앞자리 6자리인 경우
	if(jumin1.value.trim().length == 6) {
		var pattern=/^[0-9]{2}(0[1-9]|1[012])(0[1-9]|1[0-9]|2[0-9]|3[01])$/;
		if (pattern.test(jumin1.value)){
				jumin2.focus();
		}else {
			alert("숫자 또는 형식에 맞게 입력하세요.");
			jumin1.value = ''; // 앞자리 모두 초기화
			jumin1.focus(); //앞자리에 포커스 준다.
		}
	}//jumin1 if end
	
	//주민번호 뒷자리 7자리인 경우
	if(jumin2.value.trim().length == 7) {
		pattern = /^[1234][0-9]{6}$/;
		if(pattern.test(jumin2.value)) { //7자리에 문자가 있는 경우
		//주민번호 뒷자리에 따라 남자 여자 성별 라디오 버튼 자동 선택
		var c = Number(jumin2.value.substring(0,1));
		var index = (c - 1) %2; //c=1 또는 3이면 index=0 => 1 => "gender1"
								//c=2 또는 4이면 index=1 => 2 => "gender2"
		var gender = document.getElementById("gender" + (index + 1));
		
			gender.checked = true;
		
		}else {
			alert("숫자또는 형식에 맞게 입력하세요.");
			jumin2.value = '';
			jumin2.focus();
		
		}		
	}//jumin2 if end
}//end move

function check () {
	// 비밀번호 공백 유효성 검사
	var pass = document.getElementById("pass");
	if (!pass.value.trim()) {
		alert("비밀번호를 입력하세요.");
		pass.focus();
		return false;
	}
	//주민 번호 앞자리 공백 유효성 검사
	var jumin1 = document.getElementById("jumin1");
	if(jumin1.value.trim() == '') {
		alert("주민번호 앞자리를 입력하세요.");
		jumin1.focus();
		return false;
	}
	//주민번호 앞자리 6자리 유효성 검사 - 일부분만 입력한 경우가 있어 체크합니다.
	if(jumin1.value.length != 6 ){
		alert("주민번호 앞자리 6자리를 입력하세요");
		jumin1.value = "";
		jumin1.focus();
		return false;
	}
	
	//주민번호 뒷자리 공백 유효성 검사
	var jumin2 = document.getElementById("jumin2");
	if(jumin2.value.trim() == '') {
		alert("주민번호 뒷자리를 입력하세요.");
		jumin2.focus();
		return false;
	}
	if(jumin2.value.length != 7){
		alert("주민번호 뒷자리 7자리를 입력하세요");
		jumin1.value = '';
		jumin1.focus();
		return false;
	}
	//이메일 공백 유효성 검사
	var email = document.getElementById("email");
	if(email.value.trim() == '') {
		alert("이메일을 입력하세요.");
		email.focus();
		return false;
	}
	//이메일 도메일 공백 유효성 검사
	var domain = document.getElementById("domain");
	if(domain.value.trim() == '') {
		alert("E-mall 입력하세요.");
		domain.focus();
		return false;
	}
	// 라디오 버튼 선택 유효성 검사
	var gender1 = document.getElementById("gender1");
	var gender2 = document.getElementById("gender2");
	if(gender1.checked == false && gender2.checked ==false) {
		alert("남, 여 중에서 1개를 선택하세요.");
		return false;
	}
	//취미가 2개 이상 체크하도록 하는 유효성 검사
	var cnt = 0 ;
	var hobbys = document.getElementsByName("hobby");
	for(var i=0; i<hobbys.length; i++) {
		if(hobbys[i].checked)
		cnt++
	}
	if (cnt < 2) {
		alert("2개이상 취미를 선택하세요.")
		return false;
	}
	
	//우편번호 공백 유효성 검사
	var post1 = document.getElementById("post1");
	if(post1.value.trim() == "") {
		alert("우편번호를 입력하세요.");
		post1.focus();
		return false;
	}
	//주소 공백 유효성 검사
	var address = document.getElementById("address");
	if(address.value.trim() == "") {
		alert("주소를 입력하세요.");
		address.focus();
		return false;
	}
	//자기소개 공백 유효성 검사
	var intro = document.getElementById("intro");
	if(intro.value.trim() = "") {
		alert("자기소개를 입력하세요.");
		intro.focus();
		return false;
	}

}

//select 태그에서 선택한 도메인 설정하는 부분
function domain1() {
	var sel = document.getElementById("sel");
	var domain = document.getElementById("domain");
	if(sel.value == "") {
		domain.readOnly = false;
		domain.value = "";
		domain.focus();
	} else {
		domain.readOnly = true;
		domain.value = sel.value;
	}
}//domain1

//우편 검색
function post() {
	window.open("post.html" , "post", "width=400, height=500")
}

//id 중복 검사 시 첫글자는 대문자 두번째는 대소문자,숫자 4자리 이상이여야한다.

	
//성별 체그 라이오 버튼 선택 객체 가져오기