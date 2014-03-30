package demo.le.base.controller;

import java.util.Map;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tykkidream.keel.base.Page;
import demo.le.base.model.Degree;
import demo.le.base.service.DegreeService;

@Controller
@RequestMapping("/degrees")
public class DegreeController {
	
	private DegreeService degreeService = null;

	public DegreeService getDegreeService() {
		return degreeService;
	}

	public void setDegreeService(DegreeService degreeService) {
		this.degreeService = degreeService;
	}
	
	@Inject
	public DegreeController(DegreeService degreeService) {
		this.setDegreeService(degreeService);
	}
	
	@RequestMapping(value = {"", "/", "/home"},method = RequestMethod.GET)
	public String showHome(Map<String,Object> model){
		return "degree/home";
	}

	@RequestMapping(value = "/grid", method = RequestMethod.GET)
	public String showGrid(@RequestParam(value = "page", required=false) Page<Degree> page, Model model){
		page = this.getDegreeService().queryByPage(page);
		model.addAttribute(page);
		return "degree/grid";
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String showDetail(@RequestParam("id") Long id, Model model){
		Degree degree = this.getDegreeService().query(id);
		model.addAttribute(degree);
		return "degree/detail";
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String showDetail2(@PathVariable Long id, Model model){
		Degree degree = this.getDegreeService().query(id);
		model.addAttribute(degree);
		return "degree/detail";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String showEdit(@RequestParam(value = "id", required=false) Long id, Model model){
		Degree degree = null;
		if(null != id) {
			degree = this.getDegreeService().query(id);
		} else {
			degree = new Degree();
		}
		model.addAttribute(degree);
		return "degree/edit";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String actionSave(@Valid Degree degree, BindingResult bindingResult ) {
		if (bindingResult.hasErrors()) {
			return "degree/edit";
		}
		
		this.getDegreeService().saveOneSelective(degree);
		return "redirect:/degrees/" + degree.getId();
	}
}
