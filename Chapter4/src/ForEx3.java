import java.util.Scanner;
public class ForEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단의 몇 단을 출력할 것인지 입력: ");
		int dan = sc.nextInt();
		for(int i = 1; i<10; i++) {
			System.out.println(String.format("%d x %d = %d", dan, i, dan*i));
		}
	}

}
