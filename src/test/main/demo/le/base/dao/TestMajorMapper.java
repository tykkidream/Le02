package demo.le.base.dao;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.UUID;

import org.junit.runners.Parameterized.Parameters;

import dream.keel.base.BaseDao;
import dream.keel.test.spring.SpringTestDao;
import demo.le.base.model.Major;

public class TestMajorMapper extends SpringTestDao<Major>{
	private MajorMapper baseDao;
	
	@Override
	public BaseDao<Major> getBaseDao() {
		return this.baseDao;
	}
	
	@Override
	public void setBaseDao(BaseDao<Major> baseDao) {
		this.baseDao = (MajorMapper)baseDao;
	}
	
	@Parameters
	public static Iterable<Object[]> data() {
		Major t1 = new Major();
		t1.setId(318001L);
		t1.setCode("MC_" + t1.getId());
		t1.setName( "MN_" + UUID.randomUUID().toString().substring(30));
		t1.setStatus(101);
		t1.setMajorTypeId(1L);
		
		Major t2 = new Major();
		t2.setId(318002L);
		t2.setCode("MC_" + t2.getId());
		t2.setName( "MN_" + UUID.randomUUID().toString().substring(30));
		t2.setStatus(101 );
		t2.setMajorTypeId(1L);
		
		Major t3 = new Major();
		t3.setId(t1.getId());
		t3.setCode(t1.getCode());
		t3.setName( "MN_" + UUID.randomUUID().toString().substring(30));
		t3.setMajorTypeId(1L);
		
		Major t4 = new Major();
		t4.setId(t2.getId());
		t4.setCode(t2.getCode());
		t4.setName( "MN_" + UUID.randomUUID().toString().substring(30));
		t4.setMajorTypeId(1L);
		
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
		assertEquals("数据的Code不同，更新应该是相同的！",t1.getCode(), t2.getCode());
		assertNotEquals("数据的Name相同，更新应该是不相同的！",t1.getName(), t2.getName());
		assertNull("数据的Status不为Null，更新应该是Null！",t2.getStatus());
	}

	@Override
	protected void test05UpdateByIDSelective_assert() {
		assertEquals("数据的Code不同，更新应该是相同的！",t1.getCode(), t2.getCode());
		assertNotEquals("数据的Name相同，更新应该是不相同的！",t1.getName(), t2.getName());
	}

}
