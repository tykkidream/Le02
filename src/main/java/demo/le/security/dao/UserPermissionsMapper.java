package demo.le.security.dao;

import java.util.List;

import tykkidream.keel.mybatis.BaseDao;
import demo.le.security.model.UserPermissions;

public interface UserPermissionsMapper extends BaseDao<UserPermissions>{
	List<UserPermissions> selectByUserId(Long userId);
}