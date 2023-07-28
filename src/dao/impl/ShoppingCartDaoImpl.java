package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.ShoppingCart;
import dao.ShoppingCartDao;
import util.JDBCUtil;

public class ShoppingCartDaoImpl implements ShoppingCartDao{

	@Override
	public List<ShoppingCart> getShoppingCarts() {
		Connection conn = JDBCUtil.getConn();
		String sql = "select item_id,item_name,unit_price,amount,total_price from shoppingcart";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ShoppingCart> list = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			list = new ArrayList<ShoppingCart>();
			while (rs.next()) {
				int item_id = rs.getInt("item_id");
				String item_name = rs.getString("item_name");
				int unit_price = rs.getInt("unit_price");
				int amount = rs.getInt("amount");
				int total_price = rs.getInt("total_price");
				list.add(new ShoppingCart(item_id,item_name,unit_price,amount,total_price));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, rs);
		}
		return list;
	}
      
}
