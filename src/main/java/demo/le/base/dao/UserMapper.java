package demo.le.base.dao;

import tykkidream.keel.mybatis.BaseDao;
import demo.le.base.model.User;

public interface UserMapper extends BaseDao<User>{
	User selectByUsername(String username);
}