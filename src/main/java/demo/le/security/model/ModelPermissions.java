package demo.le.security.model;

import tykkidream.keel.base.BaseModel;

public class ModelPermissions implements BaseModel<ModelPermissions>{
	private static final long serialVersionUID = 6085200500011945460L;

	private Long id;

    private Long modelId;

    private Long permissionsId;

    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Long getPermissionsId() {
        return permissionsId;
    }

    public void setPermissionsId(Long permissionsId) {
        this.permissionsId = permissionsId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void setName(String arg0) {
		
	}
}