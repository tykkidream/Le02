package demo.le.school.model;

import dream.keel.base.BaseModel;

/**
 * 奖罚
 * @author Tykkidream
 *
 */
public class RewardPunish implements BaseModel<RewardPunish>{

	private static final long serialVersionUID = 1L;

	private Long id;

    private String code;

    private String content;

    private Long schoolId;

    private Long type;

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
     * 内容
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * 内容
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
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
     * 类型
     * @return
     */
    public Long getType() {
        return type;
    }

    /**
     * 类型
     * @param type
     */
    public void setType(Long type) {
        this.type = type;
    }

	@Override
	public String getName() {return null;}

	@Override
	public void setName(String name) {}
}