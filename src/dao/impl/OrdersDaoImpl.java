package dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import bean.Orders;
import dao.OrdersDao;
import util.JDBCUtil;

public class OrdersDaoImpl implements OrdersDao{

	@Override
	public List<Orders> getOrders() {
		Connection conn = JDBCUtil.getConn();
		String sql = "select * from orders_info";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Orders> list = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			list = new ArrayList<Orders>();
			while (rs.next()) {
				int item_id = rs.getInt("item_id");
				String item_name = rs.getString("item_name");
				int unit_price = rs.getInt("unit_price");
				int amount = rs.getInt("amount");
				int total_price = rs.getInt("total_price");
				String condition = rs.getString("condition");
				list.add(new Orders(item_id,item_name,unit_price,amount,total_price,condition));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, rs);
		}
		return list;
	}
		

}
