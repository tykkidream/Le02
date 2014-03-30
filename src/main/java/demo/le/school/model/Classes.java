package demo.le.school.model;

import java.util.Date;

import tykkidream.keel.base.BaseModel;


/**
 * 班级
 * @author Tykkidream
 *
 */
public class Classes implements BaseModel<Classes>{

	private static final long serialVersionUID = -6576071786807600418L;

	private Long id;

    private String code;

    private String name;

    private Long teacherId;

    private Long monitorId;

    private Long gradeId;

    private Long majorId;

    private Long schoolId;

    private Date foundingDate;

    private Long foundingSequence;

    private Long studentNum;

    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
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
     * 名称
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 班主任ID
     * @return
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * 班主任ID
     * @param teacherId
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * 班长ID
     * @return
     */
    public Long getMonitorId() {
        return monitorId;
    }

    /**
     * 班长ID
     * @param monitorId
     */
    public void setMonitorId(Long monitorId) {
        this.monitorId = monitorId;
    }

    /**
     * 年级ID
     * @return
     */
    public Long getGradeId() {
        return gradeId;
    }

    /**
     * 年级ID
     * @param gradeId
     */
    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
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
     * 成立时间
     * @return
     */
    public Date getFoundingDate() {
        return foundingDate;
    }

    /**
     * 成立时间
     * @param foundingDate
     */
    public void setFoundingDate(Date foundingDate) {
        this.foundingDate = foundingDate;
    }

    /**
     * 创建次序
     * @return
     */
    public Long getFoundingSequence() {
        return foundingSequence;
    }

    /**
     * 创建次序
     * @param foundingSequence
     */
    public void setFoundingSequence(Long foundingSequence) {
        this.foundingSequence = foundingSequence;
    }

    /**
     * 学生人数
     * @return
     */
    public Long getStudentNum() {
        return studentNum;
    }

    /**
     * 学生人数
     * @param studentNum
     */
    public void setStudentNum(Long studentNum) {
        this.studentNum = studentNum;
    }
}