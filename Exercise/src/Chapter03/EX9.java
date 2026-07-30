package Chapter03;

// 다음은 문자형 변수 ch가 영문자(대문자 or 소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다. 알맞ㄴ은 코드를 넣으시오.
public class EX9 {

	public static void main(String[] args) {

		char ch = 'z';
		boolean b = (ch >= 'A') && (ch <= 'Z') || 
					(ch >= 'a') && (ch <= 'z') || 
					(ch >= '0') && (ch <= '9');
		System.out.println(b);
	}

}
