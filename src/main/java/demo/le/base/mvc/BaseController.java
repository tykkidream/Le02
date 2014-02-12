package demo.le.base.mvc;

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

import dream.keel.base.BaseModel;
import dream.keel.base.BaseService;
import dream.keel.base.Page;

@Controller
@RequestMapping("/model")
public abstract class BaseController<T extends BaseModel<?>> {

	public  abstract T getModel();
	public abstract String getBaseFoder();
	public abstract void setBaseFoder(String baseFoder);
	public abstract BaseService<T> getBaseService();
	public abstract void setBaseService(BaseService<T> baseService);
	
	@Inject
	public BaseController(BaseService<T> baseService) {
		this.setBaseService(baseService);
	}
	
	@RequestMapping(value = {"", "/", "/home"},method = RequestMethod.GET)
	public String showHome(Map<String,Object> model){
		return this.getBaseFoder() + "/home";
	}

	@RequestMapping(value = "/grid", method = RequestMethod.GET)
	public String showGrid(@RequestParam(value = "page", required=false) Page<T> page, Model model){
		page = this.getBaseService().queryByPage(page);
		model.addAttribute(page);
		return this.getBaseFoder() + "/grid";
	}

	@RequestMapping(value = {"/detail"}, method = RequestMethod.GET)
	public String showDetail1(@RequestParam("id") Long id, Model model){
		getOne(id, model);
		return this.getBaseFoder() + "/detail";
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String showDetail2(@PathVariable Long id, Model model){
		return this.showDetail1(id,model);
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String showEdit(@RequestParam(value = "id", required=false) Long id, Model model){
		getOne(id, model);
		return this.getBaseFoder() + "/edit";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String actionSave(@Valid T t, BindingResult bindingResult ) {
		if (bindingResult.hasErrors()) {
			return this.getBaseFoder() + "/edit";
		}
		
		this.getBaseService().saveOneSelective(t);
		return "redirect:/"+ this.getBaseFoder() + "/" + t.getId();
	}

	private void getOne(Long id, Model model) {
		T t = null;
		if(null != id) {
			t = this.getBaseService().query(id);
		}
		if (null == t){
			t = this.getModel();
		}
		model.addAttribute("model", t);
	}
}
