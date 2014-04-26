package demo.le.base.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import tykkidream.butterfly.SimpleEventHandler;
import tykkidream.keel.base.Page;
import demo.le.base.model.Degree;
import demo.le.base.service.DegreeService;

public class DegreeServiceAdapter implements DegreeService {
	private DegreeService degreeService = null;
	private Map<String, List<SimpleEventHandler>> map = null;
	
	public static final String queryByPageMapRowBoundsBefore = "queryByPageMapRowBoundsBefore";
	public static final String queryByPageMapRowBoundsAfter = "queryByPageMapRowBoundsAfter";
	public static final String queryByPageMapRowBoundsThrow = "queryByPageMapRowBoundsThrow";
	
	public DegreeServiceAdapter(DegreeService degreeService) {
		this.degreeService = degreeService;
		
		try {
			Method tm = this.degreeService.getClass().getMethod("This", DegreeService.class);
			if (tm != null) {
				tm.invoke(this.degreeService, this);
			}
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		
		map = new HashMap<String, List<SimpleEventHandler>>();
	}
	
	private boolean  interceptBefore(String intercept, Object[] args) {
		List<SimpleEventHandler> list = map.get(intercept);
		if (null != list) {
			Iterator<SimpleEventHandler> it = list.iterator();
			while (it.hasNext()) {
				SimpleEventHandler handler = it.next();
				handler.handler(0, null);
			}
		}
		return true;
	}
	
	private Exception  interceptAfter(String intercept, Object[] args,Object result) {
		
		return null;
	}
	
	private RuntimeException  interceptThrow(String intercept, Object[] args,Exception exce) {
		
		return null;
	}

	@Override
	public List<Degree> queryByPage(Map<String, Object> params, RowBounds bounds) {
		Object[] args = {params, bounds};
		List<Degree> result = null;
		
		try {
			interceptBefore(queryByPageMapRowBoundsBefore, args);
		} catch (Exception e) {
			throw e;
		}
		try {
			result = degreeService.queryByPage(params, bounds);
		} catch (Exception e) {
			throw interceptThrow(queryByPageMapRowBoundsThrow, args ,e);
		}
		try {
			interceptAfter(queryByPageMapRowBoundsThrow, args, result);
		} catch (Exception e) {
			throw e;
		}
		
		return result;
	}

	@Override
	public List<Degree> queryFullByPage(Map<String, Object> params, RowBounds bounds) {
		
		return null;
	}

	@Override
	public boolean create(Degree record) {
		
		return false;
	}

	@Override
	public boolean createSelective(Degree record) {
		
		return false;
	}

	@Override
	public boolean create(List<Degree> record) {
		
		return false;
	}

	@Override
	public boolean createSelective(List<Degree> record) {
		
		return false;
	}

	@Override
	public boolean modify(Degree record) {
		
		return false;
	}

	@Override
	public boolean modifySelective(Degree record) {
		
		return false;
	}

	@Override
	public boolean modify(List<Degree> record) {
		
		return false;
	}

	@Override
	public boolean modifySelective(List<Degree> record) {
		
		return false;
	}

	@Override
	public int saveOne(Degree record) {
		
		return 0;
	}

	@Override
	public int saveOneSelective(Degree record) {
		
		return 0;
	}

	@Override
	public int saveList(List<Degree> record) {
		
		return 0;
	}

	@Override
	public int saveListSelective(List<Degree> record) {
		
		return 0;
	}

	@Override
	public int deleteOne(Object id) {
		
		return 0;
	}

	@Override
	public int deleteArray(Object[] array) {
		
		return 0;
	}

	@Override
	public int deleteList(List<Degree> list) {
		
		return 0;
	}

	@Override
	public Degree queryByKey(Object id) {
		
		return null;
	}

	@Override
	public List<Degree> queryByArray(Object[] array) {
		
		return null;
	}

	@Override
	public List<Degree> queryByList(List<Degree> lsit) {
		
		return null;
	}

	@Override
	public List<Degree> queryByParameters(Map<String, Object> params) {
		
		return null;
	}

	@Override
	public List<Degree> queryByPage(Map<String, Object> params, Page page) {
		
		return null;
	}

	@Override
	public List<Degree> queryAll() {
		
		return null;
	}

	@Override
	public Degree queryFull(Object id) {
		
		return null;
	}

	@Override
	public List<Degree> queryFullByParameters(Map<String, Object> params) {
		
		return null;
	}

	@Override
	public List<Degree> queryFullByPage(Map<String, Object> params, Page page) {
		
		return null;
	}

	@Override
	public List<Degree> queryFullAll() {
		
		return null;
	}

}
