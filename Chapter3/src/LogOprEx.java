
// 논리 연산자 예제
public class LogOprEx {
	public static void main(String[] args) {
		int x = 5, y = 10;
		
		System.out.println(x>3 || ++y<20); // true
		System.out.println(y); // 10
		
		System.out.println(x<3 || ++y<20); // true -> or 연산은 앞의 조건이 true면 뒤에 있는 식은 실행하지 않음(논리 연산의 최적화)
		System.out.println(y); // 11
		
		int a = 3, b = 10;
		
		System.out.println(a >= 3 && ++b<20); // true
		System.out.println(b); // 11
		
		System.out.println(a < 3 && ++b<20); // false
		System.out.println(b); // 10 : && 연산은 앞 연산의 결과가 false이면 뒤에 있는 연산을 하지 않는다.
	}
}
