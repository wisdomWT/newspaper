<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>用户信息</title>
	   <script type="text/javascript" src="img/jquery-1.11.3.js"></script>
	   <script type="text/javascript" src="jbs/bs-3.3.5-dist/js/bootstrap.js"></script>
	   <link rel="stylesheet" href="jbs/bs-3.3.5-dist/css/bootstrap.css">
	</head>
	<body>
		<div class="container-fluid">
			<!-- 导航栏 -->
		 	<jsp:include page="header.jsp"></jsp:include>
		</div>	
		
		<div class="col-md-2">
		<img src="img/bklogo2.jpg" style="width: 280px; height: 90px; padding-left: 20px;">
		</div>
		<div class="col-md-2">
		<h1 style="font-size: 30px; padding-top: 10px; padding-left: 55px;">个人信息</h1>
		</div>
		<!-- 用户详情-->
		<div class="container-fluid" style="margin-left: 50px;margin-right: 50px;margin-top:100px;">
        <hr>
			<div class="row" style="width: 100%;">
			   <div class="col-md-3" style="padding-top: 10px;">
			   </div>
			   <div class="col-md-3">
			      <img src="img/ytg.jpg" class="img-circle" style="width: 100%;">
			   </div>
			   <div class="col-md-3" style="padding-top: 10px;">
			   <br> <br>
			   	   <h2>姓名：袁天罡</h2>
			   </div>
			   <div class="col-md-3">
			   </div>
			</div>
			<hr>
			<div class="row" style="width: 100%;">
				<div class="col-md-4 text-center" style="padding-top: 10px;">
				<h3>uid: 4</h3>
			    </div>
				<div class="col-md-4 text-center" style="padding-top: 10px;">
				<h3>昵称：不良帅</h3>
			    </div>
				<div class="col-md-4 text-center" style="padding-top: 10px;">
				<h3>密码：131331</h3>
			    </div>
			</div>
			<div class="row" style="width: 100%;">
				<div class="col-md-4 text-center" style="padding-top: 10px; padding-left: 80px">
				<h3>&emsp;电话：18923133132</h3>
			    </div>
				<div class="col-md-4 text-center" style="padding-top: 10px;">
				<h3></h3>
			    </div>
				<div class="col-md-4 text-center" style="padding-top: 10px;">
			    </div>
			</div>
			<div class="row text-right" style="width: 100%;">
				<a type="button" class="btn btn-success" href="userInfo?flag=2">修改个人信息</a>
			</div>
		</div>
	<div class="form-group" style="margin-top: 150px;">
	<jsp:include page="footer.html"></jsp:include>
	</div>
	</body>
</html>