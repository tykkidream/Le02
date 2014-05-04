package demo.le.base.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import tykkidream.keel.mybatis.BaseService;
import demo.le.base.model.Degree;

public interface DegreeService extends BaseService<Degree> {

	List<Degree> queryByPage(Map<String, Object> arg0, RowBounds arg1);

}
