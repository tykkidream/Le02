package demo.le.school.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.runners.Parameterized.Parameters;

import demo.le.school.dao.ClassesMapper;
import demo.le.school.model.Classes;
import dream.keel.base.BaseDao;
import dream.keel.test.spring.SpringTestDao;

public class SpringTestClassesMapper extends SpringTestDao<Classes>{
	@Resource
	public ClassesMapper baseDao = null;
	
	@Override
	public BaseDao<Classes> getBaseDao(){
		return baseDao;
	}

	@Override
	public void setBaseDao(BaseDao<Classes> baseDao) {
		this.baseDao = (ClassesMapper)baseDao;
	}
	
	@Parameters
    public static Iterable<Object[]> data() {
    	Classes t1  = new Classes();
    	t1.setId(318001L);
    	t1.setCode("CC_" + t1.getId());
    	t1.setName(UUID.randomUUID().toString().substring(0, 10));
    	t1.setMajorId(1L);
    	t1.setSchoolId(1L);
    	t1.setGradeId(1L);
    	
    	Classes t2  = new Classes();
    	 t2.setId(318002L);
    	 t2.setCode("CC_" + t2.getId());
    	 t2.setName(UUID.randomUUID().toString().substring(0, 10));
		 t2.setMajorId(1L);
		 t2.setSchoolId(1L);
		 t2.setGradeId(1L);
		 
		 Classes t3  = new Classes();
		 t3.setId(t1.getId());
		 t3.setCode(t1.getCode());
		 t3.setName(UUID.randomUUID().toString().substring(0, 10));
		 t3.setMajorId(1L);
		 t3.setSchoolId(1L);
		 
		 Classes t4  = new Classes();
		 t4.setId(t2.getId());
		 t4.setCode(t2.getCode());
		 t4.setName(UUID.randomUUID().toString().substring(0, 10));
		 t4.setMajorId(1L);
		 t4.setSchoolId(1L);
    	
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
		assertNull("数据的GradeId不为Null，更新应该是Null！",t2.getGradeId());
	}

	@Override
	protected void test05UpdateByIDSelective_assert() {
		assertEquals("数据的Code不同，更新应该是相同的！",t1.getCode(), t2.getCode());
		assertNotEquals("数据的Name相同，更新应该是不相同的！",t1.getName(), t2.getName());
	}
}
