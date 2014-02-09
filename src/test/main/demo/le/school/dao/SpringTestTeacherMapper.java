package demo.le.school.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.runners.Parameterized.Parameters;

import demo.le.school.dao.TeacherMapper;
import demo.le.school.model.Teacher;
import dream.keel.base.BaseDao;
import dream.keel.test.spring.SpringTestDao;

public class SpringTestTeacherMapper extends SpringTestDao<Teacher>{
	@Resource
	public TeacherMapper baseDao = null;
	
	@Override
	public BaseDao<Teacher> getBaseDao(){
		return this.baseDao;
	}

	@Override
	public void setBaseDao(BaseDao<Teacher> baseDao) {
		this.baseDao = (TeacherMapper)baseDao;
	}
	
	@Parameters
    public static Iterable<Object[]> data() {
		Teacher t1  = new Teacher();
		t1.setId(318001L);
		t1.setCode(UUID.randomUUID().toString().substring(0,20));
		t1.setSchoolId(1L);
		t1.setStatus(1L);
    	
		Teacher t2  = new Teacher();
		t2.setId(318002L);
		t2.setCode(UUID.randomUUID().toString().substring(0,20));
		t2.setSchoolId(1L);
		t2.setStatus(1L);
		
		Teacher t3  = new Teacher();
		t3.setId(t1.getId());
		t3.setCode(UUID.randomUUID().toString().substring(0,20));
		t3.setSchoolId(1L);
		
		Teacher t4  = new Teacher();
		t4.setId(t2.getId());
		t4.setCode(UUID.randomUUID().toString().substring(0,20));
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
		assertNull("数据的Status不为Null，更新应该是Null！",t2.getStatus());
	}

	@Override
	protected void test05UpdateByIDSelective_assert() {
		assertEquals("数据的SchoolId不同，更新应该是相同的！",t1.getSchoolId(), t2.getSchoolId());
		assertNotEquals("数据的Code相同，更新应该是不相同的！",t1.getCode(), t2.getCode());
	}
}
