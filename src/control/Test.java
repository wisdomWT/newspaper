package control;

import bean.Users;
import service.IUsersService;
import service.impl.IUsersServiceImpl;

public class Test {
	public static void main(String[] args) {
		String name = "张三丰";
		String password = "123321";
		
		IUsersService iuserServices = new IUsersServiceImpl();
		Users user = new Users(0,null,"123321",null,"15623423132");
		Users result = iuserServices.login(user);
		if(result.getUid()!=0) {
			// 把结果响应前端-ok
			System.out.println("恭喜，注册成功");
		}else {
			// 把结果响应前端-no ok
			System.out.println("网络原因，注册失败，请重新注册");
	    }
		System.out.println(result.getUid());
		System.out.println(result.getNickname());
    }
}
