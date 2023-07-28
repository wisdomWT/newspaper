<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>用户信息管理</title>
	    <script type="text/javascript" src="img/jquery-1.11.3.js"></script>
	    <script type="text/javascript" src="jbs/bs-3.3.5-dist/js/bootstrap.js"></script>
	    <link rel="stylesheet" href="jbs/bs-3.3.5-dist/css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="js/toastr/toastr.css" />
		<script type="text/javascript" src="jbs/toastr/toastr.js"></script>
		<script type="text/javascript" src="jbs/adminIndex.js"></script>
		
		<script type="text/javascript">
			toastr.options = {
					  "closeButton": true,
					  "timeOut": "2000",   
					  "showMethod": "fadeIn",
					  "hideMethod": "fadeOut"
					}
			/*
			$(function(){
				toastr.error("操作成功", "温馨提示");
			})
			*/
		</script>
	</head>
	<body>
		<div class="container-fluid">
			<!-- 导航 -->
		<nav class="navbar navbar-default">
		  <div class="container-fluid">
		    <!-- Brand and toggle get grouped for better mobile display -->
		    <div class="navbar-header">
		       <a class="navbar-brand" style="padding-top:2px;" href="homepage">
		       <img src="img/logo.jpg" style="height: 48px; width: 50px;">
		       </a>
		    </div>
		
		    <!-- Collect the nav links, forms, and other content for toggling -->
		    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		      <ul class="nav navbar-nav">
		      <%String uri = request.getRequestURL().toString();
				String filename = uri.substring(uri.lastIndexOf("/")+1);
		    	String homepagepath = "homepage.jsp";
		    	if(!homepagepath.equals(filename)){
		    		%>
		    		 <li><a href="homepage">返回首页</a></li>
		    		 <% 
		    	}
		    	%>
		        <li><a href="adminNewspaper">报刊信息管理</a></li>
		      </ul>
		      
			  <form class="navbar-form navbar-left" style="margin-left: 200px;">
		        <div class="form-group">
		          <input type="text" class="form-control" placeholder="人民日报">
		        </div>
		        <button type="submit" class="btn btn-default">搜索</button>
		      </form>
		      
		      
		      <ul class="nav navbar-nav navbar-right">
	        	<li><a>欢迎：${nickName }</a></li>          
		            <li><a href="logout">注销</a></li>
		      </ul>
		    </div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
		</nav>
               <div class="col-md-2">
		<img src="img/bklogo2.jpg" style="width: 280px; height: 90px; padding-left: 20px;">
		</div>
		<div class="col-md-2">
		<h1 style="font-size: 30px; padding-top: 10px; padding-left: 55px;">用户管理</h1>
		</div>
		</div>	
		<!-- 系统推荐 -->
		<div class="container-fluid" style="margin-left: 50px;margin-right: 50px;margin-top:80px;">
			<table class="table table-striped table-hover table-bordered">
				<tr>
					<th>ID</th>
					<th>昵称</th>
					<th>姓名</th>
					<th>电话</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${list }" var="user">
					<tr>
						<td>${user.uid }</td>
						<td>${user.nickname }</td>
						<td>${user.name }</td>
						<td>${user.phonenumber }</td>
						<td>
							<button type="button" style="margin-left: 5px;" class="btn btn-warning btn-xs">禁用</button>
							<span>
						<button type="button" style="margin-left: 5px;" uid="${user.uid }"  class="btn btn-success btn-xs tuijian">修改</button>
							</span>
						</td>
					</tr> 
				</c:forEach>
			</table>
		</div>
	<!-- 底部-->	
	<div class="form-group" style="margin-top: 150px;">
	<jsp:include page="footer.html"></jsp:include>
	</div>
	</body>
</html>