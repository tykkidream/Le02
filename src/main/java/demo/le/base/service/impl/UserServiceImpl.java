package demo.le.base.service.impl;

import tykkidream.keel.mybatis.SimpleService;
import demo.le.base.dao.UserMapper;
import demo.le.base.model.User;
import demo.le.base.service.UserService;

public class UserServiceImpl  extends SimpleService<User, UserMapper> implements UserService{
	private UserService This = this;
	
	public UserService This() {
		return This;
	}

	public void This(UserService this1) {
		This = this1;
	}
	@Override
	public User queryByUsername(String username,Object...args) {
		return getBaseDao().selectByUsername(username);
	}

	@Override
	public User login(String username,String password, Object...args) {
		User user = This().queryByUsername(username,args);
		if (user != null && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}

	
}
