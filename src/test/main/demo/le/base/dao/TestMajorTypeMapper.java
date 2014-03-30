package demo.le.base.dao;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.UUID;

import org.junit.runners.Parameterized.Parameters;

import tykkidream.keel.base.BaseDao;
import tykkidream.keel.test.spring.SpringTestDao;
import demo.le.base.model.MajorType;

public class TestMajorTypeMapper extends SpringTestDao<MajorType>{
	private MajorTypeMapper baseDao = null;
	
	@Override
	public BaseDao<MajorType> getBaseDao() {
		return this.baseDao;
	}

	@Override
	public void setBaseDao(BaseDao<MajorType> baseDao) {
		this.baseDao = (MajorTypeMapper)baseDao;
	}
	
	@Parameters
	public static Iterable<Object[]> data() {
		MajorType t1 = new MajorType();
		t1.setId(318001L);
		t1.setCode("MTC_" + String.valueOf(t1.getId()).substring(0,1));
		t1.setName( "MTN_" + UUID.randomUUID().toString().substring(30));
		t1.setStatus( 201 );
		
		MajorType t2 = new MajorType();
		t2.setId(318002L);
		t2.setCode("MTC_" + String.valueOf(t2.getId()).substring(0,1));
		t2.setName( "MTN_" + UUID.randomUUID().toString().substring(30));
		t2.setStatus( 202 );
		
		MajorType t3 = new MajorType();
		t3.setId(t1.getId());
		t3.setCode(t1.getCode());
		t3.setName( "MTN_" + UUID.randomUUID().toString().substring(30));
		
		MajorType t4 = new MajorType();
		t4.setId(t2.getId());
		t4.setName( "MTN_" + UUID.randomUUID().toString().substring(30));
    	
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
