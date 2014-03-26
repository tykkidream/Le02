package demo.le.security.model;

public class UserPermissions {
    private Short id;

    private Short userId;

    private Short permissionsId;

    private String value;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getUserId() {
        return userId;
    }

    public void setUserId(Short userId) {
        this.userId = userId;
    }

    public Short getPermissionsId() {
        return permissionsId;
    }

    public void setPermissionsId(Short permissionsId) {
        this.permissionsId = permissionsId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}