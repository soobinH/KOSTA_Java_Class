
public class MyException extends Exception{

	private final int errorCode;
	
	public MyException(String message) {
		this(message, 100);
	}
	
	
	public MyException(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public int getErrorCode() {
		return errorCode;
	}

}
