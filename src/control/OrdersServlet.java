package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Orders;
import service.OrdersService;
import service.impl.OrdersServiceImpl;


@WebServlet("/orders")
public class OrdersServlet extends HttpServlet{
    private OrdersService ordersService= new OrdersServiceImpl();
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Orders> list = ordersService.getoOrders();
		request.setAttribute("list", list);
		request.getRequestDispatcher("orders.jsp").forward(request, response);
	}
}