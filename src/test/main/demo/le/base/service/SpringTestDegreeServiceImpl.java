package demo.le.base.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.runners.Parameterized.Parameters;

import tykkidream.keel.base.BaseService;
import tykkidream.keel.base.Page;
import tykkidream.keel.test.spring.SpringTestService;
import demo.le.base.model.Degree;

public class SpringTestDegreeServiceImpl extends SpringTestService<Degree>{

	@Resource
	public DegreeService baseService = null;
	
	@Override
	public void setBaseService(BaseService<Degree> baseService) {
		this.baseService = (DegreeService)baseService;
	}

	@Override
	public BaseService<Degree> getBaseService() {
		return this.baseService;
	}
	
	@Parameters
    public static Iterable<Object[]> data() {
    	Degree d1 = new Degree();
    	d1.setId(318001L);
    	d1.setName("PN_" + d1.getId());
    	d1.setCode("PC_" +UUID.randomUUID().toString().substring(0,2));
    	
    	Degree d2 = new Degree();
    	d2.setId(3128004L);
    	d2.setName("PN_" + d2.getId());
    	d2.setCode("PC_" +UUID.randomUUID().toString().substring(0,2));
    	
    	List<Degree> lt1 = new ArrayList<Degree>();
    	lt1.add(new Degree(null,"AAA","AAA"));
    	lt1.add(new Degree(318003L,"BBB","BBB"));
    	lt1.add(new Degree(null,"CCC","CCC"));
    	
    	List<Degree> lt2 = new ArrayList<Degree>();
    	lt2.add(new Degree(null,"DDD","DDD"));
    	lt2.add(new Degree(318003L,"EEE","EEE"));
    	lt2.add(new Degree(null,UUID.randomUUID().toString(),UUID.randomUUID().toString()));
    	
    	Page<Degree> page = new Page<Degree>();
    	page.setPageIndex(1);
    	page.setPageSize(3);
    	
    	Object[][] params = new Object[1][5];    	
    	params[0] = new Object[5];
    	params[0][0] = d1;
    	params[0][1] = d2;
    	params[0][2] = lt1;
    	params[0][3] = lt2;
    	params[0][4] = page;
    	
        return Arrays.asList(params);
    }
    
	@Override
	protected void testSaveOneSelective_assert() {
		
	}
}
