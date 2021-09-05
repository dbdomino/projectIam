<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Title all2</title>
</head>
<body>
<h1>
	Title all2  
	
</h1>

<P>sample/all2  pages</P>
<sec:authorize access="isAuthenticated()">
<p>principal : <sec:authentication property="principal"/></p>
<p>MemberVo : <sec:authentication property="principal.member"/></p>
<p>사용자이름 : <sec:authentication property="principal.member.username"/></p>
<p>사용자아이디 : <sec:authentication property="principal.username"/></p>
<p>사용자 권한 리스트 : <sec:authentication property="principal.member.authList"/></p>
<a href="/customLogout">Logout</a>
</sec:authorize>

<sec:authorize access="isAnonymous()">
<p><a href="/customLogin">로그인</a>
</sec:authorize>
</body>
</html>
