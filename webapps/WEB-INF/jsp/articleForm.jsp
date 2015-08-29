<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/articleForm.css">
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script type="text/javascript"  src="js/test.js"></script>

</head>
<body>
	<div id = "article_form_container">
		<form name="articleForm" action="/write" method="post" enctype="multipart/form-data">
			<div id ="article_form">
				<div id = "article_title">제목 : <input type="text" name="title" placeholder="제목을 입력하세요."/></div>
				<div id = "address">주소 : <input type="text" name="address" placeholder="주소를 입력하세요."/></div>
				<div id = "recruit_count">
					<div id="recruit_count_text">모집 인원 : </div>
					<table id="select_recruit_count">
					    <tr>
					    	<td style="padding-left:0px; border: 1px solid #bcbcbc;"><button id ="down_button" name="title" style="height:24px;width:23px;text-align:center;border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px;background-color:white;color:#CFCFCF">-</button></td>
							<td style="padding-left:0px; border: 1px solid #bcbcbc;"><div id="recruitCount"name="recruitCount" type="text" value="1" style="width:23px;text-align:center;border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px"/>1</td>
							<td style="padding-left:0px; border: 1px solid #bcbcbc;"><button id = "up_button" style="width:23px;text-align:center;border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px;background-color:white;color:#CFCFCF;">+</button></td>
						</tr>
					</table>
				</div>
				<div id ="visible_btn" onclick="visible()"></div>
				<div id ="img_container" style="display:none;">
				

				<!-- img 시작  -->
					<div id = "before-img">
						사진 등록<br /><input type="file" name="file" style="text-align:center; width:150px;"/>
						<input type="hidden" name="localLocation" value="/userImg/beforeImg">
					</div>

					<div id="area" style="width:600px";></div>

					<div id ='square-list' style="display:none">
						<div class = 'square-wrapper'>
							<div class="square">
								<img class="0" src="img/dragndrop/0.png" height="60" width="60">
							</div> 	
						</div>
						<div class = 'square-wrapper'>
							<div class="square">
								<img class="1" src="img/dragndrop/1.png" height="60" width="60">
							</div>
						</div>
						<div class = 'square-wrapper'>
							<div class="square">
								<img class="2" src="img/dragndrop/2.png" height="60" width="60">
							</div>
						</div>
						<div class = 'square-wrapper'>
							<div class="square">
								<img class="3" src="img/dragndrop/3.png" height="60" width="60">
							</div>
						</div>
						<div class = 'square-wrapper'>
							<div class="square">
								<img class="4" src="img/dragndrop/4.png" height="60" width="60">
							</div>
						</div>
						<div class = 'square-wrapper'>
							<div class="square">
								<img class="5" src="img/dragndrop/5.png" height="80" width="80" style="margin-top:-12px;margin-left:-7px;">
							</div>
						</div>
						<div class = 'square-wrapper'>
							<div class="square">
								<img class="6" src="img/dragndrop/6.png" height="60" width="60">
							</div>
						</div>
						<div class="row">
						</div>
						<div class = 'square-wrapper2'>
							<div class="square">
								<img class="7" src="img/dragndrop/7.png" height="120" width="80">
							</div>
						</div>
						<div class = 'square-wrapper'>
							<div class="square">
								<img class="8" src="img/dragndrop/8.png" height="120" width="80">
							</div>
						</div>
						<div class = 'square-wrapper'>
							<div class="square">
								<img class="9" src="img/dragndrop/9.png" height="120" width="80">
							</div>
						</div>
						<div class = 'square-wrapper'>
							<div class="square">
								<img class="10" src="img/dragndrop/10.png" height="120" width="80">
							</div>
						</div>
						<div class = 'square-wrapper'>
							<div class="square">
								<img class="11" src="img/dragndrop/11.png" height="120" width="80">
							</div>
						</div>
						<div class = 'square-wrapper'>
							<div class="square">
								<img class="12" src="img/dragndrop/12.png" height="120" width="80">
							</div>
						</div>
						<div class = 'square-wrapper'>
							<div class="square">
								<img class="13" src="img/dragndrop/13.png" height="120" width="80">
							</div>
						</div>
						<div class = 'square-wrapper'>
							<div class="square">
								<img class="14" src="img/dragndrop/14.png" height="120" width="80">
							</div>
						</div>
					</div>
					<div class="row">
					</div>
					<!-- <div class = 'square-wrapper'>
						<div class="square">
							<img class="1" src="img/dragndrop/1.png" height="70" width="90" style="margin-top:30px;">
						</div>
					</div>
					<div class = 'square-wrapper'>
						<div class="square">
							<img class="2" src="img/dragndrop/2.png" height="120" width="130" style="margin-left:3px;margin-top:-8px;">
						</div>
					</div>
					<div class = 'square-wrapper'>
						<div class="square">
							<img class="3" src="img/dragndrop/3.png" height="140" width="180" style="margin-top:-10px;padding-left:30px;">
						</div>
					</div> -->
				<!-- 이미지 끝  -->
				</div>
				<!-- <input type="file" name="beforeImg" />
				<input type="file" name="afterImg" /> -->
				<div id = "article_content"><textarea name="content" placeholder="내용을 입력하세요." /></textarea></div>
				<!-- <div id = "recruit_count">
					<select>
					  	<option value="1">1</option>
					  	<option value="2">2</option>
					  	<option value="3">3</option>
					  	<option value="4">4</option>
					  	<option value="5">5</option>
					  	<option value="6">6</option>
					  	<option value="7">7</option>
					  	<option value="8">8</option>
					  	<option value="9">9</option>
					  	<option value="10">10</option>
					  	<option value="11">11</option>
					  	<option value="12">12</option>
					  	<option value="13">13</option>
					  	<option value="14">14</option>
					  	<option value="15">15</option>
					  	<option value="16">16</option>
					  	<option value="17">17</option>
					  	<option value="18">18</option>
					  	<option value="19">19</option>
					  	<option value="20">20</option>
					  	<option value="21">21</option>
					  	<option value="22">22</option>
					  	<option value="23">23</option>
					  	<option value="24">24</option>
					  	<option value="25">25</option>
					  	<option value="26">26</option>
					  	<option value="27">27</option>
					  	<option value="28">28</option>
					  	<option value="29">29</option>
					  	<option value="30">30</option>
					</select> -->
				<!-- <input type="hidden" name="userId" value="${article.userId}" /> -->
				<!-- <input type="hidden" name="id" value="${article.id}" /> -->
				<div id = "submit_button" class="row"><input type="submit" name="submit" value="확인" /></div>
			</div>
		</form>
	</div>	
		
	
	<!-- holder에 upload된 file 바로 보여주기 시작 -->
	<script>
    	var upload = document.getElementsByTagName('input')[2];
        var holder = document.getElementById('area');
        var suqareList = document.getElementById('square-list');
       
      	upload.onchange = function (e) {
        	e.preventDefault();

        	var file = upload.files[0];
            var reader = new FileReader();
        	reader.onload = function (event) {
	          	var img = new Image();
	          	img.src = event.target.result;
	      		img.style.position = "relative";
	        	img.width = 600;
	        	img.height = 400;

	          	holder.innerHTML = '';
	          	holder.width = 600;
	          	holder.appendChild(img);
        	};
        	reader.readAsDataURL(file);
        	return false;
      	};
      	suqareList.style.display = "block";
    </script>
    <!-- holder에 upload된 file 바로 보여주기 끝 -->

</body>
</html>