package demo.le.school.model;

import java.util.Date;

import dream.keel.base.BaseModel;

/**
 * 教师
 * @author Tykkidream
 *
 */
public class Teacher implements BaseModel<Teacher>{

	private static final long serialVersionUID = -5449304212711925168L;

	private Long id;

    private String code;

    private Date intoSchoolDate;

    private Long schoolId;

    private Long majorId;

    private Long postId;

    private Long status;

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
     * 入校时间
     * @return
     */
    public Date getIntoSchoolDate() {
        return intoSchoolDate;
    }

    /**
     * 入校时间
     * @param intoDate
     */
    public void setIntoSchoolDate(Date intoSchoolDate) {
        this.intoSchoolDate = intoSchoolDate;
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
     * 专业ID
     * @return
     */
    public Long getMajorId() {
        return majorId;
    }

    /**
     * 专业ID
     * @param majorId
     */
    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }

    /**
     * 职务ID
     * @return
     */
    public Long getPostId() {
        return postId;
    }

    /**
     * 职务ID
     * @param postId
     */
    public void setPostId(Long postId) {
        this.postId = postId;
    }

    /**
     * 状态
     * @return
     */
    public Long getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status
     */
    public void setStatus(Long status) {
        this.status = status;
    }

	@Override
	public String getName() {return null;}

	@Override
	public void setName(String name) {}
}