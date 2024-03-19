<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>error.jsp</title>
<style>
 body{width:500px;margin:3em auto}
 div{
   color:orange;
   font-size:30px;
   text-align:center;
 }
 span{font-size:1.5rem;color:#5d5de2}
</style>
</head>
<body>
  <div>
    <p><img src="${pageContext.request.contextPath}/image/error.png" width="100px"></p>
    <p>죄송합니다. <br> ${message} </p>
    <span>서비스 이용에 불편을 드려 죄송합니다.</span>
  </div>
</body>
</html>