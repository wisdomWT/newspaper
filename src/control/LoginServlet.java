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

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	IUsersService iuserServices = new IUsersServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 登录：
		 *   ① 获取登录信息
		 *   ② 调用service得到是否登录的结果
		 *   ③ 响应：
		 *      A、能登录   跳转到index.jsp
		 *      B、不能登录  跳转login.jsp
		 */
		request.setCharacterEncoding("UTF-8");
		String nickNameorphone = request.getParameter("nickNameorphone");
		String password = request.getParameter("password");
		String flag = request.getParameter("flag");
		Users user = new Users(0,null,password,null,nickNameorphone);
   
		Users result = iuserServices.login(user);
		if(result.getUid()!=0) {
			// 登录成功：跳转到首页
			/*
			 * 会话概念：
			 *      当打开一个浏览器就创建了一次会话，只要浏览器不关闭，都是属于同一个会话中。
			 *    当浏览器关闭时，当前会话就结束。
			 * 会话对象:session，作用域是整个会话
			 */
			request.getSession().setAttribute("nickName", result.getNickname());
			if("1".equals(flag)) {
				response.sendRedirect("homepage");
			}else {
				response.sendRedirect("adminIndex");
			}
		}else {
			// 登录失败：跳转到登录页面
			request.setAttribute("info", "用户名或密码错误");
			if("2".equals(flag)) {
				request.getRequestDispatcher("adminlogin.jsp").forward(request, response);
			}else {
			    request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
	}
}
