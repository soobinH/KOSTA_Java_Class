
public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 만든 예외");
			throw e;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}

}
