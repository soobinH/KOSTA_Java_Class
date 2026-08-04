package Chapter5;
import java.util.Scanner;

public class jungol_9074 {
//	1부터 10까지의 정수를 입력받다가 입력된 정수가 범위를 벗어나면 그 때까지 1번 이상 입력된 각 숫자의 개수를 작은 수부터 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		int[] count = new int[10];
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int input = sc.nextInt();
			if(input > 10 || input < 1) break;
			count[input-1]++;
		}
		
		for(int i = 0; i<10; i++) {
			if(count[i] != 0)
				System.out.println(String.format("%d : %d개", i+1, count[i]));
		}
		
		
	}

}
