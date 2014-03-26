package demo.le.security.model;

public class ModelPermissions {
    private Short id;

    private Short modelId;

    private Short permissionsId;

    private String value;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getModelId() {
        return modelId;
    }

    public void setModelId(Short modelId) {
        this.modelId = modelId;
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