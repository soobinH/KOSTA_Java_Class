
public class UserExceptionEx {

	public static void main(String[] args) {
		try {
			throw new MyException("내가 만든 예외 처리");
		} catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
