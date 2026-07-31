package Chapter4;

import java.util.Scanner;

//자연수 n(n≤6)을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
//
//주의! 문자는 공백으로 구분하되 줄사이에 빈줄은 없다.
//입력
//3
//
//출력
//A B C 
//D E 0 
//F 1 2
//
//
//예제 #2
//입력
//6
//
//출력
//A B C D E F 
//G H I J K 0 
//L M N O 1 2 
//P Q R 3 4 5 
//S T 6 7 8 9 
//U 10 11 12 13 14


public class jungol_146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		char alphabet = 'A';
		int number = 0;
		for(int i = 1; i<=cnt; i++) {
			for(int j = cnt; j>=i; j--) {
				System.out.print(alphabet+" ");
				alphabet++;
			}
			for(int k = 1; k<i; k++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}

	}

}
