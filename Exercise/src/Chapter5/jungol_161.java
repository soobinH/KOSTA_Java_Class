package Chapter5;

import java.util.Scanner;

public class jungol_161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[11];
		
		for(int i = 0; i<100; i++) {
			int input = sc.nextInt();
			
			if(input == 0) break;
			
			count[input/10]++;
		}
		
		for(int i = count.length-1; i>=0; i--) {
			if(count[i] != 0)
				System.out.println(String.format("%d : %d person", i*10, count[i]));
		}
	}

}
