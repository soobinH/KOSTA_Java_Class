package Chapter5;

import java.util.Scanner;

public class jungol_568 {

	public static void main(String[] args) {

				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				
				int[][] arr1 = new int[2][4];
				int[][] arr2 = new int[2][4];
				
				for(int i= 0; i<4; i++) {
					if(i == 0) {
						System.out.println("first array");
					}
					else if(i == 2) {
						System.out.println("second array");
					}
					for(int j=0; j<4; j++) {
						int input = sc.nextInt();
						if(i>=2) {
							arr2[i%2][j] = input;
							
						}
						else {
							arr1[i][j] = input;
						}
						
					}
				}
				
				for(int i = 0; i<2; i++) {
					for(int j = 0; j<4; j++) {
						System.out.print(String.format("%d ", (arr1[i][j] * arr2[i][j])));
					}
					System.out.println();
				}
	}

}
