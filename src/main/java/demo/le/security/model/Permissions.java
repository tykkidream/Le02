package demo.le.security.model;

import dream.keel.base.BaseModel;

public class Permissions implements BaseModel<Permissions>{
	private static final long serialVersionUID = 575258359331307477L;

	private Long id;

    private String name;

    private String describe;

    private String executiveProgram; 

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

    public String getExecutiveProgram() {
        return executiveProgram;
    }

    public void setExecutiveProgram(String executiveProgram) {
        this.executiveProgram = executiveProgram;
    }
}