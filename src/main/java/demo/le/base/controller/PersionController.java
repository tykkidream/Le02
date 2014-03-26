package demo.le.base.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import demo.le.base.model.Persion;
import demo.le.base.service.PersionService;
import dream.keel.base.BaseService;

@Controller
@RequestMapping("/persion")
public class PersionController extends BaseController<Persion> {
	private String baseFolderr = "persion";
	
	private PersionService persionService;

	@Inject
	public PersionController(PersionService persionService) {
		super(persionService);
	}

	@Override
	public Persion createModel() {
		return new Persion();
	}

	@Override
	public String getBaseFoder() {
		return this.baseFolderr;
	}

	@Override
	public void setBaseFoder(String baseFoder) {
		this.baseFolderr = baseFoder;
	}

	@Override
	public BaseService<Persion> getBaseService() {
		return this.persionService;
	}

	@Override
	public void setBaseService(BaseService<Persion> baseService) {
		if (baseService instanceof PersionService) {
			this.persionService = (PersionService)baseService;
		}
	}

	@Override
	protected String generateFileName(MultipartFile file, Persion t) {
		t.setHatPhoto(super.generateFileName(file, null)+".jpg");
		return t.getHatPhoto();
	}
}
