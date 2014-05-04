package demo.le.base.service.adapter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import tykkidream.keel.BaseServiceAdapter;
import tykkidream.keel.base.Page;
import demo.le.base.model.Degree;
import demo.le.base.service.DegreeService;

public class DegreeServiceAdapter implements DegreeService,BaseServiceAdapter<DegreeService> {
	protected BaseServiceAdapter<DegreeService> This = this;
	protected DegreeService degreeService = null;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public DegreeServiceAdapter(DegreeService degreeService) {
		this.degreeService = degreeService;

		if (this.degreeService instanceof BaseServiceAdapter) {
			BaseServiceAdapter dsa = (BaseServiceAdapter) this.degreeService;
			dsa.This(this);
		} else {
			try {
				Method tm = this.degreeService.getClass().getMethod("This", DegreeService.class);
				if (tm != null) {
					tm.invoke(this.degreeService, This());
				}
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public DegreeService This() {
		if (This == this) {
			return this;
		}
		return This.This();
	}

	@Override
	public void This(BaseServiceAdapter<DegreeService> pervService) {
		this.This = pervService;
	}

	@Override
	public List<Degree> queryFullByPage(Map<String, Object> arg0, RowBounds arg1) {
		return this.degreeService.queryFullByPage(arg0, arg1);
	}

	@Override
	public boolean create(Degree arg0) {
		return this.degreeService.create(arg0);
	}

	@Override
	public boolean create(List<Degree> arg0) {
		return this.degreeService.create(arg0);
	}

	@Override
	public boolean createSelective(Degree arg0) {
		return this.degreeService.createSelective(arg0);
	}

	@Override
	public boolean createSelective(List<Degree> arg0) {
		return this.degreeService.createSelective(arg0);
	}

	@Override
	public int deleteArray(Object[] arg0) {
		return this.degreeService.deleteArray(arg0);
	}

	@Override
	public int deleteList(List<Degree> arg0) {
		return this.degreeService.deleteList(arg0);
	}

	@Override
	public int deleteOne(Object arg0) {
		return this.degreeService.deleteOne(arg0);
	}

	@Override
	public boolean modify(Degree arg0) {
		return this.modify(arg0);
	}

	@Override
	public boolean modify(List<Degree> arg0) {
		return this.degreeService.modify(arg0);
	}

	@Override
	public boolean modifySelective(Degree arg0) {
		return this.degreeService.modify(arg0);
	}

	@Override
	public boolean modifySelective(List<Degree> arg0) {
		return this.degreeService.modifySelective(arg0);
	}

	@Override
	public List<Degree> queryAll() {
		return this.degreeService.queryAll();
	}

	@Override
	public List<Degree> queryByArray(Object[] arg0) {
		return this.degreeService.queryByArray(arg0);
	}

	@Override
	public Degree queryByKey(Object arg0) {
		return this.degreeService.queryByKey(arg0);
	}

	@Override
	public List<Degree> queryByList(List<Degree> arg0) {
		return this.degreeService.queryByList(arg0);
	}

	@Override
	public List<Degree> queryByPage(Map<String, Object> arg0, Page arg1) {
		return this.degreeService.queryByPage(arg0, arg1);
	}

	@Override
	public List<Degree> queryByParameters(Map<String, Object> arg0) {
		return this.degreeService.queryByParameters(arg0);
	}

	@Override
	public Degree queryFull(Object arg0) {
		return this.degreeService.queryFull(arg0);
	}

	@Override
	public List<Degree> queryFullAll() {
		return this.degreeService.queryFullAll();
	}

	@Override
	public List<Degree> queryFullByPage(Map<String, Object> arg0, Page arg1) {
		return this.degreeService.queryFullByPage(arg0, arg1);
	}

	@Override
	public List<Degree> queryFullByParameters(Map<String, Object> arg0) {
		return this.degreeService.queryFullByParameters(arg0);
	}

	@Override
	public int saveList(List<Degree> arg0) {
		return this.degreeService.saveList(arg0);
	}

	@Override
	public int saveListSelective(List<Degree> arg0) {
		return this.degreeService.saveListSelective(arg0);
	}

	@Override
	public int saveOne(Degree arg0) {
		return this.degreeService.saveOne(arg0);
	}

	@Override
	public int saveOneSelective(Degree arg0) {
		return this.degreeService.saveOneSelective(arg0);
	}

	@Override
	public List<Degree> queryByPage(Map<String, Object> arg0, RowBounds arg1) {
		return this.degreeService.queryByPage(arg0, arg1);
	}

}
