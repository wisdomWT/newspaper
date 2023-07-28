package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Users;
import service.IUsersService;
import service.impl.IUsersServiceImpl;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	IUsersService iuserService = new IUsersServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String nickName = request.getParameter("nickName");
		String password = request.getParameter("password");
		String phonenumber = request.getParameter("phonenumber");
		
		
		Users user = new Users(0,nickName,name,password,phonenumber,null);
		boolean result = iuserService.register(user);
		if(result) {
			/* 把结果响应前端-ok: 跳转到首页
			 * 请求跳转方式：
			 *    ① 请求转发
			 *         地址栏url不会发生改变,能够附带数据
			 *    ② 重定向
			 *         地址栏url会发生改变，不会附带数据
			 */
			// 重定向
			response.sendRedirect("homepage");
		}else {
			// 把结果响应前端-no ok ：跳转到注册页重新注册，并提示错误信息
			// 请求转发,附带数据
			request.setAttribute("info", "网络原因，注册失败，请重新注册");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
	}		
	

}
