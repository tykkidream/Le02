package demo.le.base.security;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import tykkidream.keel.base.Page;
import demo.le.base.model.Degree;
import demo.le.base.service.DegreeService;
import demo.le.base.service.adapter.DegreeServiceAdapter;

public class DegreeSecurity extends DegreeServiceAdapter{

	public DegreeSecurity(DegreeService degreeService) {
		super(degreeService);
	}

	@Override
	public List<Degree> queryByPage(Map<String, Object> arg0, Page arg1) {
		return this.degreeService.queryByPage(arg0, arg1);
	}

	@Override
	public List<Degree> queryByPage(Map<String, Object> arg0, RowBounds arg1) {
		return this.degreeService.queryByPage(arg0, arg1);
	}

}
