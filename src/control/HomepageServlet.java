package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.newspaper;
import service.HomepageService;
import service.impl.HomepageServiceImpl;

@WebServlet("/homepage")
public class HomepageServlet extends HttpServlet{
	 private HomepageService homepageservice = new HomepageServiceImpl();
	 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        List<newspaper> listnewspaper = homepageservice.getnewsinfo();
	        request.setAttribute("listnewspaper", listnewspaper);
	        request.getRequestDispatcher("homepage.jsp").forward(request, response);
	}
     
      
}
