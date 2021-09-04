<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@include file="./include/header-main.jsp" %>

<section class="login-block">
        <!-- Container-fluid starts -->
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-12">
                    <form class="md-float-material form-material"  id="form1" action="/sign-up" method="post">
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
                                    <input type="text" name="nick" class="form-control" onblur="this.placeholder=''" required>
                                    <span class="form-bar"></span>
                                    <label class="float-label">별명/이름</label>
                                </div>
                                <div class="row">
                                	<div class="col-sm-9">
                                	<div class="form-group form-primary">
                                    <input type="text" name="id" class="form-control" onblur="this.placeholder=''" required>
                                    <span class="form-bar"></span>
                                    <label class="float-label">사용할 ID 입력</label>
                                	</div>
                                	</div>
                                	<div class="col-sm-3">
                                	<button type="button" class="btn btn-primary btn-md btn-block waves-effect text-center" onclick="idCheck()">id확인</button>
                                	</div>
                                </div>
                                <div class="form-group form-primary">
                                    <input type="text" name="email" class="form-control" onblur="this.placeholder=''" required>
                                    <span class="form-bar"></span>
                                    <label class="float-label">Email 주소 입력</label>
                                </div>
                                <div class="row">
                                    <div class="col-sm-6">
                                        <div class="form-group form-primary">
                                            <input type="password" name="password" class="form-control" onblur="this.placeholder=''" required>
                                            <span class="form-bar"></span>
                                            <label class="float-label">Password</label>
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group form-primary">
                                            <input type="password" name="confirm-password" class="form-control" onblur="this.placeholder=''" required>
                                            <span class="form-bar"></span>
                                            <label class="float-label">Password 확인</label>
                                        </div>
                                    </div>
                                </div>
                                <div class="row m-t-25 text-left">
                                    <div class="col-md-12">
                                        <div class="checkbox-fade fade-in-primary">
                                            <label>
                                                <input type="checkbox" name="infocheck" value="">
                                                <span class="cr"><i class="cr-icon icofont icofont-ui-check txt-primary"></i></span>
                                                <span class="text-inverse">이용약관 및 개인정보 제공 동의 <a href="#" data-toggle="modal" data-target="#modal-info">이용약관 보기.</a></span>
                                            </label>
                                        </div>
                                    </div>
                                   
                                </div>
                                <div class="row m-t-30">
                                    <div class="col-md-12">
                                        <button type="button" class="btn btn-primary btn-md btn-block waves-effect text-center m-b-20" onclick="submitForm()">회원가입 완료</button>
                                    </div>
                                </div>
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                
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

<!-- [S]Modal -->
<div id="modal-info" class="modal fade" role="dialog">
<div class="modal-dialog">
<div class="card">
<div class="card-block">
	<div class="row m-b-20">
		<div class="col-md-12">
			<div class="slimScrollDiv" style="height: 350px; overflow: scroll; overflow-x: hidden; text-overflow: ellipsis;">

<p>이용 약관</p>
제1조(목적)<br>
- 회사가 아닌 개인이 운영하는 홈페이지로서 개인에게 도움이 되기 위한 서비스를 운영한다.<br>
<br>
제2조(기간)<br>
- 사이트가 운영되는 동안 기간에 관계없이 이용 가능하다.<br>
<br>
제3조(외부 공유)<br>
- 사이트의 내부 컨텐츠를 이용하면서 다른 게시물의 참고자료 로써 공유 가능하지만 출처를 반드시 남겨야 한다.<br>
<br>
제4조(상업적 행위)<br>
- 사이트의 컨텐츠는 상업적 목적으로 만들지 않았다.<br>
- 누구나 무료로 이용 가능하며, 사이트의 내용을 상업적 행위로 사용하는 것은 금지한다.<br>
<br>
제5조(컨텐츠 이용)<br>
- 나의 꿈 설계하기, 일상 계획하기, 가계부 등의 컨텐츠가 준비되어있으며 자신을 위해 유용한 도구가 되길 바란다.<br><br>
<p>개인정보처리방침</p>
제1조 개인정보의 처리 목적<br>
- 본 사이트는 컨텐츠 이용, 접근 제어 등의 목적으로 최소한의 개인정보를 수집하고 있으며, 요청시 언제든지 삭제가 가능하다.<br>
<br>
제2조 개인정보의 처리 및 보유기간<br>
- 별명 또는 이름, id, email을 필수항목으로 수집한다.<br>
- 선택적으로 생년월일, 성별, 프로필을 수집한다.<br>
- 이용과정에서 서비스 이용 기록, 기기정보, 위치정보, ip주소, 쿠키가 수집될 수 있다.<br>
- 수집된 개인정보는 회원 탈퇴시 까지 보유되며, 사이트 운영 종료시 모두 폐기한다.<br>
<br>
제3조 개인정보의 제3자 제공에 관한 사항<br>
- 개인정보는 제3자 에게 동의 없이 개인정보를 제공하지 않는다.
<br>
제4조 개인정보 처리의 위탁<br>
- 개인정보의 처리를 외부에 위탁하지 않으며 상업적 이득을 위한 계약 예정도 없다.<br>
<br>
제5조 정보주체와 법정대리인의 권리·의무 및 행사방법<br>
- 사이트 내에 문의로 연락하거나 사이트 운영자에게 메일(dbdomino@naver.com)로 연락시 수행 가능하다.<br>
<br>
제6조 개인정보의 파기 절차 및 방법<br>
- 사이트 내에 문의로 연락하거나 사이트 운영자에게 메일(dbdomino@naver.com)로 연락시 수행 가능하다.<br>
<br>
제8조 개인정보의 자동수집 장치의 설치·운영 및 거부에 관한 사항<br>
- 개인정보 자동 수집을 거부하고 있으며, 설치할 계획도 없다.<br>
<br>
제9조 개인정보 안전성 확보 조치<br>
- 개인정보의 유출 방지를 위해 자체 방화벽 기술과 플랫폼 내 보안 기술을 사용한다.<br>
<br>
제12조 개인정보보호책임자, 개인정보보호 및 고충처리 담당자<br>
- 배재학 dbdomino@naver 사이트 운영자</p>

			</div>
		</div>
	</div>
	
</div>
</div>
</div>
</div>
<!-- [E]Modal -->
<script type="text/javascript">
var blnInProgress = false;
var idCk = /^[a-z]+[a-z0-9]{5,19}$/g;
var emailCk = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
var csrfHeaderName = "${_csrf.headerName}";
var csrfTokenValue = "${_csrf.token}";
var idStat=false;
var idtmp='';

function submitForm() {
	if (blnInProgress == true) {alert("등록중입니다. 잠시만 기다려주세요."); return false;}
	if(!chkItem()) {return false;}
	else { 
		//blnInProgress = true;
		console.log("submit 시작");
		$("#form1").attr("action","/sign-up").attr("method", "post");
		$("#form1").submit();
		console.log("submit 끝");
		
	}
}
function chkItem() {
	if(isEmpty($('input[name=nick]').val())) { $('input[name=nick]').val('');  $('input[name=nick]').focus(); $('input[name=nick]').attr('placeholder', '이름/별명을 입력하세요.'); return false;}
	if($('input[name=nick]').val().length > 15) {$('input[name=nick]').val('');  $('input[name=nick]').focus(); $('input[name=nick]').attr('placeholder', '14자 이하로 입력하세요.'); return false;}
	
	if(isEmpty($('input[name=id]').val())) {$('input[name=id]').val('');  $('input[name=id]').focus(); $('input[name=id]').attr('placeholder', 'id를 입력하세요.'); return false;}
	if($('input[name=id]').val().length > 15) {$('input[name=id]').val(''); $('input[name=id]').focus(); $('input[name=id]').attr('placeholder', '14자 이하로 입력하세요.'); return false;}
	if($('input[name=id]').val().length < 6) {$('input[name=id]').val(''); $('input[name=id]').focus(); $('input[name=id]').attr('placeholder', '6자 이상 입력하세요.'); return false;}
	if($('input[name=id]').val().match(idCk) == null) { $('input[name=id]').val('');  $('input[name=id]').focus(); $('input[name=id]').attr('placeholder', '올바른 id를 입력하세요.');  return false;}
	
	if(idtmp != $('input[name=id]').val() || idStat == false) { $('input[name=id]').val('');  $('input[name=id]').focus(); $('input[name=id]').attr('placeholder', 'id확인을 눌러주세요.');  return false;}
	
	if(isEmpty($('input[name=email]').val())) {$('input[name=email]').val('');  $('input[name=email]').focus(); $('input[name=email]').attr('placeholder', 'email을 입력하세요.');  return false;}
	if($('input[name=email]').val().match(emailCk) == null) { $('input[name=email]').val('');  $('input[name=email]').focus(); $('input[name=email]').attr('placeholder', '올바른 email을 입력하세요.');  return false;}
	
	if(isEmpty($('input[name=password]').val())) {$('input[name=password]').val('');  $('input[name=password]').focus(); $('input[name=password]').attr('placeholder', '비밀번호를 입력하세요.');  return false;}
	if(isEmpty($('input[name=confirm-password]').val())) {$('input[name=confirm-password]').empty(); $('input[name=confirm-password]').focus(); $('input[name=confirm-password]').attr('placeholder', '비밀번호를 입력하세요.');  return false;}
	if($('input[name=password]').val().length > 15) {$('input[name=password]').val('');  $('input[name=password]').focus(); $('input[name=password]').attr('placeholder', '14자 이하로 입력하세요.'); return false;}
	if($('input[name=password]').val().length < 7) {$('input[name=password]').val('');  $('input[name=password]').focus(); $('input[name=password]').attr('placeholder', '8자 이상 입력하세요.'); return false;}
	if($('input[name=confirm-password]').val() .length > 15) {$('input[name=confirm-password]').val('');  $('input[name=confirm-password]').focus(); $('input[name=confirm-password]').attr('placeholder', '14자 이하로 입력하세요.'); return false;}
	if($('input[name=confirm-password]').val() .length < 7) {$('input[name=confirm-password]').val('');  $('input[name=confirm-password]').focus(); $('input[name=confirm-password]').attr('placeholder', '8자 이상 입력하세요.'); return false;}
	if($('input[name=password]').val() != $('input[name=confirm-password]').val()){ alert('비밀번호가 같지 않습니다.'); return false;}
	
	if($("input[name=infocheck]:checkbox").is(":checked") == false) { alert('이용약관 및 개인정보 제공 동의 체크해주세요.'); return false;}
	var str="";
	
	console.log("append 실시"); //??? jobj는 머지?
	//formObj.append(str); 안되네
	//$("#form1").append(str); // jquery로 id 찾아서 쓰는게더 편하구만
	
	return true;
}
function isEmpty(toCheck) {
	var chkstr = toCheck + "";
	var is_Space = true;
	if ((chkstr =="")||(chkstr == null)||(chkstr == "undefined")) {
		return true;
	}
	for (j=0; is_Space && (j<chkstr.length); j++)	{
		if (chkstr.substring(j,j+1) != "")
			is_Space = false;
	}
    return ( is_Space );
}
function idCheck() {
	var testid = $('input[name=id]').val();
	
	if(isEmpty(testid)) {$('input[name=id]').val('');  $('input[name=id]').focus(); $('input[name=id]').attr('placeholder', 'id를 입력하세요.'); return false;}
	if(testid.length > 15) {$('input[name=id]').val(''); $('input[name=id]').focus(); $('input[name=id]').attr('placeholder', '14자 이하로 입력하세요.'); return false;}
	if(testid.match(idCk) == null) { $('input[name=id]').val('');  $('input[name=id]').focus(); $('input[name=id]').attr('placeholder', '올바른 id를 입력하세요.');  return false;}
	$.ajax({
		url : '/api/idcheck',
		data: {'id': testid, 'mori': 'morizz'},
		type: 'get', // 값 받을 형식
		dataType: 'text', // 값 받을 타입 json xml html text 가능
		beforeSend: function(xhr) {
			xhr.setRequestHeader(csrfHeaderName, csrfTokenValue);
		},
		success: function (result){
			if (result == 'Y') { idtmp = testid; idStat = true; alert('중복되는 id가 없습니다.');}
			else { idtmp = ''; idStat = false; alert('중복되는 id가 존재합니다. 다른id를 넣어주세요.');}
			
		}
		
	}); // $.ajax
}
</script>
<%@include file="./include/footer-main.jsp" %>