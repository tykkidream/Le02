package demo.le.base.dao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestPersionMapper.class,
	TestUserMapper.class,
	TestDegreeMapper.class,
	TestMajorMapper.class,
	TestMajorTypeMapper.class
})
public class Test {
	/*@Parameters
    public static Iterable<Object[]> data() {
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        return Arrays.asList(new Object[][] { { context } });
    }*/
}
