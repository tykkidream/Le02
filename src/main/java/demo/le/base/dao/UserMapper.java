package demo.le.base.dao;

import org.apache.ibatis.annotations.Param;

import tykkidream.keel.mybatis.BaseDao;
import demo.le.base.model.User;

public interface UserMapper extends BaseDao<User>{
	User selectByUsername(@Param("username") String username);
}