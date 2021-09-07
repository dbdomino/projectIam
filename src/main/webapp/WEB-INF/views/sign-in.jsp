<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="./include/header-main.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<section class="login-block">
        <!-- Container-fluid starts -->
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <!-- Authentication card start -->
                    
                        <form class="md-float-material form-material" role="form" id="form1" method="post" action="/login">
                            <div class="text-center">
                                <img src="/resources/images/auth/logo-main-white.png" alt="logo.png">
                            </div>
                            <div class="auth-box card">
                                <div class="card-block">

                                    <div class="form-group form-primary">
                                        <input type="text" name="username" class="form-control" required="">
                                        <span class="form-bar"></span>
                                        <label class="float-label">ID 입력</label>
                                    </div>
                                    <div class="form-group form-primary">
                                        <input type="password" name="password" class="form-control" required="">
                                        <span class="form-bar"></span>
                                        <label class="float-label">PW 입력</label>
                                        
                                    </div>
                                    <div class="row m-t-25 text-left">
                                        <div class="col-12">
                                            <div class="checkbox-fade fade-in-primary d-">
                                                <label>
                                                    <input type="checkbox" name="remember-me" >
                                                    <span class="cr"><i class="cr-icon icofont icofont-ui-check txt-primary"></i></span>
                                                    <span class="text-inverse">로그인 상태유지</span>
                                                </label>
                                            </div>
                                            <div class="forgot-phone text-right f-right">
                                                <a href="auth-reset-password.html" class="text-right f-w-600">비밀번호를 잊어버렸나요?</a>
                                            </div>
                                        </div>
                                    </div>
                                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                    <div class="row m-t-30">
                                        <div class="col-md-12">
                                            <button type="button" class="btn btn-primary btn-md btn-block waves-effect waves-light text-center" onclick="submitForm()">로그인</button>
                                        </div>
                                    </div>
                                    <div class="row m-t-15 text-left">
                                        <div class="col-12">
                                        	<button type="button" class="btn btn-disabled btn-md btn-block waves-effect waves-light text-center m-b-20" onclick="location.href='/sign-up'">회원가입 하러가기</button>
                                        	  
                                        </div>
                                    </div>
                                    
                                    <hr/>
                                    <div class="row">
                                        <div class="col-md-10">
                                            <p class="text-inverse text-left m-b-0">오늘도 힘차게!</p>
                                            <p class="text-inverse text-left"><a href="home"><b>웹사이트 보기</b></a></p>
                                        </div>
                                        <div class="col-md-2">
                                            <img src="/resources/images/auth/Logo-small-bottom.png" alt="small-logo.png">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>
                        <!-- end of form -->
                </div>
                <!-- end of col-sm-12 -->
            </div>
            <!-- end of row -->
        </div>
        <!-- end of container-fluid -->
    </section>
<script type="text/javascript">
function submitForm() {
	$("#form1").submit();
}
</script>
<%@include file="./include/footer-main.jsp" %>