<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>작성자 확인 페이지</h1>
<h2>${num}번 게시글의 접근권한 확인</h2>
<form action="${cp}/check" method="post">
	<input type="hidden" value="${num}" name="num">
	작성자명 입력<br>
	<input type="text" name="writer"><br>
	작성시 기입한 비밀번호 입력<br>
	<input type="password" name="pwd"><br>
	<input type="submit" value="확인"><br>
</form>
</body>
</html>