package Chapter5;

import java.util.Scanner;
public class jungol_560 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		for(int i = 0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(min>arr[i]) min = arr[i];
		}
		
		System.out.println(min);
	}
}
