package demo.le.school.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.runners.Parameterized.Parameters;

import demo.le.school.dao.StudentMapper;
import demo.le.school.model.Student;
import dream.keel.base.BaseDao;
import dream.keel.test.spring.SpringTestDao;

public class SpringTestStudentMapper extends SpringTestDao<Student>{
	@Resource
	public StudentMapper baseDao = null;
	
	@Override
	public BaseDao<Student> getBaseDao(){
		return this.baseDao;
	}

	@Override
	public void setBaseDao(BaseDao<Student> baseDao) {
		this.baseDao = (StudentMapper)baseDao;
	}
	
	@Parameters
    public static Iterable<Object[]> data() {
		Student t1  = new Student();
		t1.setId(318001L);
		t1.setCode("SC_" + t1.getId());
		t1.setStudentNum(UUID.randomUUID().toString());
		t1.setPostNum(1);
		
		Student t2  = new Student();
		t2.setId(318002L);
		t2.setCode("SC_" + t2.getId());
		t2.setStudentNum(UUID.randomUUID().toString());
		t2.setPostNum(1);
		
		Student t3  = new Student();
		t3.setId(t1.getId());
		t3.setCode(t1.getCode());
		t3.setStudentNum(UUID.randomUUID().toString());
    	
		Student t4  = new Student();
		t4.setId(t2.getId());
		t4.setCode(t2.getCode());
		t4.setStudentNum(UUID.randomUUID().toString());
		
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
		assertNull("数据的PostNum不为Null，更新应该是Null！",t2.getPostNum());
	}

	@Override
	protected void test05UpdateByIDSelective_assert() {
		assertEquals("数据的Code不同，更新应该是相同的！",t1.getCode(), t2.getCode());
		assertNotEquals("数据的StudentNum相同，更新应该是不相同的！",t1.getStudentNum(), t2.getStudentNum());
	}

}
