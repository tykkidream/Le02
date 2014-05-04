package demo.le.base.security;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import demo.le.base.model.User;
import demo.le.security.model.Permissions;
import demo.le.security.model.UserPermissions;
import demo.le.security.service.PermissionsService;
import demo.le.security.service.UserPermissionsService;
import tykkidream.keel.AbstractBaseServiceAdapter;
import tykkidream.keel.InsufficientPermissionsException;
import tykkidream.keel.MissingUserException;
import tykkidream.keel.ProcessSession;
import tykkidream.keel.base.Page;
import tykkidream.keel.mybatis.BaseService;

public class BaseServiceSecurity<M> extends AbstractBaseServiceAdapter<M>{

	private UserPermissionsService userPermissionsService = null;
	private PermissionsService permissionsService = null;

	public UserPermissionsService getUserPermissionsService() {
		return userPermissionsService;
	}

	public void setUserPermissionsService(UserPermissionsService userPermissionsService) {
		this.userPermissionsService = userPermissionsService;
	}

	public PermissionsService getPermissionsService() {
		return permissionsService;
	}

	public void setPermissionsService(PermissionsService permissionsService) {
		this.permissionsService = permissionsService;
	}
	
	public BaseServiceSecurity(BaseService<M> baseService) {
		super(baseService);
	}

	@Override
	public List<M> queryFullByPage(Map<String, Object> arg0, RowBounds arg1) {
		return this.baseService.queryFullByPage(arg0, arg1);
	}

	@Override
	public boolean create(M arg0) {
		boolean result = false;
		ProcessSession session = ProcessSession.getCurrentProcessSession();
		User user = null;
		if (session.containsKey("user")) {
			 user = (User)session.get("user");
		}
		if (null != user) {
			
		}
		
		result = this.baseService.create(arg0);
		
		return result;
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

	public static long Permissions_Code_QueryByKey = 10000L;
	
	@Override
	public M queryByKey(Object arg0) {
		M result = null;
		
		Permissions permissions = null;
		User user = null;
		
		
		ProcessSession session = ProcessSession.getCurrentProcessSession();
		if (session.containsKey("user")) {
			 user = (User)session.get("user");
		}
		if (null == user) {
			throw new MissingUserException();
		}
		
		permissions = getPermissionsService().queryByKey(Permissions_Code_QueryByKey);
		
		UserPermissions userPermissions = null; 
		List<UserPermissions> list = getUserPermissionsService().queryByUserID(user.getId());
		Iterator<UserPermissions> iterator = list.iterator();
		while (iterator.hasNext()) {
			userPermissions = iterator.next();
			if (userPermissions.getId() == Permissions_Code_QueryByKey) {
				break;
			}
		}
		
		if ("1".equals(userPermissions.getValue())) {
			result = this.baseService.queryByKey(arg0);
		} else {
			throw new InsufficientPermissionsException();
		}
		
		return result;
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
