package demo.le.base.service.impl;

import tykkidream.keel.mybatis.SimpleService;
import demo.le.base.dao.UserMapper;
import demo.le.base.model.User;
import demo.le.base.service.UserService;

public class UserServiceImpl  extends SimpleService<User, UserMapper> implements UserService{

	@Override
	public User queryByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
