package demo.le.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.le.security.model.Model;
import tykkidream.keel.spring.SimpleController;

@Controller
@RequestMapping("/model")
public class ModelController extends SimpleController<Model> {
	public ModelController() {
		setBasepath("security/model");
	}
}
