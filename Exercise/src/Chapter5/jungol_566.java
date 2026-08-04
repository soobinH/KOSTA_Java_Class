package Chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Scanner;
public class jungol_566 {

	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		System.out.println(input);
		int[] arr = new int[100];
		arr[0]= 100;
		arr[1] = input;
		
		int i = 0;
		for(i = 0; i<arr.length; i++) 
		{
			arr[i+2] = arr[i]-arr[i+1];
			if(arr[i+2] < 0) break;
		}
		
		
		for(int j=0; j<=i+2; j++) {

				System.out.print(arr[j] + " ");
		}
		System.out.println();
	}

}
