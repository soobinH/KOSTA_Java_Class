package Chapter03;
import java.util.Scanner;

// 다음은 소문자를 대문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다. 문자 코드는 소문자가 대문자보다 32만큼 더 크다.
// 예를 들어 A의 코드는 65이고 a의 코드는 97이다. 알맞은 코드를 작성하시오.
public class EX10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		char lowerCase =(ch>='A' && ch<='Z') ? (char)(ch+('a' - 'A')): ch;
		char upperCase = (ch>='a' && ch<='z') ? (char)(ch-('a' - 'A')): ch;
		System.out.println("upperCase: " + upperCase);
		System.out.println("lowerCase: " + lowerCase);
	}
}
