package demo.le.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import tykkidream.keel.spring.SimpleController;
import demo.le.base.model.Degree;
import demo.le.base.service.DegreeService;

@Controller
@RequestMapping("base/degree")
public class DegreeController extends SimpleController<Degree>{
	public DegreeController() {
		setBasepath("base/degree");
	}

	@Autowired(required=false)
	public void setDegreeService(DegreeService service) {
		super.setBaseService(service);
	}
	
}
