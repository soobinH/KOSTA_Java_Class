package Chapter5;

import java.util.Scanner;

public class jungol_162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		for(int i = 0; i<2; i++) {
			int input = sc.nextInt();
			arr[i] =input;
		}
		
		for(int i= 2; i<10; i++) {
			arr[i] = (arr[i-1] + arr[i-2])%10;
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
