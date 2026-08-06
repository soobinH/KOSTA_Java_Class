package Chapter6;

import java.util.Scanner;

public class jungol_171 {
	
	static int sum(int value) {
		int result = 0;
		for(int i = 1; i<=value; i++) {
			result += i;
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		System.out.println(sum(value));
	}

}
