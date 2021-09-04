<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="./include/header-main.jsp" %>

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
                                        <h3 class="text-center txt-primary">회원가입 완료했습니다.</h3>
                                        <h4 class="text-center txt-primary">로그인 후 서비스 이용 가능합니다.</h3>
                                    </div>
                                </div>
                                
                                <div class="row">
                                    <div class="col-md-6">
                                        <button type="button" class="btn btn-primary btn-md btn-block waves-effect text-center m-b-20" onclick="location.href='/sign-in'">로그인 하기</button>
                                    </div>
                                    <div class="col-md-6">
                                        <button type="button" class="btn btn-primary btn-md btn-block waves-effect text-center m-b-20" onclick="location.href='/'">홈화면</button>
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
<script type="text/javascript">
</script>
<%@include file="./include/footer-main.jsp" %>