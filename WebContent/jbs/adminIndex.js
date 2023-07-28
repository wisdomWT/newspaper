$(function(){
   // 获取class样式为qutui的对象，给其添加一个单击事件
   $(".tuijian").click(function(){
	   // 获取参数
	   var uid = $(this).attr("uid");
	   var status = $(this).attr("status");
	   var obj = $(this);
	  // 异步发送到后台 adminqt
	  $.ajax({
		  url:"adminqt", // 发送到后台的servlet路径
		  type:"post", // 提交请求方式，method="post"
		  dataType:"json", // 数据响应方式：json格式
		  async:true, // 是否异步发送请求
		  data:"uid="+uid+"&indexstatus="+status, // 请求参数
		  success:function(data){  // 响应的回调函数，data为接收响应返回值
			 // 1ok  2nook
			 if(data==1){
				 var str = "<span style='color:#F00;'>已取消</span>";
				 if(status==2){
					 str = "<span style='color:#F00;'>已推荐</span>";
				 }
				 obj.parent().html(str);
				 toastr.success("操作成功!", "温馨提示");
			 }else{
				 toastr.error("操作失败!", "温馨提示");
			 }
		  }
	  });
   })
})