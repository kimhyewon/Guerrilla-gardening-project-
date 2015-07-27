<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Guerrilla gardening</title>
<link rel="stylesheet" type="text/css" href="css/main.css">
<link rel="stylesheet" type="text/css" href="css/reset.css">
<script src="js/modernizr.custom.js"></script>
</head>
<body>
	<div class="container" style="width:100%;">
			<header class="top-bar">
				<h2 class="top-bar__headline"></h2>
				<div class="filter">
					<span>Filter by:</span>
					<span class="dropdown">Popular</span>
				</div>
			</header>
			<div id="main_icon">
				<!-- <img src="http://image.spreadshirtmedia.net/image-server/v1/designs/15486559,width=178,height=178/hand-grenade,-flowers,-guerilla-gardening.png" style="width:120px;"> -->
				<div class="main_title_img"><img src="http://i.imgur.com/37ipa4Z.jpg" style="width:115px;"></div>
				<!-- <div class="main_title_img"><img src="http://i.imgur.com/RnO4OrD.jpg" style="width:170px;"></div> -->
				
				<div class="main_title_con">
					<div class="main_title">Guerrilla</div>
					<div class="main_title2">Gardening</div>
				</div>
			</div>

			<div id ="go_to_write"><a href="/write">글 쓰러 가기</a></div>

			<div id="theGrid" class="main">
				<section class="grid">
					<c:forEach var="article" items="${articles}">
						<a class="grid__item" href="/${article.id}">
							<h2 class="title title--preview"></h2>
							<div class="loader"></div>

							<div class="grid_img" style="background-image: url('${article.afterImg}');"></div>

							<div class="meta meta--preview">
								<span class="meta__date"><i class="fa fa-calendar-o"></i> 9 Apr</span>
								<span class="meta__reading-time"><i class="fa fa-clock-o"></i> 모집중</span>
							</div>
						</a>
					</c:forEach>

					<footer class="page-meta">
						<span>Load more...</span>
					</footer>
				</section>


				
			</div>
		</div><!-- 
		<script src="js/classie.js"></script>
		<script src="js/main.js"></script>
		-->
</body>
</html>