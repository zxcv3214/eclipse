$(function(){
	let idcheck_value=''; //id 중복검사시 값	
	//아이디
	$('#myform').submit(function(){
		if($('#id').val().trim()==""){
			
			alert("ID를 입력하세요.");
			($('#id')).focus();
			return false;
		}
		if(!id.prop('readOnly')) {
		//회원가입 폼과 정보 수정 폼에서 동시에 사용할 js입니다.
		//회원가입 폼에서만 사용할 문장들 입니다.
		//정보 수정 폼에서는 아이디를 수정하지 않기 때문에 필요없는 부분입니다.
			console.log(id.prop('readOnly'))
			let submit_id_value=$.trim(id.val())
			if(submit_id_value != idcheck_value) {
				alert("ID 중복검사를 하세요.");
				$("#opener_message").text('');
				return false;
			}
			//아이디 중복 검사를 했지만 사용중인 아이디인 경우에는 submit시 경고창 나타납니다.
			const result=$("#result").val();
			if(result == '-1') {
				alert("사용 가능한 아이디로 다시 입력하세요.");
				id.val('').focus();
				$("#opener_message").text('');
				return false;
			}
		}//if(!id.prop('readOnly'))
		
		//비밀번호
		if(!$('#pass').val().trim()) {
			alert("비밀번호를 입력하세요.");
			($('#pass')).focus();
			return false;
			
		}
		//주민번호 앞자리
		if(!$('#jumin1').val().trim()) {

			alert("주민번호 앞자리를 입력해주세요.");
			($('#jumin1')).focus();
			return false;
		}
		if($.trim($('#jumin1').val()).length != 6) {
		let pattern=/^[0-9]{2}(0[1-9]|1[012])(0[1-9]|1[0-9]|2[0-9]|3[01])$/;
			alert("주민번호 앞자리 6자리를 입력 하세요.");
			($('#jumin1')).val("").focus();
			return false;
			
		}
		//주민번호 뒷자리
		if(!$('#jumin2').val().trim()) {

			alert('주민번호 뒷자리를 입력하세요.');
			($('#jumin2')).focus();
			return false;
			
		}
		if($.trim($('#jumin2').val()).length != 7) {

			alert("주민번호 뒷자리 7자리를 입력하세요.");
			($('#jumin2')).val("").focus();
			return false;
			
		}
		//이메일
		if(!$('#email').val().trim()) {

			alert("이메일을 입력하세요.");
			($("#email")).focus();
			return false;
			
		}
		if(!$('#domain').val().trim()) {

			alert("도메인을 입력하세요.");
			($('#domain')).focus();
			return false;	
		}
		//성별
		let cnt =$('input:radio:checked').length;
		if(cnt ==0) {
			alert("성별을 선택하세요.");
			return false;
		}
		cnt = $('input:checkbox:checked').length;
		if (cnt < 2) {
			alert("취미는 2개이상 선택하세요.")
			return false;
		}
		//우편번호
		if(!$('#post1').val().trim()){
			alert("우편변호는 입력하세요.");
			($('#post1')).focus();
			return false;
		}
		//isNumberic = 매개변수가 숫자인지 확인해준다.
		if($.isNumeric($('#postcode').val())) {
			alert('우편번호는 숫자만 입력 가능합니다.');
			($('#postcode').val()).focus();
			return false;
		}
		//주소
		if(!$('#address').val().trim()) {
			alert("주소를 입력하세요.")
			($('#address')).focus();
			return false;
		}
		//자기소개
		if(!$.trim($('#intro').val()).val.trim()){
			alert("자기소개를 입력하세요");
			($('intro')).focus();
			return false;
		}
		
	});
	//아이디 중복 검사
		$('#idcheck').click(function() {
			let id = $("#id");
			//$.trim(문자열)는 문자열 아프 뒤 공백을 제거합니다.
			let id_value = $.trim(id.val());
			if (id.value == "") {
				alert('iD를 입력하세요.');
				id.focus();
				return false;
			} else {
			//첫글자는 대문자이고 두번쨰부터는 대소문자, 숫자, _로 총 4개 이상
			let pattern = /^[A-Z][a-zA-Z0-9_]{3,}$/;
			if(pattern.test(id_value)){
				idcheck_value = id_value;	//input에 입력한 아이디 값이랑 idcheck한 값이 동일한지 비교하기
				let ref=`idcheck.net?id=${id_value}`;
				window.open(ref, 'idcheck','width=350, height=200');
			} else {
				alert("첫글자는 대문자이고 두번쨰부터는 대소문자, 숫자 , _로 총 4개 이상이어야 합니다.");
				id.val('').focus();	
			}
		}
	});//$("#idcheck").click
	
	//우편번호 검색 버튼 클릭
	$("#postcode").click(function() {
		//window.open('post.html','post','width=500,height=200 ,scrollbars=yes');
		Postcode();
	});//$('#postcode').click
	
	//도메인 선택부분
	$("#sel").change(function() {
		let domain = $("#domain");
		if(!$(this).val()) {
			domain.val("").focus();
			domain.prop("readOnly", false);
		}else {
			domain.val($(this).val());
			domain.prop("readOnly",true);
		}
	});//$('#sel').change
	//주민번호 형식 검사
	$("#jumin1").keyup(function (){
		let ju1= $("#jumin1");
		let ju1_value=$.trim(ju1.val());
		if(ju1_value.length == 6) {
		let pattern=/^[0-9]{2}(0[1-9]|1[012])(0[1-9]|1[0-9]|2[0-9]|3[01])$/;
			if(pattern.test(ju1_value)){
				jumin2.focus();
				return false;
			}else {
			alert("숫자 또는 형식에 맞게 입력하세요.");
			jumin1.value = ''; // 앞자리 모두 초기화
			jumin1.focus(); //앞자리에 포커스 준다.
			};
		}
	}); //$("#jumun1").keyup()
	
	//주민번호 뒷자리
	$("#jumin2").keyup(function (){
		let ju2 = $("#jumin2");
		let ju2_value=$.trim(ju2.val());
		if(ju2_value.length == 7) {
			let pattern = /^[1234][0-9]{6}$/;
			if(pattern.test(ju2_value)){
				//주민번호 뒷자리에 따라 남자 여자 성별 라디오 버튼 자동 선택
				let c = Number(jumin2.value.substring(0,1));
				let index = (c - 1) %2;	//c=1,3 이면 index=0;
										//c=2,4 이면 index=1;
				
				$("input[type=radio]").eq(index).prop("checked", true);
			}else {
			alert("숫자또는 형식에 맞게 입력하세요.");
			jumin2.val().focus();
			}		
		}
	});//$("#jumun2").keyup()

//본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
 function Postcode() {
        new daum.Postcode({
            oncomplete: function(data) {
            	console.log(data.zonecode)
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
 
                // 도로명 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var fullRoadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 도로명 조합형 주소 변수
 
                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }
                // 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.
                if(fullRoadAddr !== ''){
                    fullRoadAddr += extraRoadAddr;
                }
 
                
                // 우편번호와 주소 정보를 해당 필드에 넣는다.
               $("#post1").val(data.zonecode);
               $("#address").val(fullRoadAddr);
            }
        }).open();
    }//function Postcode()
}); 