package Chapter5;

import java.util.Scanner;

public class jungol_160 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[6];
		
		for(int i = 0; i<10; i++) {
			int input = sc.nextInt();
			count[input-1]++;
		}
		
		for(int i = 0; i<count.length; i++) {
			System.out.println(String.format("%d : %d", i+1, count[i]));
		}

	}

}
