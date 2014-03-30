package demo.le.security.model;

import tykkidream.keel.base.BaseModel;


public class Model implements BaseModel<Model>{
	
	private static final long serialVersionUID = 6032710580740132372L;

	private Long id;

    private String name;

    private String tableName;

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

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}