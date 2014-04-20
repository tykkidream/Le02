package demo.le.u.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import demo.le.base.model.User;
import demo.le.base.service.UserService;


@Controller
@RequestMapping("/")
public class HomeController {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = { "/u/{username}" },  method = { RequestMethod.GET })
	public ModelAndView home(@PathVariable("username") String username, HttpSession session){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("u/home");
		
		Object profile = session.getAttribute("profile");
		User user = null;
		
		if(null != profile && profile instanceof User) {
			user = (User)profile;
			if (!user.getUsername().equals(username)) {
				user = getUserService().queryByUsername(username);
			}
		}
		
		mav.addObject("user",user);
		
		return mav;
	}


}
