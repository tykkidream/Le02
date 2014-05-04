package demo.le.base.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import tykkidream.keel.base.Page;
import tykkidream.keel.mybatis.SimpleService;
import demo.le.base.dao.DegreeMapper;
import demo.le.base.model.Degree;
import demo.le.base.service.DegreeService;

public class DegreeServiceImpl extends SimpleService<Degree, DegreeMapper> implements DegreeService {
	protected DegreeServiceImpl This = this;
	
	protected  DegreeServiceImpl This() {
		if (This == this) {
			return this;
		}
		return This.This();
	}
	
	public void methodTest() {
		This().methodTest("Hello World!!!");
	}
	
	public void methodTest(String args) {
		System.out.println(args);
	}
	
	@Override
	public List<Degree> queryByPage(Map<String, Object> params, Page page) {
		return super.queryByPage(params, page);
	}

	@Override
	public List<Degree> queryByPage(Map<String, Object> params, RowBounds bounds) {
		return super.queryByPage(params, bounds);
	}

	@Override
	public List<Degree> queryFullByPage(Map<String, Object> params, Page page) {
		return super.queryFullByPage(params, page);
	}

	@Override
	public List<Degree> queryFullByPage(Map<String, Object> params, RowBounds bounds) {
		
		return super.queryFullByPage(params, bounds);
	}

	@Override
	public boolean create(Degree record) {
		return super.create(record);
	}

	@Override
	public boolean create(List<Degree> arg0) {
		
		return super.create(arg0);
	}

	@Override
	public boolean createSelective(Degree record) {
		return super.createSelective(record);
	}

	@Override
	public boolean createSelective(List<Degree> arg0) {
		
		return super.createSelective(arg0);
	}

	@Override
	public int deleteArray(Object[] arg0) {
		return super.deleteArray(arg0);
	}

	@Override
	public int deleteList(List<Degree> arg0) {
		
		return super.deleteList(arg0);
	}

	@Override
	public int deleteOne(Object id) {
		return super.deleteOne(id);
	}

	@Override
	public DegreeMapper getBaseDao() {
		
		return super.getBaseDao();
	}

	@Override
	public boolean modify(Degree record) {
		return super.modify(record);
	}

	@Override
	public boolean modify(List<Degree> arg0) {
		
		return super.modify(arg0);
	}

	@Override
	public boolean modifySelective(Degree record) {
		return super.modifySelective(record);
	}

	@Override
	public boolean modifySelective(List<Degree> arg0) {
		
		return super.modifySelective(arg0);
	}

	@Override
	public List<Degree> queryAll() {
		return super.queryAll();
	}

	@Override
	public List<Degree> queryByArray(Object[] array) {
		
		return super.queryByArray(array);
	}

	@Override
	public Degree queryByKey(Object id) {
		return super.queryByKey(id);
	}

	@Override
	public List<Degree> queryByList(List<Degree> list) {
		
		return super.queryByList(list);
	}

	@Override
	public List<Degree> queryByParameters(Map<String, Object> params) {
		return super.queryByParameters(params);
	}

	@Override
	public Degree queryFull(Object id) {
		
		return super.queryFull(id);
	}

	@Override
	public List<Degree> queryFullAll() {
		return super.queryFullAll();
	}

	@Override
	public List<Degree> queryFullByParameters(Map<String, Object> params) {
		return super.queryFullByParameters(params);
	}

	@Override
	public int saveList(List<Degree> arg0) {
		return super.saveList(arg0);
	}

	@Override
	public int saveListSelective(List<Degree> arg0) {
		return super.saveListSelective(arg0);
	}

	@Override
	public int saveOne(Degree record) {
		return super.saveOne(record);
	}

	@Override
	public int saveOneSelective(Degree record) {
		return super.saveOneSelective(record);
	}

	@Override
	public void setBaseDao(DegreeMapper baseDao) {
		super.setBaseDao(baseDao);
	}
	
}
