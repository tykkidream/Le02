package demo.le.security.model;

import dream.keel.base.BaseModel;

public class PermissionsStrategy implements BaseModel<PermissionsStrategy>{
	private static final long serialVersionUID = -2327116109895250212L;

	private Long permissionsId;

    private String strategyId;

    public Long getPermissionsId() {
        return permissionsId;
    }

    public void setPermissionsId(Long permissionsId) {
        this.permissionsId = permissionsId;
    }

    public String getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(String strategyId) {
        this.strategyId = strategyId;
    }

	@Override
	public Long getId() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void setId(Long arg0) {
	}

	@Override
	public void setName(String arg0) {
	}
}