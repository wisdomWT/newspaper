<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
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
	    
        <div class="col-md-2">
		<img src="img/bklogo2.jpg" style="width: 280px; height: 90px; padding-left: 20px;">
		</div>
		<div class="col-md-3">
		<h1 style="font-size: 30px; padding-top: 10px; padding-left: 55px;">我的购物车</h1>
		</div>
		<!-- 我的购物车 -->
		<div class="container-fluid" style="margin-left: 50px;margin-right: 50px;padding-top: 160px;">
			<table class="table table-striped table-hover table-bordered">
				<tr>
					<th>ID</th>
					<th>报刊名称</th>
					<th>单价</th>
					<th>数量</th>
					<th>总价</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${list }" var="shoppingcart">
					<tr>
						<td>${shoppingcart.item_id}</td>
						<td>${shoppingcart.item_name }</td>
						<td>${shoppingcart.unit_price}</td>
						<td>${shoppingcart.amount }</td>
						<td>${shoppingcart.total_price }
						<td>
							<button type="button" style="margin-left: 5px;"  class="btn btn-info btn-xs">减少</button>
							
							<span>	
							<button type="button" style="margin-left: 5px;" class="btn btn-success btn-xs ">增加</button>
							<button type="button" style="margin-left: 5px;" class="btn btn-warning btn-xs">删除</button>
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