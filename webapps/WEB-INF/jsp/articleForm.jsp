<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body id = "article_form">
	<form name="articleForm" action="/write" method="post">
		<div id = "article_title"><input type="text" name="title" placeholder="제목을 입력하세요."/></div>
		<div id = "address"><input type="text" name="address" placeholder="주소를 입력하세요."/></div>
		<div id = "recruit_count">
			<!-- <table id="select_recruit_count">
			    <tr>
			    	<td style="padding-left:0px; border: 1px solid #bcbcbc;"><button id ="down_button" name="title" style="height:24px;width:23px;text-align:center;border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px;background-color:white;color:#CFCFCF">-</button></td>
					<td style="padding-left:0px; border: 1px solid #bcbcbc;"><input id="recruitCount"name="recruitCount" type="text" value="1" style="width:23px;text-align:center;border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px"/></td>
					<td style="padding-left:0px; border: 1px solid #bcbcbc;"><button id = "up_button" style="width:23px;text-align:center;border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px;background-color:white;color:#CFCFCF;">+</button></td>
				</tr>
			</table> -->
		</div>
		<input type="file" name="beforeImg" />
		<input type="file" name="afterImg" />
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
		</div>
		<!-- <input type="hidden" name="userId" value="${article.userId}" /> -->
		<!-- <input type="hidden" name="id" value="${article.id}" /> -->
		<div id = "submit_button" class="row"><input type="submit" name="submit" value="확인" /></div>
	</form>
		
		
	
</body>
</html>