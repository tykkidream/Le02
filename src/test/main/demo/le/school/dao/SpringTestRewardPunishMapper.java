package demo.le.school.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.runners.Parameterized.Parameters;

import demo.le.school.dao.RewardPunishMapper;
import demo.le.school.model.RewardPunish;
import dream.keel.base.BaseDao;
import dream.keel.test.spring.SpringTestDao;

public class SpringTestRewardPunishMapper extends SpringTestDao<RewardPunish>{
	@Resource
	public RewardPunishMapper baseDao = null;
	
	@Override
	public BaseDao<RewardPunish> getBaseDao(){
		return this.baseDao;
	}

	@Override
	public void setBaseDao(BaseDao<RewardPunish> baseDao) {
		this.baseDao = (RewardPunishMapper)baseDao;
	}
	
	@Parameters
    public static Iterable<Object[]> data() {
    	RewardPunish t1  = new RewardPunish();
		t1.setId(318001L);
		t1.setCode("RPC_" + t1.getId());
		t1.setContent(UUID.randomUUID().toString());
		t1.setType(1L);
		
		RewardPunish t2  = new RewardPunish();
		t2.setId(318002L);
		t2.setCode("RPC_" + t2.getId());
		t2.setContent(UUID.randomUUID().toString());
		t2.setType(1L);
    	
		RewardPunish t3  = new RewardPunish();
		t3.setId(t1.getId());
		t3.setCode(t1.getCode());
		t3.setContent(UUID.randomUUID().toString());
		
		RewardPunish t4  = new RewardPunish();
		t4.setId(t2.getId());
		t4.setCode(t2.getCode());
		t4.setContent(UUID.randomUUID().toString());
		
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
		assertNull("数据的Type不为Null，更新应该是Null！",t2.getType());
	}

	@Override
	protected void test05UpdateByIDSelective_assert() {
		assertEquals("数据的Code不同，更新应该是相同的！",t1.getCode(), t2.getCode());
		assertNotEquals("数据的Content相同，更新应该是不相同的！",t1.getContent(), t2.getContent());
	}
}
