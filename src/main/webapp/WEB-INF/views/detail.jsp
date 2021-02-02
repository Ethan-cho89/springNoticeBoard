<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>글수정</h1>
<form method="post" action="${cp}/update">
	<input type="hidden" name="num" value="${vo.num}">
	작성자<br><input type="text" name="writer" value="${vo.writer}"><br>
	비밀번호<br><input type="text" name="pwd" value="${vo.pwd}"><br>
	제목<br><input type="text" name="title"value="${vo.title}"><br>
	내용<br><textarea rows="5" cols="50" name="content">${vo.content}</textarea><br>
	<input type="submit" value="수정">
</form>
	<a href="${cp}/delete?num=${vo.num}">삭제</a>
</body>
</html>