package demo.le.base.model;

import dream.keel.base.BaseModel;

/**
 * 专业类型
 * @author Tykkidream
 *
 */
public class MajorType implements BaseModel<MajorType>{

	private static final long serialVersionUID = 8165994454540111127L;

	private Long id;

    private String code;

    private String name;

    private Integer status;

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