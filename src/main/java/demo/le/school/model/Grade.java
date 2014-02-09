package demo.le.school.model;

import dream.keel.base.BaseModel;

/**
 * 年级
 * @author Tykkidream
 *
 */
public class Grade implements BaseModel<Grade>{

	private static final long serialVersionUID = 4409564196598001509L;

	private Long id;

    private String code;

    private String name;

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
}