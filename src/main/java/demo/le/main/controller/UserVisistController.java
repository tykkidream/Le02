package demo.le.main.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import demo.le.base.model.User;
import demo.le.main.business.UserBusiness;

@Controller
@RequestMapping("/")
public class UserVisistController {
	private UserBusiness userManager;

	public UserBusiness getUserBusiness() {
		return userManager;
	}

	@Autowired
	public void setUserBusiness(UserBusiness userManager) {
		this.userManager = userManager;
	}
	
	@RequestMapping(value = { "/login" },  method = {RequestMethod.GET })
	public String login(){
		return "login";
	}
	
	@RequestMapping(value = { "/login" },  method = {RequestMethod.POST })
	public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session){
		ModelAndView mav = new ModelAndView();
		
		try {
			User user = getUserBusiness().login(username, password);
			
			if (user != null) {
				mav.setViewName("redirect:" + user.getUsername());
				session.setAttribute("user", user);
			} else {
				mav.setViewName("login");
				mav.addObject("username", username);
			}
		} catch (Exception e) {
			mav.setViewName("login");
			mav.addObject("username", username);
			System.out.println(e.getMessage());
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
	
	@RequestMapping(value = { "/u/{username}" },  method = { RequestMethod.GET })
	public ModelAndView userCenter(@PathVariable("username") String username){
		ModelAndView mav = new ModelAndView();

		mav.setViewName("userCenter");
		
		return mav;
	}
	
	@RequestMapping(value = {"/u/home"},  method = { RequestMethod.GET })
	public ModelAndView userHome(){
		ModelAndView mav = new ModelAndView();

		mav.setViewName("userCenter");
		
		return mav;
	}

}
