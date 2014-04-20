package demo.le.main.security;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import demo.le.base.model.User;
import demo.le.security.exception.InsufficientPermissions;
import demo.le.security.model.UserPermissions;
import demo.le.security.service.UserPermissionsService;

public class VisitSecurity {
	private UserPermissionsService usserPermissionService;

	public UserPermissionsService getUsserPermissionService() {
		return usserPermissionService;
	}

	public void setUsserPermissionService(UserPermissionsService usserPermissionService) {
		this.usserPermissionService = usserPermissionService;
	}
	
	public User loginReturning(User user) {

		if (null == user) {
			return null;
		}
		
		List<UserPermissions> list = getUsserPermissionService().queryByUserID(user.getId());
		
		UserPermissions permission = getPermission(list, 10001L);
		
		if (permission.getValue().equals("1")) {
			user.setPassword(null);
		} else {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
			String date = sdf.format(new Date());
			String message = MessageFormat.format("【信息】\t【{0}】\t用户 {1}({2}) 没有登录权限！", date, user.getUsername(), user.getNickname());
			
			System.out.println(message);
			throw new InsufficientPermissions(message);
		}
		
		return user;
	}
	
	private UserPermissions getPermission(List<UserPermissions> ps, Long id) {
		Iterator<UserPermissions> it = ps.iterator();
		while (it.hasNext()) {
			UserPermissions permission = (UserPermissions) it.next();
			if (permission.getPermissionsId().equals(id))
				return permission;
		}
		return null;
	}

}
