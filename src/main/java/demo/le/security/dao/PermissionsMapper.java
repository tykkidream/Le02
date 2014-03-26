package demo.le.security.dao;

import demo.le.security.model.Permissions;

public interface PermissionsMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Permissions record);

    int insertSelective(Permissions record);

    Permissions selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Permissions record);

    int updateByPrimaryKey(Permissions record);
}