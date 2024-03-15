<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<title>회원가입</title>
</head>
<body>
	<form action="/member/save" method="post">
		<p>이 메 일 : <input type="text" name="memberEmail" placeholder="이메일" id="memberEmail" onblur="emailCheck()"></p>
		<p id="check-result"></p>
		<p>비밀번호 : <input type="text" name="memberPassword" placeholder="비밀번호"></p>
		<p>이   름 : <input type="text" name="memberName" placeholder="이름"></p>
		<p>나   이 : <input type="text" name="memberAge" placeholder="나이"></p>
		<p>전화번호 : <input type="text" name="memberMobile" placeholder="전화번호"></p>
		<input type="submit" value="회원가입">		
		<button onclick="index()">메인화면</button>		
		
	</form>
</body>
<script>
	const emailCheck = () => {
		const email = document.getElementById("memberEmail").value;
		const checkResult = document.getElementById("check-result");
		$.ajax({
			type: "post",
			url: "/member/email-check",
			data: {
				"memberEmail": email
			},
			success: function(res){
				if(res == "ok"){
					console.log("사용가능한 이메일");
					checkResult.style.color = "green";
					checkResult.innerHTML = "사용가능한 이메일";
				}else{
					console.log("이미 사용중인 이메일");
					checkResult.style.color = "red";
					checkResult.innerHTML = "이미 사용중인 이메일";
				}
						
			},
			
			error: function(err){
				console.log("에러발생", err);			
			}
			
		});
		
	}
	
	const index = () => {
		location.href = "/";
	}

</script>
</html>
