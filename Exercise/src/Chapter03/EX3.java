package Chapter03;

// 변수 num의 값에 따라 양수, 음수, 0을 출력하는 코드이다. 삼항 연산자를 이용해서 알맞은 코드를 작성하라.
public class EX3 {

	public static void main(String[] args) {

		int num = 10;
		System.out.println(num > 0 ? "양수" : num < 0 ? "음수" : 0);
	}

}
