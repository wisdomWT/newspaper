<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
   <script type="text/javascript" src="img/jquery-1.11.3.js"></script>
   <script type="text/javascript" src="jbs/bs-3.3.5-dist/js/bootstrap.js"></script>
   <link rel="stylesheet" href="jbs/bs-3.3.5-dist/css/bootstrap.css">
</head>
	<body>
		<!-- 导航 -->
	    <jsp:include page="header.jsp"></jsp:include>	
	    
	     <div class="container-fluid">
	   <div class="row" style="padding-top: 40px;">
	    <div class="col-md-6">
	     <img src="img/logo.jpg"  style="margin-left: 230px; height: 400px; width: 400px; "alt="...">
	    </div>
	     <div class="col-md-6">
	     <form class="form-horizontal" style="margin-right: 70px; padding-top: 70px;" action="register" method="post">
		  <div class="form-group" >
		    <label for="inputEmail3" class="col-sm-2 control-label">昵称</label>
		    <div class="col-sm-10">
		      <input type="text" name="nickName" class="form-control" id="inputnickName" placeholder="请输入昵称">
		    </div>
		    </div>
		    <div class="form-group" >
		    <label for="inputEmail3" class="col-sm-2 control-label">姓名</label>
		    <div class="col-sm-10">
		      <input type="text" name="name" class="form-control" id="inputname" placeholder="请输入姓名">
		    </div>
		    </div>
		     <div class="form-group" >
		    <label for="inputEmail3" class="col-sm-2 control-label">手机号</label>
		    <div class="col-sm-10">
		      <input type="text" name="phonenumber" class="form-control" id="inputphone" placeholder="请输入手机号">
		    </div>
		    </div>
		   <div class="form-group">
		    <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
		    <div class="col-sm-10">
		      <input type="password" name="password" class="form-control" id="inputPassword" placeholder="Password">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-2 control-label">确认密码</label>
		    <div class="col-sm-10">
		      <input type="password" class="form-control" id="inputPassword" placeholder="Password">
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-success">注册</button>
		    </div>
		  </div>
		</form>
       </div>
     </div>
      </div>
			
		
	 <!-- 底部-->	
	 <div class="form-group" style="margin-top: 150px;">
		<jsp:include page="footer.html"></jsp:include>
	</body>
</html>