package flow;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import tykkidream.keel.base.BaseModel;
import tykkidream.keel.base.BaseService;
import tykkidream.keel.base.Page;
import tykkidream.keel.mybatis.interceptor.PageBounds;

@Controller
@RequestMapping("/model")
public abstract class BaseController<T extends BaseModel<?>> {
	@Autowired
	private ServletContext servletContext;

	public abstract T createModel();

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

	@RequestMapping({"/","/home"})
	public String home() {
		return this.getBaseFoder() + "/home";
	}
	
	@RequestMapping()
	public String other() {
		return "redirect:" + this.getBaseFoder() +"/";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView news() {
		ModelAndView mav = new ModelAndView();

		T t = createModel();
		mav.addObject("data", t);
		mav.setViewName(this.getBaseFoder() + "/new");

		return mav;
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public ModelAndView news(@Valid T t, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();

		try {
			do {
				if (null != t) {
					if (!bindingResult.hasErrors() && getBaseService().createSelective(t)) {
						mav.setViewName("redirect:detail/" + t.getId());
						break;
					}
				} else {
					t = createModel();
				}
				mav.addObject("data", t);
				mav.setViewName(this.getBaseFoder() + "/new");
			}while(false);
		} catch (Exception e) {
			mav.addObject("data", t);
			mav.setViewName(this.getBaseFoder() + "/new");
			bindingResult.reject(e.getMessage());
		}

		return mav;
	}

	@RequestMapping(value = "/browse", method = RequestMethod.GET)
	public ModelAndView browse(@RequestParam(value = "page", required = false) PageBounds page) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName(this.getBaseFoder() + "/browse");

		List<T> list = this.getBaseService().queryByPage(null, page);
		mav.addObject(page);
		mav.addObject(list);

		return mav;
	}

	@RequestMapping(value = "/manage", method = RequestMethod.GET)
	public ModelAndView manage(@RequestParam(value = "page", required = false) Page page) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName(this.getBaseFoder() + "/manage");

		List<T> list = this.getBaseService().queryByPage(null, page);
		mav.addObject(page);
		mav.addObject(list);
		
		return mav;
	}

	@RequestMapping(value = { "/detail/{id}" }, method = RequestMethod.GET)
	public ModelAndView detail(@PathVariable Long id) {
		ModelAndView mav = new ModelAndView();

		try {
			T t = this.getBaseService().query(id);
			mav.addObject("data", t);
			mav.setViewName(this.getBaseFoder() + "/detailView");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping(value = "/detail/{id}", method = RequestMethod.POST)
	public ModelAndView detail(@PathVariable Long id, @Valid T t, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();

		try {
			do {
				if (null != t && id == t.getId()) {
					if (!bindingResult.hasErrors() && getBaseService().modifySelective(t)) {
						mav.setViewName("redirect:detail/" + t.getId());
						break;
					}
				} else {
					t = getBaseService().query(id);
				}
				mav.addObject("data", t);
				mav.setViewName(this.getBaseFoder() + "/detailEdit");
			} while (false);
		} catch (Exception e) {
			mav.addObject("data", t);
			mav.setViewName(this.getBaseFoder() + "/detailEdit");
			bindingResult.reject(e.getMessage());
		}

		return mav;
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
