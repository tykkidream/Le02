package demo.le.school.model;

import java.util.Date;

import dream.keel.base.BaseModel;

/**
 * 学生
 * @author Tykkidream
 *
 */
public class Student implements BaseModel<Student>{

	private static final long serialVersionUID = -422158361724575498L;

	private Long id;

    private String studentNum;
    
    private String code;
    
    private Integer postNum;
    
    private Date intoSchoolDate;

    private Long classesId;

    private Long archivesId;

    private Long schoolRollStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 学号
     * @return
     */
    public String getStudentNum() {
        return studentNum;
    }

    /**
     * 学号
     * @param studentNum
     */
    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
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
	 * 职务数量
	 * @return
	 */
	public Integer getPostNum() {
		return postNum;
	}

	/**
	 * 职务数量
	 * @param postNum
	 */
	public void setPostNum(Integer postNum) {
		this.postNum = postNum;
	}
	

    /**
     * 入校时间
     * @return
     */
    public Date getIntoSchoolDate() {
        return intoSchoolDate;
    }

    /**
     * 入校时间
     * @param intoSchoolDate
     */
    public void setIntoSchoolDate(Date intoSchoolDate) {
        this.intoSchoolDate = intoSchoolDate;
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
     * 档案ID
     * @return
     */
    public Long getArchivesId() {
        return archivesId;
    }

    /**
     * 档案ID
     * @param archivesId
     */
    public void setArchivesId(Long archivesId) {
        this.archivesId = archivesId;
    }

    /**
     * 学籍情况
     * @return
     */
    public Long getSchoolRollStatus() {
        return schoolRollStatus;
    }

    /**
     * 学籍情况
     * @param schoolRollStatus
     */
    public void setSchoolRollStatus(Long schoolRollStatus) {
        this.schoolRollStatus = schoolRollStatus;
    }

	@Override
	public String getName() {return null;}

	@Override
	public void setName(String name) {}

}