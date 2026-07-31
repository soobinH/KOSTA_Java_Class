import java.util.Scanner;

public class SwitchEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] ins = input.split(" ");
		
		int val1 = Integer.parseInt(ins[0]);
		int val2 = Integer.parseInt(ins[2]);
		char op = ins[1].charAt(0);
		
//		System.out.println(val1);
//		System.out.println(val2);
//		System.out.println(op);

		int res = 0;
		switch(op) {
		case '+' : res = val1+val2; break;
		case '-' : res = val1-val2; break;
		case 'x' : res = val1*val2; break;
		case '/' : res = val1/val2; break;
		case '%' : res = val1%val2; break;
		}
		
		System.out.println(String.format("%d %c %d = %d", val1, op, val2, res));
		
	}
}
