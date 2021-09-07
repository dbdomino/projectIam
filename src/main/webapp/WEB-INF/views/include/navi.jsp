<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
            <nav class="navbar header-navbar pcoded-header">
                <div class="navbar-wrapper">
                    <div class="navbar-logo">
                        <a class="mobile-menu waves-effect waves-light" id="mobile-collapse" href="#!">
	<i class="ti-menu"></i>
                </a>
                        <div class="mobile-search waves-effect waves-light">
                            <div class="header-search">
                                <div class="main-search morphsearch-search">
                                    <div class="input-group">
                                        <span class="input-group-prepend search-close"><i class="ti-close input-group-text"></i></span>
                                        <input type="text" class="form-control" placeholder="Enter Keyword">
                                        <span class="input-group-append search-btn"><i class="ti-search input-group-text"></i></span>
                                    </div>
                                </div>
                            </div>
                        </div>
	<a href="/">
	<img class="img-fluid" src="/resources/images/logo.png" alt="Theme-Logo" />
	</a>
	<a class="mobile-options waves-effect waves-light">
	<i class="ti-more"></i>
                    </div>

                    <div class="navbar-container container-fluid">
                        <ul class="nav-left">
                            <li>
                                <div class="sidebar_toggle"><a href="javascript:void(0)"><i class="ti-menu"></i></a></div>
                            </li>
	<li class="header-search">
                                <div class="main-search morphsearch-search">
                                    <div class="input-group">
                                        <span class="input-group-prepend search-close"><i class="ti-close input-group-text"></i></span>
                                        <input type="text" class="form-control" placeholder="Enter Keyword">
                                        <span class="input-group-append search-btn"><i class="ti-search input-group-text"></i></span>
                                    </div>
                                </div>
	</li>
	<li>
		<a href="#!" onclick="javascript:toggleFullScreen()" class="waves-effect waves-light">
			<i class="ti-fullscreen"></i>
		</a>
	</li>
                        </ul>
                        <ul class="nav-right">
<sec:authorize access="isAuthenticated()">
<li class="header-notification">
	<a href="#!" class="waves-effect waves-light" style="padding-top:20px; padding-bottom:20px;">
	<i class="ti-bell"></i>
	<span class="badge bg-c-green"></span>
	</a>
<ul class="show-notification">
	<li>
		<h6>Notifications</h6>
		<label class="label label-danger">New</label>
	</li>
	<li class="waves-effect waves-light">
		<div class="media">
			<img class="d-flex align-self-center img-radius" src="/resources/images/avatar-2.jpg" alt="Generic placeholder image">
		<div class="media-body">
			<h5 class="notification-user">John Doe</h5>
			<p class="notification-msg">Lorem ipsum dolor sit amet, consectetuer elit.</p>
			<span class="notification-time">30 minutes ago</span>
		</div>
		</div>
	</li>
	<li class="waves-effect waves-light">
		<div class="media">
			<img class="d-flex align-self-center img-radius" src="/resources/images/avatar-4.jpg" alt="Generic placeholder image">
		<div class="media-body">
			<h5 class="notification-user">Joseph William</h5>
			<p class="notification-msg">Lorem ipsum dolor sit amet, consectetuer elit.</p>
			<span class="notification-time">30 minutes ago</span>
		</div>
		</div>
	</li>
	<li class="waves-effect waves-light">
		<div class="media">
			<img class="d-flex align-self-center img-radius" src="/resources/images/avatar-3.jpg" alt="Generic placeholder image">
		<div class="media-body">
			<h5 class="notification-user">Sara Soudein</h5>
			<p class="notification-msg">Lorem ipsum dolor sit amet, consectetuer elit.</p>
			<span class="notification-time">30 minutes ago</span>
		</div>
		</div>
	</li>
</ul>
</li>
</sec:authorize>
                            
<li class="user-profile header-notification">
<sec:authorize access="isAnonymous()">
	<a href="/sign-in" class="waves-effect waves-light pdp" style="float:right; padding-top:15px;">
	<span>로그인</span>
	<i class="ti-angle-left"></i>
	</a>
	
	<a href="/sign-up" class="waves-effect waves-light pdp" style="float:right; padding-top:15px;">
	<span>회원가입</span>
	<i class="ti-angle-left"></i>
	</a>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
	<a href="#!" class="waves-effect waves-light pdp">
	<img src="/resources/images/avatar-4.jpg" class="img-radius" alt="User-Profile-Image">
	<span>John Doe</span>
	<i class="ti-angle-down"></i>
	</a>
	<ul class="show-notification profile-notification">
		
		<li class="waves-effect waves-light">
			<a href="user-profile.html">
			<i class="ti-user"></i> 프로필 설정
			</a>
		</li>
		<li class="waves-effect waves-light">
			<a href="#!">
			<i class="ti-email"></i> 문의하기
			</a>
		</li>
		<form action="/logout" id="logoutform" method="post">
			<li class="waves-effect waves-light" onclick="logoutform.submit();">
			<a href="#!"><i class="ti-layout-sidebar-left"></i> 로그아웃</li></a>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		</form>
	</ul>
</sec:authorize>
</li>
                        </ul>
                    </div>
                </div>
            </nav>