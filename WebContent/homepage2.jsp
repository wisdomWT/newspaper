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
	<%String uri = request.getRequestURL().toString();
	String filename = uri.substring(uri.lastIndexOf("/")+1);
	%>
	当前文件名称是：<%=filename %>
	</body>
</html>