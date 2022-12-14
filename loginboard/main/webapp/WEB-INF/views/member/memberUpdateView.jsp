<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<script	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<title>회원정보수정</title>
</head>
<script type="text/javascript">
	$(document).ready(function() {
		//목록 이동
		$(".cancle").on("click", function() {
			location.href = "/board/list";
		});
		
		$("#submit").on("click", function() {
			
			if ($("#userPass").val() == "") {
				alert("비밀번호를 입력해 주세요.");
				$("#userPass").focus();
				return false;
			}
			if ($("#userName").val() == "") {
				alert("성명을 입력해 주세요");
				$("#userName").focus();
				return false;
			}
		});
	});
</script>
<body>
	<section id="container">
		<form action="/member/memberUpdate" method="post">
			
			<div class="form-group has-feedback">
				<label class="control-label" for="userId">아이디</label> 
				<input class="form-control" type="text" id="userId" name="userId" value="${member.userId}" readonly="readonly"/>
			</div>
			
			<div class="form-group has-feedback">
				<label class="control-label" for="userPass">패스워드</label> 
				<input class="form-control" type="password" id="userPass" name="userPass" />
			</div>
			
			<div class="form-group has-feedback">
				<label class="control-label" for="userName">성명</label> 
				<input class="form-control" type="text" id="userName" name="userName" value="${member.userName}" />
			</div>
			
			<div class="form-group has-feedback">
				<button class="btn btn-success" type="submit" id="submit">회원정보수정</button>
				<button class="cancle btn btn-danger" type="button">목록 이동</button>
			</div>
		</form>
	</section>


</body>
</html>