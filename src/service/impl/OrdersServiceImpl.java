package service.impl;

import java.util.List;

import bean.Orders;
import bean.newspaper;
import dao.OrdersDao;
import dao.impl.OrdersDaoImpl;
import service.OrdersService;

public class OrdersServiceImpl implements OrdersService{
    private OrdersDao ordersDao = new OrdersDaoImpl();
	@Override
	public List<Orders> getoOrders() {
		List<Orders> list = ordersDao.getOrders();
		return list;
	}

}
