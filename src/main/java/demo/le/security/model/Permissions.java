package demo.le.security.model;

public class Permissions {
    private Short id;

    private String name;

    private String describe;

    private String executiveProgram;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
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