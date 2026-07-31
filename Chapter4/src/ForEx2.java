
public class ForEx2 {

	public static void main(String[] args) {

		// 1~100까지의 합
		int sum = 0;
		for(int i = 1; i<=100;i++) {
			sum += i;
		}
		
		System.out.println("1~100까지의 합: " + sum);
		
		// 1~10까지의 곱
		int mul = 1;
		for(int i = 1; i<= 10; i++) {
			mul *= i;
		}
		
		System.out.println("1~10까지의 곱: " + mul);
		
		// 1~100 사이 짝수의 합
		int sum2 = 0;
//		for(int i = 1; i<=100; i++) {
//			if(i % 2 == 0) {
//				sum2 += i;
//			}
//		}
		
		for(int i = 2; i<=100; i += 2) {
			sum2 += i;
		}
		
		System.out.println("1~100 사이 짝수의 합: " + sum2);
		
		// 1~100 사이의 3의 배수가 아닌 값들의 합
		int sum3 = 0;
		for(int i = 1;i<=100; i++) {
			if(i % 3 == 0) {
				continue;
			}
			sum3 += i;
		}
		
		System.out.println("1~100 사이 3의 배수가 아닌 값들의 합: " + sum3);
		
		// 1+2+3 ... 연산을 할 때 처음으로 100보다 크거나 같은 sum의 값과 그때의 마지막 더해진 값
		int sum4 = 0;
		int last_num = 0;
		
//		for(int i = 0; sum4 < 100; i++) {
//			sum4 += i;
//			last_num = i;
//		}
		
		while(true) {
			sum4+=last_num;
			if(sum4>=100) break;
			last_num++;
		}
		System.out.println(String.format("sum4 = %d, 마지막으로 더해진 값: %d", sum4, last_num));
	
		
		// 구구단 2단 출력
		int dan = 2;
		for(int i = 1; i < 10; i++) {
			System.out.println(String.format("%d x %d = %d", dan, i, dan*i));
		}
		
		
		
	}

}
