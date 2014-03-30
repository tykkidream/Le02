package demo.le.base.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.UUID;

import org.junit.runners.Parameterized.Parameters;

import tykkidream.keel.base.BaseDao;
import tykkidream.keel.test.spring.SpringTestDao;
import demo.le.base.model.User;

public class TestUserMapper extends SpringTestDao<User>{
	private UserMapper baseDao = null;

	@Override
	public void setBaseDao(BaseDao<User> baseDao) {
		this.baseDao = (UserMapper)baseDao;
	}

	@Override
	public BaseDao<User> getBaseDao() {
		return this.baseDao;
	}
	
	@Parameters
	public static Iterable<Object[]> data() {
		User t1  = new User();
		t1.setId(318001L);
		t1.setUsername("UN_" + t1.getId());
		t1.setNickname("NN_" + t1.getId());
		t1.setPassword(UUID.randomUUID().toString());

		User t2  = new User();
		t2.setId(318002L);
		t2.setUsername("UN_" + t2.getId());
		t2.setNickname("NN_" + t2.getId());
		t2.setPassword(UUID.randomUUID().toString());
		
		User t3  = new User();
		t3.setId(t1.getId());
		t3.setUsername(t1.getUsername());
		t3.setPassword(UUID.randomUUID().toString());
		
		User t4  = new User();
		t4.setId(t2.getId());
		t4.setPassword(UUID.randomUUID().toString());
		
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
		assertEquals("数据的Username不同，更新应该是相同的！",t1.getUsername(), t2.getUsername());
		assertNotEquals("数据的Password相同，更新应该是不相同的！",t1.getPassword(), t2.getPassword());
		assertNull("数据的Nickname不为Null，更新应该是Null！",t2.getNickname());
	}

	@Override
	protected void test05UpdateByIDSelective_assert() {
		assertEquals("数据的Username不同，更新应该是相同的！",t1.getUsername(), t2.getUsername());
		assertNotEquals("数据的Password相同，更新应该是不相同的！",t1.getPassword(), t2.getPassword());
	}
}
