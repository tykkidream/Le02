package demo.le.main.business;

import demo.le.base.model.User;
import demo.le.base.service.UserService;

public class VisitBusiness {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public User login(String username,String password) {
		User user = getUserService().queryByUsername(username);
		if (user != null && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}
}
