package Chapter5;

import java.util.Scanner;
public class jungol_9070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int max = 0;
		
		for(int i = 0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		
		System.out.println(max);
	}

}
