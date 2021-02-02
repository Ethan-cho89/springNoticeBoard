<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#wrap{width:600px; margin:auto; text-align: center;}
	#wrap table{width:100%; margin:auto;}
	th{width:200px;}
	table td{text-align: center;}
</style>
</head>
<body>
<div id="wrap">
	<h1>공지게시판</h1>
	<a href="${cp}/list">전체글목록</a> | <a href="${cp }/">홈으로</a><br>
	<table border="2">
		<tr>
			<th>글번호</th>
			<th>작성자</th>
			<th>제목</th>
		</tr>
	<c:forEach var="vo" items="${list}">
		<tr>
			<td>${vo.num}</td>
			<td>${vo.writer}</td>
			<td><a href="${cp}/check?num=${vo.num}">${vo.title}</a></td>
		</tr>
	</c:forEach>
	</table>
	<div>
		<c:if test="${pu.startPageNum>10 }">
			<a href="${cp}/list?pageNum=${pu.startPageNum-1}&field=${field}&keyword=${keyword}">이전</a>
		</c:if>
		<c:forEach var="i" begin="${pu.startPageNum}" end="${pu.endPageNum}" >
			<c:if test="${i==pageNum}">
				<a href="${cp}/list?pageNum=${i}&field=${field}&keyword=${keyword}">[${i}]</a>
			</c:if>
			<a href="${cp}/list?pageNum=${i}&field=${field}&keyword=${keyword}">[${i}]</a>
		</c:forEach>
		<c:if test="${pu.endPageNum<totalPageCount }">
			<a href="${cp}/list?pageNum=${pu.startPageNum+1}&field=${field}&keyword=${keyword}">다음</a>
		</c:if>
	</div>
	<div>
		<form action="${cp}/list" method="post">
			<select name="field">
				<option value="title" <c:if test="${field=='title'}">selected</c:if>>제목</option>
				<option value="content"<c:if test="${field=='content'}">selected</c:if>>내용</option>
				<option value="both"<c:if test="${field=='both'}">selected</c:if>>제목+내용</option>
			</select>
			<input type="text" placeholder="키워드입력" name="keyword" value="${keyword}"><input type="submit" value="검색">
		</form>
	</div>
</div>

</body>
</html>