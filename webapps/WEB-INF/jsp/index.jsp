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

			<div id="theGrid" class="main">
				<section class="grid">
					<!-- <c:forEach var="product" items="${products}">
						<div class = "product col s5 m3 l3">
							<a href="/shop/${shop.url}/product/${product.id}">
							<img src="${product.imgUrl}" style="width:100%; height=100%;">
							
							<div class="product_text_con">
								<div class="product_text">${product.name}</div>
								<div class="price">${product.price}원</div>
							</div>
							</a>
						</div>
					</c:forEach> -->



					<a class="grid__item" href="#">
						<h2 class="title title--preview"></h2>
						<div class="loader"></div>

						<div class="grid_img">
							<!-- <img src ="http://i.imgur.com/f5IpKxe.png"> -->
						</div>

						<!-- <span class="category">Stories for humans</span> -->
						<div class="meta meta--preview">
							<!-- <img class="meta__avatar" src="img/authors/1.png" alt="author01" />  -->
							<span class="meta__date"><i class="fa fa-calendar-o"></i> 9 Apr</span>
							<span class="meta__reading-time"><i class="fa fa-clock-o"></i> 모집중</span>
						</div>
					</a>
					<a class="grid__item" href="#">
						<h2 class="title title--preview"></h2>
						<div class="loader"></div>

						<div class="grid_img2">
						</div>

						<div class="meta meta--preview">
							<span class="meta__date"><i class="fa fa-calendar-o"></i> 7 Apr</span>
							<span class="meta__reading-time"><i class="fa fa-clock-o"></i> 마감</span>
						</div>
					</a>
					<a class="grid__item" href="#">
						<h2 class="title title--preview"></h2>
						<div class="loader"></div>
						<span class="category">Nutrition</span>
						<div class="meta meta--preview">
							<img class="meta__avatar" src="img/authors/3.png" alt="author03" /> 
							<span class="meta__date"><i class="fa fa-calendar-o"></i> 6 Apr</span>
							<span class="meta__reading-time"><i class="fa fa-clock-o"></i> 2 min read</span>
						</div>
					</a>
					<a class="grid__item" href="#">
						<h2 class="title title--preview">Hope for Amy Walters</h2>
						<div class="loader"></div>
						<span class="category">Life &amp; Death</span>
						<div class="meta meta--preview">
							<img class="meta__avatar" src="img/authors/4.png" alt="author04" /> 
							<span class="meta__date"><i class="fa fa-calendar-o"></i> 6 Apr</span>
							<span class="meta__reading-time"><i class="fa fa-clock-o"></i> 2 min read</span>
						</div>
					</a>
					<a class="grid__item" href="#">
						<h2 class="title title--preview">My Father told me...</h2>
						<div class="loader"></div>
						<span class="category">Nature vs. Nurture</span>
						<div class="meta meta--preview">
							<img class="meta__avatar" src="img/authors/5.png" alt="author05" /> 
							<span class="meta__date"><i class="fa fa-calendar-o"></i> 6 Apr</span>
							<span class="meta__reading-time"><i class="fa fa-clock-o"></i> 2 min read</span>
						</div>
					</a>
					<a class="grid__item" href="#">
						<h2 class="title title--preview">What Happens in the Brain?</h2>
						<div class="loader"></div>
						<span class="category">Neuroscience</span>
						<div class="meta meta--preview">
							<img class="meta__avatar" src="img/authors/6.png" alt="author06" /> 
							<span class="meta__date"><i class="fa fa-calendar-o"></i> 6 Apr</span>
							<span class="meta__reading-time"><i class="fa fa-clock-o"></i> 2 min read</span>
						</div>
					</a>
					

					<footer class="page-meta">
						<span>Load more...</span>
					</footer>
				</section>


				
			</div>
		</div><!-- /container -->
		<script src="js/classie.js"></script>
		<script src="js/main.js"></script>
</body>
</html>