
// 자료형 비교 예제
public class TwoPerEx {

	public static void main(String[] args) {

		float pi = 3.141592F;
		System.out.println(pi);
		
//		//3141.592f -> 3141 -> 3.141f
//		pi = (int)(pi * 1000) / 1000f;
//		System.out.println(pi);
		
//		//3141.592f -> 3142 -> 3.142f
//		pi = (int)(pi * 1000 + 0.5) / 1000f;
//		System.out.println(pi);
		
		// 3.142
		pi = Math.round(pi*1000) / 1000f;
		System.out.println(pi);
		
		// 몫 구하기
		int mok = 10 / 8;
		System.out.println(mok);
		
		// 평균 구하기
		int kor = 85, eng = 88, math = 98;
		int tot = kor+eng+math;
		float avg = tot/(float)3;
		System.out.println(tot);
		System.out.println(avg);
		
		// 나머지 구하기
		int res = 10 % 8;
		System.out.println(res);
		
		
		// double vs float 
		System.out.println(0.1d == 0.1f); // false
		System.out.println((float)0.1d == 0.1f); // true
		
		System.out.println(10.0d == 10.0f); // true
		System.out.println((float)10.0d == 10.0f); // true

		// 0.1을 10번 더하면
		System.out.println(0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1); // 0.999...
		
		
		
	}

}
