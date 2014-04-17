package demo.le.base.service;

import tykkidream.keel.mybatis.BaseService;
import demo.le.base.model.User;

public interface UserService extends BaseService<User> {
	User queryByUsername(String username);
}
