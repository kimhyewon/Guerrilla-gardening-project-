<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<jsp:scriptlet>
pageContext.setAttribute("space", " ");
pageContext.setAttribute("lf", "\n");
</jsp:scriptlet>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body id = "show_article">
	<!-- article 본문 부분 --> 
	<!-- <input type="hidden" name="boardId" value="${board.id}" />
	<input type="hidden" name="shopUrl" value="${shop.url}" /> -->
	<div id = "show_article">
		<table>
			<tr>
				<div id = "show_article_title">제목 : ${article.title}</div>
			</tr>
			<tr>
				<div id = "show_article_date">작성 시간 : ${article.articleTime}<fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="" /></div>
			</tr>
			<tr>
				<div id = "show_article_content">${fn:replace(article.content, lf, "<br/>")}</div>
			</tr>
		</table>
	</div>

	<!-- 댓글 리스트 -->
	<div id="comments">
		<c:forEach var="articleComment" items="${comments}">
			<form method="post" action="/delete/answer" >
				<input type="hidden" name="articleId" value="${article.id}" />
				<input type="hidden" name="userId" value="${articleComment.userId}" />
				<input type="hidden" name="commentTime" value="${articleComment.commentTime}" />

					<table>
						<tr>
							<td style="width:15%; table-layout:fixed; word-break:break-all;"><span class="comment-author">${articleComment.userId}</span></td> 
							<td style="width:65%; table-layout:fixed; word-break:break-all;" align="left" ><div class="about">${articleComment.content}</div></td> 
							<td style="width:24%; table-layout:fixed; word-break:break-all;" ><span class="comment-date" value="">${articleComment.commentTime}</span></td>
							<td style="width:5%; table-layout:fixed; word-break:break-all;" ><input type="image" src="/img/xbutton.png" style="width:10px; height=10px;">
							</td>
						</tr>	
					</table>
						
				</div>
			</form>
		</c:forEach>
	</div>

	<!-- 댓글 작성 부분 -->
	<div class="answerWrite">
		<form method="post" action="/save/answer" method="post">
			<input type="hidden" name="articleId" value="${article.id}" />
			<div id = "comment_writer">아이디</div>
			<input type="text" name="userId" id="userId" />
			<div id = "comment_content">내용</div>
			<textarea name="content" id="content"></textarea>
			<input type="submit" value="저장" />
		</form>
	</div>

	<!-- <div id="answerWrite">
		<form>
			<input type="hidden" name="articleId" value="${article.id}" />
			
			<div id = "comment_writer">아이디<br />
				${articleComment.userId}
			</div>
			<div id = "comment_content">
				<textarea name="content" id="content" style="width:545px; height:47px;"></textarea>
			</div>
			<input type="hidden" name="url" value="/api/article/comment/create"/>
			<input type="submit" value="저장" />
		</form>
	</div> -->

	<!-- article 본문 수정, 삭제  --> 
	<div id ="update_button"><a href="/update/${article.id}">글 수정</a></div>
	<div id ="delete_button">
		<form method="post" action="/delete" >
			<input type="hidden" name="articleId" value="${article.id}" />
			<input type="submit" value="글 삭제" />
		</form>
	</div>
</body>
<!-- <script src="/js/jado.js"></script> -->
</html>