package Chapter4;

import java.util.Scanner;

//자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
//
//주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
//
//예제 #1
//입력
//3
//
//출력
//1 2 3 
//  4 5 
//    6
//
//
//예제 #2
//입력
//5
//
//출력
//1 2 3 4 5 
//  6 7 8 9 
//    10 11 12 
//      13 14 
//        15



public class jungol_147 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int print_num = 1;
		
		for(int i = 0; i<cnt; i++) {
			for(int j = cnt; j>cnt-i; j--) {
				System.out.print("  ");
			}
			
			for(int j = 0; j<cnt-i; j++) {
				System.out.print(String.format("%d ", print_num));
				print_num++;
			}
			System.out.println();
		}
	}

}
