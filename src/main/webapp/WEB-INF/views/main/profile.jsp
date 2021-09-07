<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
			<button id="edit-btn" type="button" onclick="editProfile();" class="btn btn-sm btn-primary waves-effect waves-light f-right">
				<i class="icofont icofont-edit"></i>
			</button>
		</div>
		<div class="card-block">
                    <div class="view-info">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="general-info">
                                    <div class="row">
                                        <div class="col-lg-12 col-xl-6">
<div class="table-responsive">
<sec:authentication property="principal" var="pinfo"/>
<table class="table m-0">
<tbody>
	<tr>
		<th scope="row">이름</th>
		<td><sec:authentication property="principal.user.nick"/></td>
	</tr>
	<tr>
                <th scope="row">e-mail</th>
                <td><sec:authentication property="principal.user.email"/></td>
	</tr>
	<tr>
                <th scope="row">프로필 사진</th>
                <td><img src="/resources/upload/profile/<sec:authentication property="principal.user.profileImage" />" class="img-100" alt="Profile-Image"></td>
	</tr>
</tbody>
</table>
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
function editProfile() {
	location.href="/main/profile-edit";
	}
</script>
<%@include file="../include/footer.jsp" %>