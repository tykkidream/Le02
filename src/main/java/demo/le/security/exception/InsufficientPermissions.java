package demo.le.security.exception;

public class InsufficientPermissions extends RuntimeException {

	private static final long serialVersionUID = 2009532099645782998L;

	public InsufficientPermissions(){
		
	}
	
	public InsufficientPermissions(String arg0){
		super(arg0);
	}


}
