package demo.le.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.le.base.model.Persion;
import tykkidream.keel.spring.SimpleController;

@Controller
@RequestMapping("/persion")
public class PersionController extends SimpleController<Persion> {
	public PersionController() {
		setBasepath("base/persion");
	}
}
