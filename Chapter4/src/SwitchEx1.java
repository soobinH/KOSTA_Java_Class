import java.util.Scanner;

public class SwitchEx1 {

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
		
		switch((int)avg/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
				
		}
	}

}
