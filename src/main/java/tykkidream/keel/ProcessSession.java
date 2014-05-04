package tykkidream.keel;

import java.util.HashMap;
import java.util.Map;

public class ProcessSession {
	private ProcessSession() {	}
	
	private static final ThreadLocal<ProcessSession> threadSession = new ThreadLocal<ProcessSession>();
	
	private Map<String, Object> params =  new HashMap<String, Object>();;	

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	
	public static ProcessSession getCurrentProcessSession() {
		ProcessSession session = threadSession.get();
		if (null == session) {
			session = new ProcessSession();
			threadSession.set(session);
		}
		return session;
	}

	public void put(String key, Object value) {
		params.put(key, value);
	}
	
	public Object get(String key) {
		return params.get(key);
	}
	
	public boolean containsKey(String key) {
		return params.containsKey(key);
	}

}
