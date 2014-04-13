package demo.le.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.le.base.model.Persion;
import demo.le.base.service.PersionService;
import tykkidream.keel.spring.SimpleController;

@Controller
@RequestMapping("/persion")
public class PersionController extends SimpleController<Persion> {
	public PersionController() {
		setBasepath("base/persion");
	}
	
	@Autowired(required=false)
	public void setPersionService(PersionService service) {
		super.setBaseService(service);
	}
}
