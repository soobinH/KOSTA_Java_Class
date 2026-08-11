package Chapter8;

class UnsupportedFuctionException extends RuntimeException{
	final private int ERR_CODE;
	
	UnsupportedFuctionException() {
		this.ERR_CODE = 100;
	}
	
	UnsupportedFuctionException(String message, int errCode) {
		super(message);
		this.ERR_CODE = errCode;
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
}


public class EX9 {

	public static void main(String[] args) throws Exception {
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);

	}

}
