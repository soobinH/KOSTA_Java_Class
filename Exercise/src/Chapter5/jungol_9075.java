package Chapter5;

import java.util.Scanner;
public class jungol_9075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[10];
		
		while(true) {
			int input = sc.nextInt();
			if(input == 0) break;
			count[input%10]++;
		}
		
		for(int i =0; i<10; i++) {
			if(count[i] != 0)
				System.out.println(String.format("%d : %d개", i, count[i]));
						
		}
	}

}
