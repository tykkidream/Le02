package demo.le.security.service.impl;

import java.util.List;

import tykkidream.keel.mybatis.SimpleService;
import demo.le.security.dao.UserPermissionsMapper;
import demo.le.security.model.UserPermissions;
import demo.le.security.service.UserPermissionsService;

public class UserPermissionsServiceImpl extends SimpleService<UserPermissions, UserPermissionsMapper> implements UserPermissionsService {

	@Override
	public List<UserPermissions> queryByUserID(Long userID) {
		return getBaseDao().selectByUserId(userID);
	}

}
