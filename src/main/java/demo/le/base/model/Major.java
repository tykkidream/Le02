package demo.le.base.model;

import tykkidream.keel.base.BaseModel;


/**
 * 专业
 * @author Tykkidream
 *
 */
public class Major implements BaseModel<Major>{

	private static final long serialVersionUID = -1544576776774330685L;

	private Long id;

    private String code;

    private String name;

    private Long majorTypeId;

    private Integer status;

    @Override
    public Long getId() {
        return id;
    }

    @Override
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
     * 类型ID
     * @return
     */
    public Long getMajorTypeId() {
        return majorTypeId;
    }

    /**
     * 类型ID
     * @param majorTypeId
     */
    public void setMajorTypeId(Long majorTypeId) {
        this.majorTypeId = majorTypeId;
    }

    /**
     * 状态
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}