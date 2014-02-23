package demo.le.base.mvc;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import dream.keel.base.BaseModel;
import dream.keel.base.BaseService;
import dream.keel.base.Page;

@Controller
@RequestMapping("/model")
public abstract class BaseController<T extends BaseModel<?>> {
	@Autowired
	private ServletContext servletContext;
	
	public  abstract T getModel();
	public abstract String getBaseFoder();
	public abstract void setBaseFoder(String baseFoder);
	public abstract BaseService<T> getBaseService();
	public abstract void setBaseService(BaseService<T> baseService);

	public ServletContext getServletContext() {
		return servletContext;
	}
	public void setServletContext(ServletContext context) {
		this.servletContext = context;
	}
	
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
		model.addAttribute(page.getResult());
		
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
	public ModelAndView actionSave(@Valid T t, BindingResult bindingResult, @RequestParam(value="file", required=false) MultipartFile file) {
		ModelAndView mav = new ModelAndView();
		
		try {
			if (bindingResult.hasErrors()) {
				mav.addObject("model", t);
				mav.setViewName(this.getBaseFoder() + "/edit");
			} else {
				if (null != file && !file.isEmpty()) {
					validateFile(file);
					saveFile( generateFileName(file, t),file);
				}
				this.getBaseService().saveOneSelective(t);
				mav.setViewName("redirect:/"+ this.getBaseFoder() + "/" + t.getId());
			}
		} catch (Exception e) {
			bindingResult.reject(e.getMessage());
			mav.setViewName(this.getBaseFoder() + "/edit");
		}
		
		return mav;
	}

	protected void getOne(Long id, Model model) {
		T t = null;
		if(null != id) {
			t = this.getBaseService().query(id);
		}
		if (null == t){
			t = this.getModel();
		}
		model.addAttribute("model", t);
	}
	
	protected boolean validateFile(MultipartFile file) {
		return true;
	}
	
	protected String generateFileName(MultipartFile file, T t) {
		return "Resources/file/" + UUID.randomUUID().toString();
	}
	
	protected boolean saveFile(String name, MultipartFile file) {
		File f = new File(this.getServletContext().getRealPath("/") + name);
		try {
			FileUtils.writeByteArrayToFile(f, file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
