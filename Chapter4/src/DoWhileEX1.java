import java.util.Scanner;
public class DoWhileEX1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input_number = 10;
		int sum = 0;
		
//		do {
//			System.out.print("숫자 입력(0을 입력 시 종료): ");
//			input_number= sc.nextInt();
//			sum+=input_number;
//		} while(input_number>0);
//		
//		System.out.println(sum);
		
//		for(int i = 0; ; i++) {
//			if(input_number == 0) break;
//			System.out.print("숫자 입력(0을 입력 시 종료): ");
//			input_number= sc.nextInt();
//			sum+=input_number;
//		}
//		System.out.println(sum);
		
		while(input_number>0) {
			System.out.print("숫자 입력(0을 입력 시 종료): ");
			input_number= sc.nextInt();
			sum+=input_number;
		}
		System.out.println(sum);
		
		
	}

}

// 숫자 입력:
// 숫자를 반복적으로 입력받아 누적한다.
// 0 값이 입력되면 최종 누적된 값을 출력한다.