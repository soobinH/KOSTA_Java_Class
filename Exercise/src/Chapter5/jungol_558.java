package Chapter5;

import java.util.Scanner;
public class jungol_558 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		
		int input = 0;
		int count = 0;
		
		while(true) {
			input = sc.nextInt();
			if(input == 0) break;
			arr[count] = input;
			count++;
		}
		
		for(int i = count-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
