<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<%
		String name="";
		String value="";
		
		//쿠키가 생성되어 있는지 확인합니다.
		String cookie = request.getHeader("Cookie");
		
		if(cookie != null) {
			
		//request 헤더의 Cookie는 name=hongJSESSIONID=24ACE5237AEB61E4B5647193633AD3FE;
		//쿠키 이름과 값이 세미콜론으로 구분된 하나의 쌍으로 구성 되어있는 것을 확인할 수 있습니다.
		//쿠키의 쌍이 여러개 존재할 수 있어 배열로 가져옵니다.
		Cookie cookies[] = request.getCookies();
			
		//쿠키 배열에서 쿠키 이름이 "name"인 것을 찾아서 쿠키의 이름과 값을 가져옵니다.
		for(int i=0; i<cookies.length; i++) {
			if(cookies[i].getName().equals("name1")) {
				name=cookies[i].getName();//쿠키의 이름을 가져옵니다.
				value=cookies[i].getValue();//쿠키의 값을 가져옵니다.
			}
		}//for end
		
	%>
		<h2>
			쿠키 이름 :<%=name %>
		</h2>
		<h2>
			쿠키 값 : <%=value %>
		</h2>
	<%
	}else {
	%>
		존재하는 쿠키가 없습니다.
	<%
	}
	%>
</body>
</html>