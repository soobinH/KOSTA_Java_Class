package Chapter6;

import java.util.Scanner;



public class jungol_174 {
	
	static int[][] scoreSum(int[][]scores) {
		int[][]result = new int[3][4];
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				result[i][j] = scores[i][j];
				result[i][3]+=scores[i][j];
			}
		}
		
		return result;
	}
	
	static void printResult(int[][]result) {
		for(int i= 0; i<3; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print(result[i][j]+" ");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] scores = new int[3][3];
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				scores[i][j] = sc.nextInt();
			}
		}
		
		printResult(scoreSum(scores));
		
		
	}

}
