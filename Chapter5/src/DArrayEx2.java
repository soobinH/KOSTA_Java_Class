import java.util.Scanner;
public class DArrayEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("반의 수를 입력하시오: ");
		int class_num = sc.nextInt();
		
		int[][] darr = new int[class_num][]; // 5개짜리 배열을 생성했는데, 배열 요소의 타입 int 1차원 배열이다.
		
		int students = 0;
		int sum = 0;
		for(int i = 0; i<class_num; i++) {
			System.out.print(String.format("%d반의 학생 수를 입력하시오: ", i+1));
			students = sc.nextInt();
			darr[i] = new int[students];
			sum += darr[i].length;
		}
		
		for(int i = 0; i<darr.length; i++) {
			for(int j = 0; j<darr[i].length; j++) {
				System.out.print(String.format("%d반 %d번 학생 점수: ", i+1,j+1));
				darr[i][j] = sc.nextInt();
			}
			
			System.out.println();
		}
		
		for(int i = 0; i<darr.length; i++) {
			for(int j = 0; j<darr[i].length; j++) {
				System.out.print(darr[i][j] + " ");
			}
			
			System.out.println();
		}

		
	}

}

// 1. 반의 수를 입력 받아 배열을 만든다.
// 2. 각 방의 학생 수를 입력 받아 각 반의 배열을 만든다.
