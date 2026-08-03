package Chapter5;

import java.util.Scanner;
public class jungol_9069 {

	public static void main(String[] args) {
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner sc = new Scanner(System.in);
		
		int year = 0;
		int month = 0;
		
		while(true) {
			System.out.print("YEAR = ");
			year = sc.nextInt();
			System.out.print("MONTH = ");
			month = sc.nextInt();
			
			if(month == 0) break;
			
			else if(month > 12 || month < 1) {
				System.out.println("잘못 입력하였습니다.\n");
				continue;
			}
			
			else if(month == 2) {
				if((year % 4 == 0 && year % 100 != 0) || (year%400 == 0)) {
					months[1] = 29;
				}
				else months[1] = 28;
			}
			
			System.out.println("입력하신 달의 날 수는 " + months[month-1] + "일입니다.\n");
		}
	}

}
