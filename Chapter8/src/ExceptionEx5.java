
public class ExceptionEx5 {
	
	static void method1() throws Exception {
		try {
			method2();
		} catch(Exception e) {
			System.out.println("method1에서도 처리");
			throw new Exception("메인아 나 예외 발생했어.");
		}
	}
	
	static void method2() {
		try {
			String str = null;
			System.out.println(str.toString());
		} catch(Exception e) {
			System.out.println("method2에서 처리");
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			method1();
		} catch(Exception e) {
			System.out.println("main 에서도 처리");
		}
	}

}
