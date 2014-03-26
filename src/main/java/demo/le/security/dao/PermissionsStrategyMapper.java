package demo.le.security.dao;

import demo.le.security.model.PermissionsStrategyKey;

public interface PermissionsStrategyMapper {
    int deleteByPrimaryKey(PermissionsStrategyKey key);

    int insert(PermissionsStrategyKey record);

    int insertSelective(PermissionsStrategyKey record);
}