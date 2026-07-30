
// 형변환 예제
public class AutoTypeCastEx {

	public static void main(String[] args) {

		byte x = 10;
		byte y = 20;
		
//		byte r = x + y; // error: x+y의 결과는 int 이기 때문에 (byte+byte -> int+int)
//		byte r = (byte)x+y; // error: cast 연산자가 +연산자보다 우선순위가 높다
		
		byte r = (byte)(x+y);
		
		int a = 10000000;
		int b = 20000000;
		
		long l = (long)a*b;
		System.out.println(l);
		
		long t = 1000000*10000000L;
		System.out.println(t);
		
		int c = 1000000*1000000/1000000; // overflow
		System.out.println(c);
		
		int d = 1000000 / 1000000*1000000;
		System.out.println(d);
		
		char chA = 'A';
		char chB = (char)(chA + 1);
		System.out.println(chB);
		
		char chB2 = ++chA;
		System.out.println(chB2);
		
		char ch5 = '5';
		int n5 = '5' - '0';
		System.out.println(n5);
		
		
		
		char large_c = 'C';
		char small_c = (char)('C' + ('a' - 'A'));
		System.out.println(small_c);
	}

}
