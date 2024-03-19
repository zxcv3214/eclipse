<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<style>
 body > nav.navbar {
 	justify-content:flex-end; /*오른쪽 정렬*/
 }
 
 .dropdown-menu {
 	min-width:0rem;
 }
 
 /*nav 색상 지정*/
 .navbar {
 	background:#096988;
 	margin-bottom:3em;
 	padding-right:3em;
 }
 
</style>
<c:if test="${empty id}">
	<script>
		location.href = "login.net";
	</script>
</c:if>

<nav class="navbar navbar-expand-sm right-block navbar-dark">
  <ul class="navbar-nav">
    <c:if test="${!empty id}">
    	<li class="nav-item"><a class="nav-link" href="logout.net">${id} 님(로그아웃)</a></li>
    	<li class="nav-item"><a class="nav-link" href="memberUpdate.net">정보수정</a></li>
    	
    	<c:if test="${id=='admin'}">
    		<%--Drop down --%>
    		<li class="nav-item dropdown">
    		  <a class="nav-link dropdown-toggle" href="#" id="navbardrop"
    		     data-toggle="dropdown-menu">관리자</a>
    		  <div class="dropdown-menu">
    		    <a class="dropdown-item" href="memberList.net">회원정보</a>
    		    <a class="dropdown-item" href="BoardList.bo">게시판</a>
    		  </div></li>
    	</c:if>
    </c:if>
  </ul>
</nav>