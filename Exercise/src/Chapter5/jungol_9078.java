package Chapter5;

import java.util.Scanner;

public class jungol_9078 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[][] arr1 = new int[3][3];
		int[][] arr2 = new int[3][3];
		
		for(int i= 0; i<6; i++) {
			if(i>=3) {
				System.out.print("두 번째 배열 " + (i%3+1) + "행: ");
			}
			else {
				System.out.print("첫 번째 배열 " + (i+1) + "행: ");
			}
			for(int j=0; j<3; j++) {
				int input = sc.nextInt();
				if(i>=3) {
					arr2[i%3][j] = input;
					
				}
				else {
					arr1[i][j] = input;
				}
				
			}
		}
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(String.format("%d ", (arr1[i][j] + arr2[i][j])));
			}
			System.out.println();
		}
		
		
		
	}

}
