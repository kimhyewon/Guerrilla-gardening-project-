<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body class="main">
    <div class="row"> 
    	<div class="col m1 l2 dummy">dummmy</div>
    	<div class="col s12 m8 l6 noticeContainer">
    		<h2>${notice.header}</h2>
    		<div class="message">
    			${notice.message}
    		</div>
            <a class="home" href="/shop">내 샵으로 돌아가기 </a>
    	</div>
    </div>
</body>

</html>