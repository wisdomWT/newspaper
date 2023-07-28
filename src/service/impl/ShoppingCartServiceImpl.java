package service.impl;

import java.util.List;

import bean.ShoppingCart;
import dao.ShoppingCartDao;
import dao.impl.ShoppingCartDaoImpl;
import service.ShoppingCartService;

public class ShoppingCartServiceImpl implements ShoppingCartService{
    private ShoppingCartDao shoppingCartDao = new ShoppingCartDaoImpl();
		
		
	/**
	 *获取购物车信息
	 *@return List<ShoppingCart>
	 */
	@Override
	public List<ShoppingCart> getShoppingCarts() {
		List<ShoppingCart> list = shoppingCartDao.getShoppingCarts();
		return list;
	}

}
