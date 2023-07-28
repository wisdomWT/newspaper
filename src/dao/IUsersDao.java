package dao;

import java.util.List;

import bean.Users;

public interface IUsersDao {
		/**
		 * 用户注册功能
		 * @param user 用户对象
		 * @return int>0:success
		 */
		public int register(Users user);
		
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
