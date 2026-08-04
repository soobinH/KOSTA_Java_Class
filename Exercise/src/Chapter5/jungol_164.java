package Chapter5;

import java.util.Scanner;

public class jungol_164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] class_result = new int[4];
		
		for(int i = 0; i<class_result.length; i++) {
			System.out.print((i+1) + "class? ");
			for(int j = 0; j<3; j++) {
				int input = sc.nextInt();
				class_result[i] += input;
			}
		}
		
		for(int i = 0; i<class_result.length; i++) {
			System.out.println(String.format("%dclass : %d", i+1,class_result[i]));
		}
		
		
	}

}
