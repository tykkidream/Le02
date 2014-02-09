package demo.le.base.dao;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.UUID;

import org.junit.runners.Parameterized.Parameters;

import demo.le.base.model.Degree;
import dream.keel.base.BaseDao;
import dream.keel.test.spring.SpringTestDao;

public class TestDegreeMapper extends SpringTestDao<Degree>{
	private DegreeMapper baseDao = null;

	@Override
	public BaseDao<Degree> getBaseDao() {
		return this.baseDao;
	}

	@Override
	public void setBaseDao(BaseDao<Degree> baseDao) {
		this.baseDao = (DegreeMapper)baseDao;
	}
	
	@Parameters
    public static Iterable<Object[]> data() {
    	Degree t1 = new Degree();
		t1.setId(318001L);
		t1.setName("PN_" + t1.getId());
		t1.setCode("PC_" +UUID.randomUUID().toString().substring(0,2));

		Degree t2 = new Degree();
		t2.setId(318002L);
		t2.setName("PN_" + t2.getId());
		t2.setCode("PC_" +UUID.randomUUID().toString().substring(0,2));
		
		Degree t3 = new Degree();
		t3.setId(t1.getId());
		t3.setName(t1.getName());
		t3.setCode("PC_" +UUID.randomUUID().toString().substring(0,2));
		
		Degree t4 = new Degree();
		t4.setId(t2.getId());
		t4.setName(t2.getName());
		t4.setCode("PC_" +UUID.randomUUID().toString().substring(0,2));
		
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
		assertEquals("数据的Name不同，更新应该是相同的！",t1.getName(), t2.getName());
		assertNotEquals("数据的Code相同，更新应该是不相同的！",t1.getCode(), t2.getCode());
	}

	@Override
	protected void test05UpdateByIDSelective_assert() {
		assertEquals("数据的Name不同，更新应该是相同的！",t1.getName(), t2.getName());
		assertNotEquals("数据的Code相同，更新应该是不相同的！",t1.getCode(), t2.getCode());
	}

}
