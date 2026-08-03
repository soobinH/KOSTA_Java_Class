package Chapter5;

import java.util.Scanner;
public class jungol_561 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		for(int i = 0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		int min = 10000;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] < 100 && max<arr[i])
				max = arr[i];
			
			else if(arr[i] >= 100 && min>arr[i])
				min = arr[i];
		}
		
		if(max == 0) max = 100;
		if(min == 10000) min = 100;
		
		System.out.println(String.format("%d %d", max, min));
	}

}
