package Chapter5;

import java.util.Scanner;

public class jungol_9079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores = new int[3][3];
		int[][] result = new int[4][4];
		String[] subjects = {"국어 ", "영어 ", "수학 ", "총점"};
		String[] titles = {" 1번", " 2번", " 3번", "합계"};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<scores.length; i++) {
			System.out.print(String.format("%d번째 학생의 점수 ",i+1));
			
			for(int j = 0; j<scores[i].length; j++) {
				int input = sc.nextInt();
				scores[i][j] = input;
				result[i][j] = scores[i][j];
			}
		}
		
		for(int i = 0; i<scores.length; i++) {
			for(int j =0; j<scores[i].length; j++) {
				result[i][result.length-1] += result[i][j];
				result[result.length-1][j] += result[i][j];
				result[result.length-1][result.length-1] += scores[i][j];
			}
		}
		
		for(int i= 0; i<5; i++) {
			if(i!=0)
				System.out.print(titles[i-1]);
			
			for(int j = 0; j<5; j++) {
				if(i == 0 && j == 0) System.out.print("     ");
				else if(i == 0 && j>0) System.out.print(subjects[j-1]);
				else if(j!= 0){
					if(result[i-1][j-1]/100 > 0) System.out.print(" ");
					else System.out.print("  ");
					
					System.out.print(result[i-1][j-1]);
				}
			}
			System.out.println();
		}
		
		
	}

}
