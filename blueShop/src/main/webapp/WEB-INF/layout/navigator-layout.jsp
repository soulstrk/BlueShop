<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- 헤더부분 -->
<nav class="navbar navbar-expand-lg navbar-white" style="height: 110px;">
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor02">
		<span class="navbar-toggler-icon"></span>
	</button>

	<!-- 메뉴창들 -->
	<div class="collapse navbar-collapse" id="navbarColor02">
		<ul class="navbar-nav" style="margin-left: 300px; height: 100px;">
			<li class="nav-item active">
				<a class="nav-link" href="" data-toggle="modal" data-target="#loginModal" id="login_logout"><b>Login</b></a>
			</li>
			<li class="nav-item active"><a class="nav-link active" href="join.do"><b>Join</b></a></li>
			<li class="nav-item active"><a class="nav-link" href="#"><b>Cart</b></a></li>
			<li class="nav-item active"><a class="nav-link active" href="customerboard.do?cmd=list"><b>FAQ</b></a></li>
			<li class="nav-item active">
				<div class="dropdown">
					<a class="nav-link active dropdown-toggle" href="customerboard.do?cmd=list" data-toggle="dropdown"><b>Picture</b> <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="opainting.do?cmd=oriental&p_kind=서양화">동양화</a></li>
						<li><a href="opainting.do?cmd=oriental&p_kind=동양화">서양화</a></li>
					</ul>
				</div>
			</li>
			<!-- <li class="nav-item active">
				 관리자페이지 처리  &nbsp;  		<div class="dropdown dropright" style="margin-left: 30px;">
			  <button type="button" class="btn btn-dark dropdown-toggle" data-toggle="dropdown">
			    Admin
			  </button>
			  <div class="dropdown-menu">
			    <a class="dropdown-item" href="adminProduct.do?adminNum=1">주문/매출 통계</a>
			    <a class="dropdown-item" href="admin.do?adminNum=1&num=0">회원관리</a>
			    <a class="dropdown-item" href="index.jsp?content1=admin/productEnroll.jsp">상품등록</a>
			    <a class="dropdown-item" href="adminProduct.do?adminNum=3&pageNum=1">상품관리</a>
			    <a class="dropdown-item" href="deliveryManagement.do?cmd=delivering">배송관리</a>
			  </div>
			</div>  
			<script type="text/javascript">
				 $(document)
						.ready(
								function() {
									$('#searchForm').css('left', '455px');
									$('img[src="${pageContext.request.contextPath }/resources/images/hd_logo.png"]').css('left', '150px');
									$('#myPage').css('left', '380px');
									$('.live').css('left', '60px');
									$('#testing').css('left', '170px')
								}) 
			</script>
			</li> -->
			<li class="nav-item active"><a class="navbar-brand" href="/mainList.do"><img src="${pageContext.request.contextPath }/resources/images/hd_logo.png"
					style="width: 223px; height: 45px; position: relative; left: 250px; padding-bottom: 0px;"></a></li>
			<li class="nav-item active" id="myPage"><a class="nav-link" href="#"><b>My page</b></a></li>
			<li class="nav-item active">
				<form class="form-inline my-2 my-lg-2" id="searchForm" style="position: relative; left: 505px;" method="post" action="search.do?pageNum=1">
					<input class="form-control mr-sm-2" type="text" placeholder="Search" name="search" id="searchP" onkeyup="searchW()" autocomplete=off>
					<button class="btn" type="submit">
						<img src="${pageContext.request.contextPath }/resources/images/magnifier.png">
					</button>
				</form>
			</li>
		</ul>
		<div	style="background-color: white; color: black; border: 1px solid; position: relative; left: 270px; top: 280px; width: 240px; z-index: 1; height: 500px; display: none; overflow: scroll; font-family: 'Nanum Gothic', serif; font-weight: bold;"	id="testing"></div>
	</div>
</nav>