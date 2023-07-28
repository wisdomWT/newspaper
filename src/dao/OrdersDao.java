package dao;

import java.util.List;

import bean.Orders;

public interface OrdersDao {
     
	/**
	 * @return List<Orders>
	 */
	public List<Orders> getOrders();
}
