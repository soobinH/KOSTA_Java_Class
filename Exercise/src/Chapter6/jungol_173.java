package Chapter6;

import java.util.Scanner;

public class jungol_173 {
	static int powSub(int val1, int val2) {
		int max = 0;
		int min = 0;
		
		if(val1>val2) {
			max = val1;
			min = val2;
		}
		
		else if(val1<val2)
		{
			max = val2;
			min = val1;
		}
		
		else return 0;
		
		return (int)(Math.pow(max, 2) - Math.pow(min, 2));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val1 = sc.nextInt();
		int val2 = sc.nextInt();
		
		System.out.println(powSub(val1, val2));
		
		
	}

}
