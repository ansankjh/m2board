<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>m1ModifyBoardForm</title>
	</head>
	<body>
		<h1>수정</h1>
		<form action="${pageContext.request.contextPath}/ModifyBoardAction" method="post">
			<input type="hidden" name="no" value="${board.no}">
			<table border="1">
				<thead>
					<tr>
						<th>title</th>
						<th>content</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							<input type="text" name="title" value="${board.title}">
						</td>
						<td>
							<textarea rows="5" cols="50" name="content">${board.content}</textarea>
						</td>
					</tr>
				</tbody>
			</table>
			<div>
				<button type="submit">수정</button>
			</div>
		</form>
	</body>
</html>