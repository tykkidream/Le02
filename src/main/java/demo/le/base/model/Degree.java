package demo.le.base.model;

import dream.keel.base.BaseModel;

/**
 * 学位
 * @author Tykkidream
 *
 */
public class Degree implements BaseModel<Degree> {
	private static final long serialVersionUID = 3378622613547454581L;

	private Long id;

    private String code;

    private String name;
    
    public Degree(){}
    
    public Degree(Long id, String code, String name){
    	this.id = id;
    	this.code = code;
    	this.name = name;
    }

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
}