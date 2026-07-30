
// 삼항 연산자 예제
public class ThreeOpEx {
	public static void main(String[] args) {
		int x = 3, y = 5;
		
		// 최댓값 구하기(두 수의 비교)
		int max = x>y ? x:y;
		System.out.println(max);
		
		// 최솟값 구하기(두 수의 비교)
		int min = x<y ? x:y;
		System.out.println(min);
		
		// 절댓값 구하기
		int n = -9;
		int abs = n<0 ? -n:n;
		System.out.println(abs);
	}

}
