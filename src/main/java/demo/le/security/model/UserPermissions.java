package demo.le.security.model;

import dream.keel.base.BaseModel;

public class UserPermissions  implements BaseModel<UserPermissions>{
	private static final long serialVersionUID = 3089497891763658114L;

	private Long id;

    private Long userId;

    private Long permissionsId;

    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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