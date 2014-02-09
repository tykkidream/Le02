package demo.le.base.dao;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.UUID;

import org.junit.runners.Parameterized.Parameters;

import dream.keel.base.BaseDao;
import dream.keel.test.spring.SpringTestDao;
import demo.le.base.model.Persion;

public class TestPersionMapper extends SpringTestDao<Persion>{
	private PersionMapper baseDao = null;
	
	@Override
	public BaseDao<Persion> getBaseDao() {
		return this.baseDao;
	}
	
	@Override
	public void setBaseDao(BaseDao<Persion> baseDao) {
		this.baseDao = (PersionMapper)baseDao;
	}
	
	@Parameters
	public static Iterable<Object[]> data() {
		Persion t1 = new Persion();
		t1.setId(318001L);
		t1.setFirstName("PFN_" + t1.getId());
		t1.setLastName( "PLN_" + UUID.randomUUID().toString().substring(30));
		t1.setSex( "男" );
		
		Persion t2 = new Persion();
		t2.setId(318002L);
		t2.setFirstName("PFN_" + t2.getId());
		t2.setLastName( "PLN_" + UUID.randomUUID().toString().substring(30));
		t2.setSex( "男" );
		
		Persion t3 = new Persion();
		t3.setId(t1.getId());
		t3.setFirstName(t1.getFirstName());
		t3.setLastName( "PLN_" + UUID.randomUUID().toString().substring(30));
		
		Persion t4 = new Persion();
		t4.setId(t1.getId());
		t4.setLastName( "PLN_" + UUID.randomUUID().toString().substring(30));
    	
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
		assertEquals("数据的FirstName不同，更新应该是相同的！",t1.getFirstName(), t2.getFirstName());
		assertNotEquals("数据的LastName相同，更新应该是不相同的！",t1.getLastName(), t2.getLastName());
		assertNull("数据的Sex不为Null，更新应该是Null！",t2.getSex());
	}

	@Override
	protected void test05UpdateByIDSelective_assert() {
		assertEquals("数据的FirstName不同，更新应该是相同的！",t1.getFirstName(), t2.getFirstName());
		assertNotEquals("数据的LastName相同，更新应该是不相同的！",t1.getLastName(), t2.getLastName());
	}
}
