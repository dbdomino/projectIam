<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@include file="../include/header.jsp" %>
<%@include file="../include/sidebar.jsp" %>   

   
<div class="pcoded-content">
<!-- Page-header start -->
	<div class="page-header">
		<div class="page-block">
			<div class="row align-items-center">
				<div class="col-md-8">
					<div class="page-header-title">
						<h5 class="m-b-10">Dashboard</h5>
						<p class="m-b-0">Welcome to Mega Able</p>
					</div>
				</div>
				<div class="col-md-4">
					<ul class="breadcrumb">
						<li class="breadcrumb-item">
							<a href="index.html"> <i class="fa fa-home"></i> </a>
						</li>
						<li class="breadcrumb-item"><a href="#!">Dashboard</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
<!-- Page-header end -->
<!-- pcoded-inner-content start -->
<div class="pcoded-inner-content">
<!-- Main-body start -->
<div class="main-body">
<div class="page-wrapper">
<!-- Page-body start -->
<div class="page-body">
<!-- Row start -->
<div class="row">
<div class="col-lg-12">
	<!-- tab header start -->
    <div class="tab-header card">
        <ul class="nav nav-tabs md-tabs tab-timeline" role="tablist" id="mytab">
            <li class="nav-item">
                <a class="nav-link active" data-toggle="tab" href="#personal" role="tab">내 정보</a>
                <div class="slide"></div>
            </li>
            
        </ul>
    </div>
    <!-- tab header end -->
	<!-- tab content start -->
    <div class="tab-content">
	<div class="card">
		<div class="card-header">
			<h5 class="card-header-text">내 정보</h5>
			<button type="button" class="btn waves-effect waves-light btn-primary btn-outline-primary f-right" onclick="editProfile();">
				<i class="icofont icofont-check"></i>
			</button>
			<div class="f-right" style="width:5px; height:5px;"></div>
			<button type="button" class="btn waves-effect waves-light btn-primary btn-outline-primary f-right" onclick="openProfile();">
				<i class="icofont icofont-close"></i>
			</button> 
			
		</div>
		<div class="card-block">
                    <div class="view-info">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="general-info">
                                    <div class="row">
                                        <div class="col-lg-12">
<div class="table-responsive">
<sec:authentication property="principal" var="pinfo"/>
<form action="/main/profile-edit" id="form1" method="post">
<table class="table m-0">
<tbody>
	
	<tr>
		<th scope="row">이름</th>
		<td><input type="text" class="form-control" name="nick" value="<sec:authentication property="principal.user.nick"/>" ></td>
	</tr>
	<tr>
		<th scope="row">e-mail</th>
		<td><input type="text" class="form-control" name="email" value="<sec:authentication property="principal.user.email"/>" ></td>
	</tr>
	<tr>
		<th scope="row">비밀번호 재설정</th>
		<td><p>현재비밀번호 <input type="password" name="password" class="form-control"></p>
			<p>변경비밀번호 <input type="password" name="passwordNew" class="form-control"></p>
		</td>
	</tr>
	<tr>
		<th scope="row">프로필 사진</th>
		<td><p> 100px*100px 사이즈의 화면입니다.</p>
			<img name='profileImage' src="/resources/upload/profile/<sec:authentication property="principal.user.profileImage" />" class="img-100" alt="Profile-Image">
			<input type="file" name="profileUploader" class="btn waves-effect waves-light btn-primary btn-outline-primary f-right" onclick="changeImage();">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		</td>
	</tr>
	
	
</tbody>
</table>
</form>
</div>
             </div></div></div></div></div></div>                     
	</div>
    </div>
    <!-- tab content end -->
</div>
</div>
<!-- Row end -->
</div>
<!-- Page-body end -->
</div>

</div>
<!-- Main-body end -->
</div>
<!-- pcoded-inner-content end -->

</div>
<script type="text/javascript">
var blnInProgress = false;
var changeImage = false;
var csrfHeaderName = "${_csrf.headerName}";
var csrfTokenValue = "${_csrf.token}";
var regex = new RegExp("(.*?).(png|PNG|jpg|jpeg)$");
var maxSize = 5242880; // 5MB
function checkExtention(fileName, fileSize) {
	if (fileSize >= maxSize) {
		alert('파일크기 5MB이상 첨부 불가능');
		return false;
	}
	if (!regex.test(fileName)){
		alert('첨부 불가능 파일');
		return false;
	}
	return true;
}
function openProfile() {
	location.href="/main/profile";
}
function changeImage() {
	
}
function editProfile() {
	if (blnInProgress == true) {alert("등록중입니다. 잠시만 기다려주세요."); return false;}
	if(!chkItem()) {return false;}
	else { 
		blnInProgress = true;
		$("#form1").attr("action","/main/profile-edit").attr("method", "post");
		
		$("#form1").submit();
	}
}

function chkItem() {
    
	if(isEmpty($('input[name=nick]').val())) { $('input[name=nick]').val('');  $('input[name=nick]').focus(); $('input[name=nick]').attr('placeholder', '이름/별명을 입력하세요.'); return false;}
	if($('input[name=nick]').val().length > 15) {$('input[name=nick]').val('');  $('input[name=nick]').focus(); $('input[name=nick]').attr('placeholder', '14자 이하로 입력하세요.'); return false;}
	
	if(isEmpty($('input[name=email]').val())) {$('input[name=email]').val('');  $('input[name=email]').focus(); $('input[name=email]').attr('placeholder', 'email을 입력하세요.');  return false;}
	if($('input[name=email]').val().match(emailCk) == null) { $('input[name=email]').val('');  $('input[name=email]').focus(); $('input[name=email]').attr('placeholder', '올바른 email을 입력하세요.');  return false;}
	
	if(isEmpty($('input[name=password]').val())) {$('input[name=password]').val('');  $('input[name=password]').focus(); $('input[name=password]').attr('placeholder', '비밀번호를 입력하세요.');  return false;}
	if($('input[name=passwordNew]').val().length > 15) {$('input[name=passwordNew]').val('');  $('input[name=passwordNew]').focus(); $('input[name=passwordNew]').attr('placeholder', '14자 이하로 입력하세요.'); return false;}
	if($('input[name=passwordNew]').val().length < 7) {$('input[name=passwordNew]').val('');  $('input[name=passwordNew]').focus(); $('input[name=passwordNew]').attr('placeholder', '8자 이상 입력하세요.'); return false;}
	
	if(changeImage == true){
		$.ajax({
			url: '/uploadProfile',
			processData: false,
			contentType: false,
			beforeSend: function(xhr) {
				xhr.setRequestHeader(csrfHeaderName, csrfTokenValue);
			},
			data: formData,
			type: 'POST',
			dataType: 'json',
			success: function(result) {
				console.log("ajaxSuccess");
				console.log("result : " + result);
				showUploadResult(result); // 업로드 결과 처리
				return true;
			}
		});
	} else {
		return true;		
	}
	
	 
	
	
}

function showUploadResult(uploadResultArr) {
	if(!uploadResultArr || uploadResultArr.length ==0 ) { return false; }
	
	var imgtarget = $("input[name='profileImage']");
	$(uploadResultArr).each(function (i, obj){
		console.log("uploadPath : " + obj.uploadPath);
		console.log("all path : "+obj.uploadPath+"/"+obj.newfilename);
		imgtarget.attr("src",obj.uploadPath+"/"+obj.newfilename);
	});
	
}

$("input[type='file']").change(function(){
	console.log("EventStart");
	var formData = new FormData();
	var inputFile = $("input[name='profileUploader']");
	var files = inputFile[0].files;
	for (var i = 0; i < files.length; i++) {
		if(!checkExtention(files[i].name, files[i].size)){
			alert(files[i].name);
			return false;
		}
		formData.append("uploadFile", files[i]);
		alert("trueck ; "+ files[i].name);
	}
	$.ajax({
		url: '/uploadProfile',
		processData: false,
		contentType: false,
		beforeSend: function(xhr) {
			xhr.setRequestHeader(csrfHeaderName, csrfTokenValue);
		},
		data: formData,
		type: 'POST',
		dataType: 'json',
		success: function(result) {
			changeImage = true;
			console.log("ajaxSuccess");
			console.log("result : " + result);
			showUploadResult(result); // 업로드 결과 처리
		}
	});
});
</script>
<%@include file="../include/footer.jsp" %>