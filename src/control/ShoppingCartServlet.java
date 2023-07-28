package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ShoppingCart;
import service.ShoppingCartService;
import service.impl.ShoppingCartServiceImpl;

@WebServlet("/shoppingcart")
public class ShoppingCartServlet extends HttpServlet{
    private ShoppingCartService shoppingCartService = new ShoppingCartServiceImpl();
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ShoppingCart> list = shoppingCartService.getShoppingCarts();
		request.setAttribute("list", list);
		request.getRequestDispatcher("shoppingcart.jsp").forward(request, response);
	}
}
