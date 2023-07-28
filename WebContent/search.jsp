<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
   <script type="text/javascript" src="img/jquery-1.11.3.js"></script>
   <script type="text/javascript" src="jbs/bs-3.3.5-dist/js/bootstrap.js"></script>
   <link rel="stylesheet" href="jbs/bs-3.3.5-dist/css/bootstrap.css">
</head>
	<body>
	<!-- 导航 -->
	    <jsp:include page="header.jsp"></jsp:include>
	
	<!-- 系统推荐 -->
		<div class="container-fluid" style="margin-left: 50px;margin-right: 50px;">
		<img src ="img/header.png" width="1500PX" height="120PX" style="margin-left:-58px;magrin-right:-45px">
			<h3>搜索结果</h3><hr>
			<div class="row" style="width: 100%;">
			  <div class="col-md-3" style="padding-left: 7px;padding-right: 7px;">
			    <div class="thumbnail">
			      <img src="img/rmrb.jpg"  style="height: 400px;" alt="...">
			      <div class="caption"><hr>
			        <p>人民日报 &emsp;&emsp;&emsp;3r&emsp;&emsp;&emsp;&nbsp;        <button type="submit" class="btn btn-success">点我订阅</button></p>
			      </div>
			    </div>
			  </div>
			</div>
		</div>
	
	
	 <!-- 底部-->	
		<jsp:include page="footer.html"></jsp:include>
	</body>
</html>