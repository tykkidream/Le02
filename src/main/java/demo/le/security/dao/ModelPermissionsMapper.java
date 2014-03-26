package demo.le.security.dao;

import demo.le.security.model.ModelPermissions;

public interface ModelPermissionsMapper {
    int deleteByPrimaryKey(Short id);

    int insert(ModelPermissions record);

    int insertSelective(ModelPermissions record);

    ModelPermissions selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(ModelPermissions record);

    int updateByPrimaryKey(ModelPermissions record);
}