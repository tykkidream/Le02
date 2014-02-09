package demo.le.school.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.runners.Parameterized.Parameters;

import demo.le.school.dao.EducationalAttainmentMapper;
import demo.le.school.model.EducationalAttainment;
import dream.keel.base.BaseDao;
import dream.keel.test.spring.SpringTestDao;

public class SpringTestEducationalAttainmentMapper extends SpringTestDao<EducationalAttainment>{
	@Resource
	public EducationalAttainmentMapper baseDao = null;
	
	@Override
	public BaseDao<EducationalAttainment> getBaseDao(){
		return this.baseDao;
	}
	
	@Override
	public void setBaseDao(BaseDao<EducationalAttainment> baseDao) {
		this.baseDao = (EducationalAttainmentMapper)baseDao;
	}
	
	@Parameters
    public static Iterable<Object[]> data() {
    	EducationalAttainment t1  = new EducationalAttainment();
		t1.setId(318001L);
		t1.setCode(UUID.randomUUID().toString().substring(0,20));
		t1.setSchoolId(1L);
		t1.setStudentId(1L);
		
		EducationalAttainment t2  = new EducationalAttainment();
		t2.setId(318002L);
		t2.setCode(UUID.randomUUID().toString().substring(0,20));
		t2.setSchoolId(1L);
		t2.setStudentId(2L);
    	
		EducationalAttainment t3  = new EducationalAttainment();
		t3.setId(t1.getId());
		t3.setCode(UUID.randomUUID().toString().substring(0,20));
		t3.setClassesId(t1.getClassesId());
		t3.setSchoolId(t1.getSchoolId());
		
		EducationalAttainment t4  = new EducationalAttainment();
		t4.setId(t2.getId());
		t4.setCode(UUID.randomUUID().toString().substring(0,20));
		t4.setClassesId(t2.getClassesId());
		t4.setSchoolId(t2.getSchoolId());
		
    	Object[][] params = new Object[1][5];    	
    	params[0] = new Object[5];
    	params[0][0] = t1;
    	params[0][1] = t2;
    	params[0][2] = t4;
    	params[0][3] = t4;
    	params[0][4] = 1L;
    	 return Arrays.asList(params);
    }
	
	@Override
	protected void test04UpdateByID_assert() {
		test05UpdateByIDSelective_assert();
		assertNull("数据的StudentId不为Null，更新应该是Null！",t2.getStudentId());
	}

	@Override
	protected void test05UpdateByIDSelective_assert() {
		assertEquals("数据的SchoolId不同，更新应该是相同的！",t1.getSchoolId(), t2.getSchoolId());
		assertNotEquals("数据的Code相同，更新应该是不相同的！",t1.getCode(), t2.getCode());
	}
}
