package demo.le.school.model;

import tykkidream.keel.base.BaseModel;


/**
 * 学校
 * @author Tykkidream
 *
 */
public class School implements BaseModel<School>{

	private static final long serialVersionUID = -4072721387501661930L;

	private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 学校名称
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 学校名称
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}