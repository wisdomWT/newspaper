<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
   <script type="text/javascript" src="img/jquery-1.11.3.js"></script>
   <script type="text/javascript" src="jbs/bs-3.3.5-dist/js/bootstrap.js"></script>
   <link rel="stylesheet" href="jbs/bs-3.3.5-dist/css/bootstrap.css">
</head>
	<body>
	  <!-- 导航 -->
	    <jsp:include page="header.jsp"></jsp:include>
		 
		  <div class="container-fluid">
		   <div class="row" style="padding-top: 40px;">
		   <h3>管理员登录<small>欢迎你,我的朋友</small></h3><hr>
		    <div class="col-md-6">
		     <img src="img/logo.jpg"  style="margin-left: 230px; height: 400px; width: 400px; "alt="...">
		    </div>
		     <div class="col-md-6">
				<form class="form-horizontal" style="margin-right: 70px; padding-top: 70px;" action="login" method="post">
			  <input type="hidden" name="flag" value="2">
			  <span style=" margin-left: 116px;color: #F00;" >${info }</span>
			  <div class="form-group" >
			    <label for="inputEmail3" class="col-sm-2 control-label">账号</label>
			    <div class="col-sm-10">
			      <input type="text" name="nickNameorphone" class="form-control" id="inputname" placeholder="请输入昵称或手机号">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
			    <div class="col-sm-10">
			      <input type="password" name="password" class="form-control" id="inputPassword" placeholder="Password">
			    </div>
			  </div>
		
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-success">登录</button>
			    </div>
			  </div>
			</form>
			</div>
	     </div>
      </div>
		
	 <!-- 底部-->	
	<div class="form-group" style="margin-top: 150px;">
	<jsp:include page="footer.html"></jsp:include>
	</div>
	</body>
</html>