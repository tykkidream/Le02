package demo.le.security.dao;

import demo.le.security.model.UserPermissions;

public interface UserPermissionsMapper {
    int deleteByPrimaryKey(Short id);

    int insert(UserPermissions record);

    int insertSelective(UserPermissions record);

    UserPermissions selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(UserPermissions record);

    int updateByPrimaryKey(UserPermissions record);
}