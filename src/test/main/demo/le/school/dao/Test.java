package demo.le.school.dao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	SpringTestClassesMapper.class,
	SpringTestEducationalAttainmentMapper.class,
	SpringTestGradeMapper.class,
	SpringTestRewardPunishMapper.class,
	SpringTestSchoolMapper.class,
	SpringTestStudentMapper.class,
	SpringTestTeacherMapper.class
})
public class Test {
	/*@Parameters
    public static Iterable<Object[]> data() {
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        return Arrays.asList(new Object[][] { { context } });
    }*/
}
