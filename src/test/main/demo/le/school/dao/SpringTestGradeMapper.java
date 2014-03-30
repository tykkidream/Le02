package demo.le.school.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.runners.Parameterized.Parameters;

import demo.le.school.dao.GradeMapper;
import demo.le.school.model.Grade;
import tykkidream.keel.base.BaseDao;
import tykkidream.keel.test.spring.SpringTestDao;

public class SpringTestGradeMapper extends SpringTestDao<Grade>{
	@Resource
	public GradeMapper baseDao = null;
	
	@Override
	public BaseDao<Grade> getBaseDao(){
		return this.baseDao;
	}

	@Override
	public void setBaseDao(BaseDao<Grade> baseDao) {
		this.baseDao = (GradeMapper)baseDao;
	}
	
	@Parameters
    public static Iterable<Object[]> data() {
    	Grade t1  = new Grade();
		t1.setId(318001L);
		t1.setCode("GC_" + t1.getId());
		t1.setName(UUID.randomUUID().toString().substring(0,20));
		
		Grade t2  = new Grade();
		t2.setId(318002L);
		t2.setCode("GC_" + t2.getId());
		t2.setName(UUID.randomUUID().toString().substring(0,20));
		
		Grade t3  = new Grade();
		t3.setId(t1.getId());
		t3.setCode(t1.getCode());
		t3.setName(UUID.randomUUID().toString().substring(0,20));
		
		Grade t4  = new Grade();
		t4.setId(t2.getId());
		t4.setCode(t2.getCode());
		t4.setName(UUID.randomUUID().toString().substring(0,20));
    	
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
		assertEquals("数据的Code不同，更新应该是相同的！",t1.getCode(), t2.getCode());
		assertNotEquals("数据的Name相同，更新应该是不相同的！",t1.getName(), t2.getName());
	}
}
