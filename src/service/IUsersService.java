package service;

import java.util.List;

import bean.Users;
public interface IUsersService {
    
	/**
	 * 用户注册功能
	 * @param user 用户对象
	 * @return true:success
	 */
	public boolean register(Users user);
	
	/**
	 * 用户登录功能
	 * @param user
	 * @return Users
	 */
	public Users login(Users user);
	

	/**
	 * 获取所有用户列表，除了admin(uid=1)
	 * @return List<Users> 
	 */
	public List<Users> getAllUsers();
	
}
