<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<style type="text/css">
	@import url(http://fonts.googleapis.com/earlyaccess/nanummyeongjo.css);
	@import url(http://fonts.googleapis.com/earlyaccess/jejumyeongjo.css);
	@import url(http://fonts.googleapis.com/earlyaccess/nanumgothic.css);
	@media (min-width: 992px) {
	  body {
	    padding-top: 56px;
	  }
	}
  </style>
  
  <script src="${pageContext.request.contextPath}/resources/js/validator.js"></script>
	
<div class="container" style="padding-left: 240px; padding-top: 80px; padding-bottom: 50px; font-family: 'Jeju Myeongjo', serif; font-size: 25px">
     <div class="page-header">
       <h1>회원가입</h1>
     </div>
     <div class="col-md-9 col-md-offset-3">
       <form role="form" action="#" method="post" name="form">
         <div class="form-group form-group-custom">
           <label for="id">아이디</label>
           <span style="color:red">*</span>&nbsp;&nbsp;
           <button type="button" class="btn btn-secondary" id="idcheck_btn" disabled="disabled">중복검사</button>
           <input type="text" class="form-control" id="mbId" placeholder="아이디 8~12자 영대소문자 와 숫자" name="id" onkeyup="validateCheckId()">
         </div>
         
         <div class="form-group form-group-custom">
           <label for="password">비밀번호</label>
           <span style="color:red">*</span>
           <input type="password" class="form-control" id="password1" placeholder="비밀번호 8~20자 영대소문자와 숫자,특수문자 조합" name="pwd" onkeyup="validateCheckPwd()">
         </div>

         <div class="form-group form-group-custom">
           <label for="password2">비밀번호 확인</label><span style="color:red">*</span>
           <input type="password" class="form-control" id="password2" placeholder="비밀번호 확인을 위해 다시한번 입력 해 주세요" onkeyup="validateCheckEqualPwd()">
         </div><br>
         
         <div class="form-group">
           <label for="name">이름</label><span style="color:red">*</span>
           <input type="text" class="form-control" id="name" placeholder="이름을 입력해 주세요" name="name">
         </div>
         
         <div class="form-check">
		    <input type="radio" class="form-check-input" name="gender" value="남자" checked="checked">남
		 </div>
		 <div class="form-check">
		    <input type="radio" class="form-check-input" name="gender" value="여자">여
		 </div><br>
         
         <div class="form-group">
           <label for="email1">이메일</label><span style="color:red">*</span><br>
             <input type="text" id="email1" size="15" name="email1"> @ <input type="text" id="email2" size="15" name="email2" style="display: inline;">
	<select name="email_select" class="box" id="email_select" onchange="checkemailaddy();" style="margin-left: 300px;">
	    <option value="" selected>선택하세요</option>
	    <option value="naver.com">naver.com</option>
	    <option value="hotmail.com">hotmail.com</option>
	    <option value="hanmail.com">hanmail.com</option>
	    <option value="yahoo.co.kr">yahoo.co.kr</option>
	    <option value="google.com">google.com</option>
	    <option value="yahoo.com">yahoo.com</option>
	    <option value="yahoo.com">yahoo.com</option>
	    <option value="1">직접입력</option>
	</select>
         </div>
         
         <div class="form-group">
           <label for="phone">핸드폰 번호</label><span style="color:red">*</span>
             <input type="text" class="form-control" id="phone" placeholder="- 없이 입력해 주세요" name="phone" onkeyup="phoneChk()">
         </div>
         
         <div class="form-group">
         <label for="addr">주소</label><span style="color:red">*</span><br>
         <input type="text" id="postcode" placeholder="우편번호" name = "postnum" readonly="readonly">
		<input type="button" onclick="execDaumPostcode()" value="우편번호 찾기"><br>
		<input type="text" id="address1" placeholder="도로명 혹은 지번 주소" name = "addr1">
		<input type="text" id="address2" placeholder="상세주소" name = "addr2">
		<span id="guide" style="color:#999"></span>
		</div><br><br>
         
         <div class="form-group text-center">
           <button type="submit" class="btn btn-info" onclick="return finalCheck()">회원가입<i class="fa fa-check spaceLeft"></i></button>
           <button type="reset" class="btn btn-info">가입취소<i class="fa fa-times spaceLeft"></i></button>
         </div>
       </form>
     </div>
   </div>

   <script>
     $(function(){ 

      // 중복체크 버튼
      $("#idcheck_btn").on("click", function() {
        var mbId = $("#mbId").val();

        $.ajax({
          Type : "get",
          dataType : "json",
          url : "${pageContext.request.contextPath}/main/idCheck-proc.do?mbId="+mbId,
          success : function(data) {
            Swal.fire('하이');
          }
        });
      })

     })
   </script>