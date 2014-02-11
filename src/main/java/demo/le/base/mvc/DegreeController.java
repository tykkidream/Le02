package demo.le.base.mvc;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import demo.le.base.model.Degree;
import demo.le.base.service.DegreeService;
import dream.keel.base.Page;

@Controller
@RequestMapping("/degree")
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
	
	@RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
	public String showHome(Map<String,Object> model){
		return "degreeHome";
	}

	@RequestMapping(value = "/grid", method = RequestMethod.GET)
	public String showGrid(@RequestParam(value = "page", required=false) Page<Degree> page, Model model){
		page = this.getDegreeService().queryByPage(page);
		model.addAttribute(page);
		return "degreeGrid";
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String showDetail(@RequestParam("id") Long id, Model model){
		Degree degree = this.getDegreeService().query(id);
		model.addAttribute(degree);
		return "degreeDetail";
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String showNew(@RequestParam(value = "page", required=false) Degree degree, Model model){
		return "degreeEdit";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String showEdit(@RequestParam("id") Long id, Model model){
		Degree degree = this.getDegreeService().query(id);
		model.addAttribute(degree);
		return "degreeEdit";
	}
}
