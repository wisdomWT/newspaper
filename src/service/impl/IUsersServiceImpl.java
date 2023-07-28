package service.impl;

import java.util.List;

import bean.Users;
import dao.IUsersDao;
import dao.impl.IUsersDaoImpl;
import service.IUsersService;

public class IUsersServiceImpl implements IUsersService {
    private IUsersDao iuserDao = new IUsersDaoImpl();
	@Override
	public boolean register(Users user) {
		//调用dao层
		int i = iuserDao.register(user);
		return i>0?true:false;
	}

	@Override
	public Users login(Users user) {
		Users ruser = iuserDao.login(user);
		return ruser; // 小的业务逻辑
	}

	@Override
	public List<Users> getAllUsers() {
		List<Users> allusers = iuserDao.getAllUsers();
		return allusers;
	}
     
}
