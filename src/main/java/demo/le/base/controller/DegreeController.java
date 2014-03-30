package demo.le.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import tykkidream.keel.spring.SimpleController;
import demo.le.base.model.Degree;

@Controller
@RequestMapping("/degree")
public class DegreeController extends SimpleController<Degree>{
	public DegreeController() {
		setBasepath("base/degree");
	}
}
