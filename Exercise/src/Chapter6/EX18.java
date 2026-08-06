package Chapter6;

//[6-18] 다음의 코드를 컴파일 하면 에러가 발생한다. 컴파일 에러가 발생하는 라인과 그
//이유를 설명하시오.
//class MemberCall {
//	int iv = 10;
//	static int cv = 20;
//	int iv2 = cv;
//	static int cv2 = iv; // 라인 A
//	static void staticMethod1() {
//		System.out.println(cv);
//		System.out.println(iv); // 라인 B
//	}
//	void instanceMethod1() {
//		System.out.println(cv);
//		System.out.println(iv); // 라인 C
//	 }
//	static void staticMethod2() {
//		staticMethod1();
//		instanceMethod1(); // 라인 D
//	}
//	void instanceMethod2() {
//		staticMethod1(); // 라인 E
//		instanceMethod1();
//	}
//}

// 오류가 나는 라인: Line D
// 오류가 나는 이유: static 함수에서는 instance 함수를 사용할 수 없기 때문이다.


public class EX18 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
