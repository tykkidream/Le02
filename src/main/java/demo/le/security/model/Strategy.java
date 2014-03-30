package demo.le.security.model;

import tykkidream.keel.base.BaseModel;

public class Strategy implements BaseModel<Strategy>{
	private static final long serialVersionUID = -2161663531513319977L;

	private Long id;

    private String name;

    private String describe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}