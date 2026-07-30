package Chapter03;

// 아래 코드의 문제점을 수정해서 실행 결과와 같은 결과를 얻도록 하시오.
public class EX8 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
//		byte c = a + b;
		byte c = (byte)(a + b); // 강제 형변환
		
		char ch = 'A';
//		ch = ch + 2;
		ch = (char)(ch + 2); // 강제 형변환
		
//		float f = 3/2
		float f = 3/2f; // float 값으로 나눠야 함
		
//		long l = 3000*3000*3000; 
		long l = 3000L * 3000L * 3000L; // Long이므로 L 키워드를 붙여야 연산이 정상적으로 됨
		
		float f2 = 0.1f;
//		double d = 0.1;
		double d = (float)0.1; // double과 float은 byte 수 자체가 다르기 때문에 강제 형변환을 해야 같아짐
		
		boolean result = d == f2;
		
		System.out.println("c = " + c);
		System.out.println("ch = " + ch);
		System.out.println("f = " + f);
		System.out.println("l = " + l);
		System.out.println("result = " + result);
	}
}
