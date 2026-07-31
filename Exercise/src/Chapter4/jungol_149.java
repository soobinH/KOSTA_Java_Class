package Chapter4;
import java.util.Scanner;


//자연수 n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오. 10 미만의 홀수만 출력하시오.
// 주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
//예제 #1
//입력
//3
//
//출력
//1 3 5 
//7 9 1 
//3 5 7
//
//
//예제 #2
//입력
//6
//
//출력
//1 3 5 7 9 1 
//3 5 7 9 1 3 
//5 7 9 1 3 5 
//7 9 1 3 5 7 
//9 1 3 5 7 9 
//1 3 5 7 9 1


public class jungol_149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int num = 1;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(num>10) num = 1;
				System.out.print(String.format("%d ", num));
				num += 2;
			}
			System.out.println();
			
		}
	}

}
