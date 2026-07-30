
public class Hello {

	static int si;
	
	public static void main(String[] args) {
//		System.out.println("Hello Java!!"); // 출력
		
		
//		int age;	// 변수 선언
//		age = 24;	// 값의 초기화
		
		int age = 24; // 변수의 선언과 동시에 초기화
		System.out.println("Age: " + age);
		
//		float height = 174.5F; // float 선언 시 F 붙여야 함(기본값이 double이므로)
		double height = 174.5; // double 선언 시 아무것도 안 붙여도 됨
		System.out.println("Height: " + height);
		
		boolean married = false;
		System.out.println("Married: " + married);
		
		char blood = 'A';
		System.out.println("Blood type: " + blood);
		
		String name = "황수빈";
		System.out.println("Name: " + name);
		
		final float PI = 3.14F; // 상수 선언
		System.out.println("PI: " + PI );
		
		String grade;
//		System.out.println(grade); // 초기화 하지 않은 변수는 사용할 수 없다.
		System.out.println(si);
	} 

}
