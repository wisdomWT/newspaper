<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
	<body>
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
		       <c:if test="${null != nickName}">
		        <li><a href="#">我的订阅</a></li>
		       </c:if>
		       <c:if test="${null == nickName}">
		        <li><a href="login.jsp">请登录</a></li>
		       </c:if>
		        <li><a href="adminlogin.jsp">后台管理</a></li>
		      </ul>
		      
			  <form class="navbar-form navbar-left" style="margin-left: 200px;">
		        <div class="form-group">
		          <input type="text" class="form-control" placeholder="人民日报">
		        </div>
		        <button type="submit" class="btn btn-default">搜索</button>
		      </form>
		      
		      
		      <ul class="nav navbar-nav navbar-right">
		       <c:if test="${null == nickName}">
		        <li><a href="login.jsp" >登录</a></li>
		        <li><a href="register.jsp" >注册</a></li>
	          </c:if>
	           <c:if test="${null != nickName}">
	        	<li><a>欢迎：${nickName }</a></li>
		        <li class="dropdown">
		          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">个人中心 <span class="caret"></span></a>
		          <ul class="dropdown-menu">
		            <li><a href="shoppingcart">购物车</a></li>
		            <li><a href="orders">我的订单</a></li>
		            <li><a href="#">我的信息</a></li>
		            <li role="separator" class="divider"></li>
		            <li><a href="logout">注销</a></li>
		          </ul>
		        </li>
		        </c:if>
		      </ul>
		    </div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
		</nav>

</body>
</html>