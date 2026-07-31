import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int print_num = 1;
		
		for(int i = 0; i<cnt; i++) {
			for(int j = cnt; j>cnt-i; j--) {
				System.out.print("  ");
			}
			
			for(int j = 0; j<cnt-i; j++) {
				System.out.print(String.format("%d ", print_num));
				print_num++;
			}
			System.out.println();
		}
		
	}
}
