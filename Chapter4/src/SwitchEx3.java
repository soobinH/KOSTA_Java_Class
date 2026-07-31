import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("등급: ");
		String grade = sc.nextLine();
		double rate = 0d;
		switch(grade.toUpperCase()) {
		case "VIP": rate = 0.4; break;
		case "GOLD": rate = 0.3; break;
		case "SILVER": rate = 0.2; break;
		case "NORMAL": rate = 0.1; break;
		default: 
			grade = "바보";
			rate = 0;
			break;
		}
		
		System.out.println(String.format("등급: %s, 이자율: %.1f", grade, rate));
	}

}
