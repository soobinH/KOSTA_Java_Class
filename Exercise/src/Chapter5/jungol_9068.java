package Chapter5;

import java.util.Scanner;
public class jungol_9068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100];
		int input = 1;
		int i = 0;
		while(true) {
			if(input == 0 || i>=100) break;
			input = sc.nextInt();
			arr[i] = input;
			i++;
		}
		
		for(int a = 1; a<arr.length; a+=2)
		{
			if(arr[a] == 0) break;
			System.out.print(arr[a] + " ");
		}
	}

}
