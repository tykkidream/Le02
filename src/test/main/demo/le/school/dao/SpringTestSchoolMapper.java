package demo.le.school.dao;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.runners.Parameterized.Parameters;

import demo.le.school.dao.SchoolMapper;
import demo.le.school.model.School;
import dream.keel.base.BaseDao;
import dream.keel.test.spring.SpringTestDao;

public class SpringTestSchoolMapper extends SpringTestDao<School>{
	@Resource
	public SchoolMapper baseDao = null;
	
	@Override
	public BaseDao<School> getBaseDao(){
		return this.baseDao;
	}
	
	@Override
	public void setBaseDao(BaseDao<School> baseDao) {
		this.baseDao = (SchoolMapper)baseDao;
	}

	@Parameters
    public static Iterable<Object[]> data() {
		School t1  = new School();
		t1.setId(318001L);
		t1.setName(UUID.randomUUID().toString());
		
		School t2  = new School();
		t2.setId(318002L);
		t2.setName(UUID.randomUUID().toString());
		
		School t3  = new School();
		t3.setId(t1.getId());
		t3.setName(t1.getName());
		
		School t4  = new School();
		t4.setId(t2.getId());
		t4.setName(t2.getName());
    	
    	Object[][] params = new Object[1][5];    	
    	params[0] = new Object[5];
    	params[0][0] = t1;
    	params[0][1] = t2;
    	params[0][2] = t3;
    	params[0][3] = t4;
    	params[0][4] = 1L;
    	 return Arrays.asList(params);
    }
    
	@Override
	protected void test04UpdateByID_assert() {
		test05UpdateByIDSelective_assert();
	}

	@Override
	protected void test05UpdateByIDSelective_assert() {
		assertEquals("数据的Name不同，更新应该是相同的！",t1.getName(), t2.getName());
	}
}
