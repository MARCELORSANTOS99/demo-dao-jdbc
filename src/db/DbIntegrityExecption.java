package db;

public class DbIntegrityExecption extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public DbIntegrityExecption(String msg) {
		super(msg);
	}

}
