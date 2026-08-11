

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.toString());
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}

}
