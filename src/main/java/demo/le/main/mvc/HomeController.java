package demo.le.main.mvc;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//@Inject
	public HomeController(){
		
	}

	@RequestMapping({"/","/home"})
	public String showHome(Map<String,Object> model){
		
		return "home";
	}
}
