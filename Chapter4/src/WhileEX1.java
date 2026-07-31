
public class WhileEX1 {

	public static void main(String[] args) {
//		int i = 1;
//		while(i <= 100) {
//			System.out.println(i++);
//		}
		
		// 1~100 사이의 3의 배수가 아닌 값들의 합
		int sum3 = 0;
		int i2 = 1;
		while(i2<=100) {
			if(i2%3 == 0) {
				i2++;
				continue;
			}
			sum3 += i2++;

		}
				
		System.out.println("1~100 사이 3의 배수가 아닌 값들의 합: " + sum3);
						
		// 1+2+3 ... 연산을 할 때 처음으로 100보다 크거나 같은 sum의 값과 그때의 마지막 더해진 값
		int sum4 = 0;
		int last_num = 0;
		
		while(true) {
			sum4+=last_num;
			if(sum4>=100) break;
			last_num++;
		}
		System.out.println(String.format("sum4 = %d, 마지막으로 더해진 값: %d", sum4, last_num));
	
		
		
		
	}

}
