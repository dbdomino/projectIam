<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../include/header-main.jsp" %>

<section class="login-block">
        <!-- Container-fluid starts -->
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-12">
                    <form class="md-float-material form-material">
                        <div class="text-center">
                            <img src="/resources/images/auth/logo-main-white.png" alt="logo.png">
                        </div>
                        <div class="auth-box card">
                            <div class="card-block">
                                <div class="row m-b-20">
                                    <div class="col-md-12">
                                        <h3 class="text-center txt-primary">회원가입</h3>
                                    </div>
                                </div>
                                <div class="form-group form-primary">
                                    <input type="text" name="user-name" class="form-control" required="">
                                    <span class="form-bar"></span>
                                    <label class="float-label">별명/이름</label>
                                </div>
                                <div class="form-group form-primary">
                                    <input type="text" name="user-name" class="form-control" required="">
                                    <span class="form-bar"></span>
                                    <label class="float-label">사용할 ID 입력</label>
                                </div>
                                <div class="form-group form-primary">
                                    <input type="text" name="email" class="form-control" required="">
                                    <span class="form-bar"></span>
                                    <label class="float-label">Email 주소 입력</label>
                                </div>
                                <div class="row">
                                    <div class="col-sm-6">
                                        <div class="form-group form-primary">
                                            <input type="password" name="password" class="form-control" required="">
                                            <span class="form-bar"></span>
                                            <label class="float-label">Password</label>
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group form-primary">
                                            <input type="password" name="confirm-password" class="form-control" required="">
                                            <span class="form-bar"></span>
                                            <label class="float-label">Confirm Password</label>
                                        </div>
                                    </div>
                                </div>
                                <div class="row m-t-25 text-left">
                                    <div class="col-md-12">
                                        <div class="checkbox-fade fade-in-primary">
                                            <label>
                                                <input type="checkbox" value="">
                                                <span class="cr"><i class="cr-icon icofont icofont-ui-check txt-primary"></i></span>
                                                <span class="text-inverse">이용약관 및 개인정보 제공 동의 <a href="#">이용약관 보기.</a></span>
                                            </label>
                                        </div>
                                    </div>
                                   
                                </div>
                                <div class="row m-t-30">
                                    <div class="col-md-12">
                                        <button type="button" class="btn btn-primary btn-md btn-block waves-effect text-center m-b-20">회원가입 완료</button>
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
                </div>
                <!-- end of col-sm-12 -->
            </div>
            <!-- end of row -->
        </div>
        <!-- end of container-fluid -->
    </section>

<%@include file="../include/footer-main.jsp" %>