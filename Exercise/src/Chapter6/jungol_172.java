package Chapter6;

import java.util.Scanner;

public class jungol_172 {

	static void printSquare(int value) {
		for(int i = 1; i<=value; i++) {
			for(int j = 1; j<=value; j++) {
				System.out.print(i*j+" ");
			}
			
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		printSquare(value);
	}

}
