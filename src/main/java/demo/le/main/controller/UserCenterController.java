package demo.le.main.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import demo.le.base.model.User;
import demo.le.base.service.UserService;

@Controller
@RequestMapping("/")
public class UserCenterController {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value = { "/login" },  method = {RequestMethod.POST })
	public ModelAndView login(@RequestParam("id") String username, @RequestParam("id") String password, HttpSession session){
		ModelAndView mav = new ModelAndView();
		
		User user = getUserService().queryByKey(username);
		
		if (user != null && user.getPassword().equals(username)) {
			mav.setViewName("login");
			session.setAttribute("user", user);
		} else {
			mav.setViewName("login");
		}
		
		return mav;
	}
	
	@RequestMapping(value = { "/logout" },  method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView logout(){
		ModelAndView mav = new ModelAndView();

		mav.setViewName("logout");
		
		return mav;
	}
	
	@RequestMapping({"/registry"})
	public ModelAndView registry(User user){
		ModelAndView mav = new ModelAndView();

		mav.setViewName("registry");
		
		return mav;
	}
	
	@RequestMapping(value = { "/{username}" },  method = { RequestMethod.GET })
	public ModelAndView userCenter(@RequestParam("username") String username){
		ModelAndView mav = new ModelAndView();

		mav.setViewName("userCenter");
		
		return mav;
	}
	
	@RequestMapping(value = {"/{username}/home"},  method = { RequestMethod.GET })
	public ModelAndView userHome(@RequestParam("username") String username){
		ModelAndView mav = new ModelAndView();

		mav.setViewName("userCenter");
		
		return mav;
	}
}
