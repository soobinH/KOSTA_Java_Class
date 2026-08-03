package Chapter5;

import java.util.Scanner;
public class jungol_559 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] avg_score = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		int class1 = sc.nextInt();
		int class2 = sc.nextInt();
		double avg = avg_score[class1-1]+avg_score[class2-1];
		System.out.println(String.format("%.1f", avg));
	}

}
