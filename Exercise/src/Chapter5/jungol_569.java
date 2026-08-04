package Chapter5;

import java.util.Scanner;

public class jungol_569 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] scores = new int[5][4];
		int[] avg = new int[5];
		int total = 0;
		int pass = 0;
		
		for(int i = 0; i<scores.length; i++) {
			for(int j = 0; j<scores[i].length; j++) {
				int input = sc.nextInt();
				scores[i][j]= input;
				total += scores[i][j];
			}
			
			avg[i] = total/4;
			total = 0;
		}
		
		for(int i = 0; i<avg.length; i++) {
			if(avg[i] >= 80) {
				System.out.println("pass");
				pass++;
			}
			
			else
			{
				System.out.println("fail");
			}
		}
		
		System.out.println("Successful : " + pass);
		
	}

}
