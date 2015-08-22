<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>로드뷰 생성하기</title>

</head>
<body>

	<!-- 로드뷰를 표시할 div 입니다 -->
	<div id="roadview" style="width: 100%; height: 300px;"></div>

	<script type="text/javascript"
		src="//apis.daum.net/maps/maps3.js?apikey=88d425fc5450a7b96c9b1e00bc9a0897"></script>


	<script>
		var roadviewContainer = document.getElementById('roadview'); //로드뷰를 표시할 div
		var roadview = new daum.maps.Roadview(roadviewContainer, {
			panoId: 1023434522,
			panoX:126.570667,
			panoY:33.450701,
			pan: 80.24703999999997, // 로드뷰 처음 실행시에 바라봐야 할 수평 각
			tilt: 16.350857142857144, // 로드뷰 처음 실행시에 바라봐야 할 수직 각
			zoom: -1 // 로드뷰 줌 초기값
		}); //로드뷰 객체
		/* var roadviewClient = new daum.maps.RoadviewClient(); //좌표로부터 로드뷰 파노ID를 가져올 로드뷰 helper객체

		var position = new daum.maps.LatLng(33.450701, 126.570667);

		// 특정 위치의 좌표와 가까운 로드뷰의 panoId를 추출하여 로드뷰를 띄운다.
		roadviewClient.getNearestPanoId(position, 50, function(panoId) {
			roadview.setPanoId(panoId, position); //panoId와 중심좌표를 통해 로드뷰 실행
		}); */
	</script>

</body>
</html>