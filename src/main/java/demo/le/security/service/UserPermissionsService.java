package demo.le.security.service;

import java.util.List;

import tykkidream.keel.mybatis.BaseService;
//import demo.le.security.model.Permissions;
import demo.le.security.model.UserPermissions;

public interface UserPermissionsService extends BaseService<UserPermissions> {
	public List<UserPermissions> queryByUserID(Long userID);
}
