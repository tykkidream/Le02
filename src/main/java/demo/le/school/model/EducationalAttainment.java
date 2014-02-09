package demo.le.school.model;

import java.util.Date;

import dream.keel.base.BaseModel;

/**
 * 教育经历、学历
 * @author Tykkidream
 *
 */
public class EducationalAttainment implements BaseModel<EducationalAttainment>{

	private static final long serialVersionUID = 6169634840456712463L;

	private Long id;

    private String code;

    private Long studentId;

    private Long schoolId;

    private Long classesId;

    private Date beginDate;

    private Date endDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 编码
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * 编码
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 学生ID
     * @return
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * 学生ID
     * @param studentId
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    /**
     * 学校ID
     * @return
     */
    public Long getSchoolId() {
        return schoolId;
    }

    /**
     * 学校ID
     * @param schoolId
     */
    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    /**
     * 班级ID
     * @return
     */
    public Long getClassesId() {
        return classesId;
    }

    /**
     * 班级ID
     * @param classesId
     */
    public void setClassesId(Long classesId) {
        this.classesId = classesId;
    }

    /**
     * 开始时间
     * @return
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * 开始时间
     * @param beginDate
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * 结束时间
     * @return
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 结束时间
     * @param endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

	@Override
	public String getName() {return null;}

	@Override
	public void setName(String name) {}
}