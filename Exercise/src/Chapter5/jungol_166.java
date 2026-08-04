package Chapter5;

import java.util.Scanner;

public class jungol_166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[][] arr1 = new int[2][3];
		int[][] arr2 = new int[2][3];
		
		for(int i =0; i<arr1.length + arr2.length; i++) {
			if(i == 0) System.out.println("first array");
			else if(i == 2) System.out.println("second array");
			
			for(int j = 0; j<arr1[i%2].length; j++) {
				int input = sc.nextInt();
				if(i>1) {
					arr2[i%2][j%3] = input;
				}
				else {
					arr1[i][j%3] = input;
				}
			}
		}
		
		for(int i = 0; i<arr1.length; i++) {
			for(int j= 0; j<arr1[i].length; j++) {
				System.out.print((arr1[i][j] * arr2[i][j]) + " ");
			}
			
			System.out.println();
		}
	}

}
