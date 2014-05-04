package tykkidream.keel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import tykkidream.keel.BaseServiceAdapter;
import tykkidream.keel.base.Page;
import tykkidream.keel.mybatis.BaseService;

public abstract class AbstractBaseServiceAdapter<M> implements BaseService<M>, BaseServiceAdapter<BaseService<M>> {
	protected BaseServiceAdapter<BaseService<M>> This = this;
	protected BaseService<M> baseService = null;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public AbstractBaseServiceAdapter(BaseService<M> baseService) {
		this.baseService = baseService;

		if (this.baseService instanceof BaseServiceAdapter) {
			BaseServiceAdapter dsa = (BaseServiceAdapter) this.baseService;
			dsa.This(this);
		} else {
			try {
				Method tm = this.baseService.getClass().getMethod("This", BaseService.class);
				if (tm != null) {
					tm.invoke(this.baseService, This());
				}
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public BaseService<M> This() {
		if (This == this) {
			return this;
		}
		return This.This();
	}

	@Override
	public void This(BaseServiceAdapter<BaseService<M>> This) {
		this.This = This;
	}

	@Override
	public List<M> queryFullByPage(Map<String, Object> arg0, RowBounds arg1) {
		return this.baseService.queryFullByPage(arg0, arg1);
	}

	@Override
	public boolean create(M arg0) {
		return this.baseService.create(arg0);
	}

	@Override
	public boolean create(List<M> arg0) {
		return this.baseService.create(arg0);
	}

	@Override
	public boolean createSelective(M arg0) {
		return this.baseService.createSelective(arg0);
	}

	@Override
	public boolean createSelective(List<M> arg0) {
		return this.baseService.createSelective(arg0);
	}

	@Override
	public int deleteArray(Object[] arg0) {
		return this.baseService.deleteArray(arg0);
	}

	@Override
	public int deleteList(List<M> arg0) {
		return this.baseService.deleteList(arg0);
	}

	@Override
	public int deleteOne(Object arg0) {
		return this.baseService.deleteOne(arg0);
	}

	@Override
	public boolean modify(M arg0) {
		return this.modify(arg0);
	}

	@Override
	public boolean modify(List<M> arg0) {
		return this.baseService.modify(arg0);
	}

	@Override
	public boolean modifySelective(M arg0) {
		return this.baseService.modify(arg0);
	}

	@Override
	public boolean modifySelective(List<M> arg0) {
		return this.baseService.modifySelective(arg0);
	}

	@Override
	public List<M> queryAll() {
		return this.baseService.queryAll();
	}

	@Override
	public List<M> queryByArray(Object[] arg0) {
		return this.baseService.queryByArray(arg0);
	}

	@Override
	public M queryByKey(Object arg0) {
		return this.baseService.queryByKey(arg0);
	}

	@Override
	public List<M> queryByList(List<M> arg0) {
		return this.baseService.queryByList(arg0);
	}

	@Override
	public List<M> queryByPage(Map<String, Object> arg0, Page arg1) {
		return this.baseService.queryByPage(arg0, arg1);
	}

	@Override
	public List<M> queryByParameters(Map<String, Object> arg0) {
		return this.baseService.queryByParameters(arg0);
	}

	@Override
	public M queryFull(Object arg0) {
		return this.baseService.queryFull(arg0);
	}

	@Override
	public List<M> queryFullAll() {
		return this.baseService.queryFullAll();
	}

	@Override
	public List<M> queryFullByPage(Map<String, Object> arg0, Page arg1) {
		return this.baseService.queryFullByPage(arg0, arg1);
	}

	@Override
	public List<M> queryFullByParameters(Map<String, Object> arg0) {
		return this.baseService.queryFullByParameters(arg0);
	}

	@Override
	public int saveList(List<M> arg0) {
		return this.baseService.saveList(arg0);
	}

	@Override
	public int saveListSelective(List<M> arg0) {
		return this.baseService.saveListSelective(arg0);
	}

	@Override
	public int saveOne(M arg0) {
		return this.baseService.saveOne(arg0);
	}

	@Override
	public int saveOneSelective(M arg0) {
		return this.baseService.saveOneSelective(arg0);
	}

	@Override
	public List<M> queryByPage(Map<String, Object> arg0, RowBounds arg1) {
		return this.baseService.queryByPage(arg0, arg1);
	}
}
