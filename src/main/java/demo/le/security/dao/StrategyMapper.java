package demo.le.security.dao;

import demo.le.security.model.Strategy;

public interface StrategyMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Strategy record);

    int insertSelective(Strategy record);

    Strategy selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Strategy record);

    int updateByPrimaryKey(Strategy record);
}