<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body id = "update_board_form">
	<div id = "board_section">
		<form name="updateBoardForm" action="/update" method="post">
		<div id = "article_title"><input type="text" name="title" value="${article.title}"/></div>
		<div id = "article_content"><textarea name="content" />${article.content}</textarea></div>
		<input type="hidden" name="id" value="${article.id}" />
		<div id = "submit"><input type="submit" name="submit" value="등록하기" />	</div>
		</form>
	</div>
</body>
</html>