<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>save</title>
</head>
<body>
	<form action="/member/save" method="post">
		<p>아 이 디 : <input type="text" name="memberEmail" placeholder="이메일"/></p>
		<p>비밀번호 : <input type="text" name="memberPassword" placeholder="비밀번호"/></p>
		<p>이   름 : <input type="text" name="memberName" placeholder="이름"/></p>
		<p>나   이 : <input type="text" name="memberAge" placeholder="나이"/></p>
		<p>전화번호 : <input type="text" name="memberMobile" placeholder="전화번호"/></p>
		<input type="submit" value="회원가입" />
	</form>
</body>
</html>