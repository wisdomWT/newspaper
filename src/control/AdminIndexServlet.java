package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Users;
import service.IUsersService;
import service.impl.IUsersServiceImpl;

@WebServlet("/adminIndex")
public class AdminIndexServlet extends HttpServlet{
    IUsersService iuserService = new IUsersServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Users> list = iuserService.getAllUsers();
		request.setAttribute("list", list);
		request.getRequestDispatcher("adminIndex.jsp").forward(request, response);
		}
    
}
