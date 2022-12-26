<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>m1BoardOne</title>
	</head>
	<body>
		<h1>상세내용</h1>
		<div>
			<table border="1">
				<thead>
					<tr>
						<th>제목</th>
						<th>내용</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${board.title}</td>
						<td>${board.content}</td>
					</tr>
				</tbody>
			</table>
			<div>
				<a href="${pageContext.request.contextPath}/ModifyBoardForm?no=${board.no}">수정</a>
				<a href="${pageContext.request.contextPath}/RemoveBoard?no=${board.no}">삭제</a>
			</div>
		</div>
	</body>
</html>