import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 과목 성적을 입력하세요: ");
		int kor = sc.nextInt();
		System.out.print("영어 과목 성적을 입력하세요: ");
		int eng = sc.nextInt();
		System.out.print("수학 과목 성적을 입력하세요: ");
		int math = sc.nextInt();
		
		int tot = kor + eng + math;
		
		double avg = tot/3d;
		System.out.println("평균 " + avg + "점");
		
		if(avg>=90) {
			if(avg>=95) {
				System.out.println("A+");
			}
			else {
				System.out.println("A");
			}
		}
		else if(avg>=80) {
			System.out.println("B");
		}
		else if(avg>=70) {
			System.out.println("C");
		}
		else if(avg>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		

	}

}
