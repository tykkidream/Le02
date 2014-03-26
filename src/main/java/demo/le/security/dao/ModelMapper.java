package demo.le.security.dao;

import demo.le.security.model.Model;

public interface ModelMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Model record);

    int insertSelective(Model record);

    Model selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
}