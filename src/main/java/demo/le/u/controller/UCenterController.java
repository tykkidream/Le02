package demo.le.u.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UCenterController {


	@RequestMapping(value = {"/u/center"},  method = { RequestMethod.GET })
	public ModelAndView center(){
		ModelAndView mav = new ModelAndView();

		mav.setViewName("u/center");
		
		return mav;
	}

}
