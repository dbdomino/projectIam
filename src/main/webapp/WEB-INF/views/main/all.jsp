<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Title all</title>
</head>
<body>
<h1>
	Title all  
	
</h1>

<P>sample/all2  pages</P>
<sec:authorize access="isAnonymous()">
	<P>로그인 안함</P>
</sec:authorize>

<sec:authorize access="isAuthenticated()">
<p>principal : <sec:authentication property="principal"/></p>

<p>MemberVo2 : <sec:authentication property="principal.user"/></p>
<p>사용자이름 : <sec:authentication property="principal.user.nick"/></p>
<p>사용자아이디 : <sec:authentication property="principal.user.id"/></p>
<p>사용자메일 : <sec:authentication property="principal.user.email"/></p>

<p>사용자 권한 리스트 : <sec:authentication property="principal.user.authList"/></p>

<a href="/customLogout">Logout</a>
</sec:authorize>

<sec:authorize access="isAnonymous()">
<p><a href="/customLogin">로그인</a>
</sec:authorize>
</body>
</html>
