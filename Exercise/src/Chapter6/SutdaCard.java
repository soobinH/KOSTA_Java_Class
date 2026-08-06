package Chapter6;
//[6-1] 다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오
//int num 카드의 숫자.(1~10사이의 정수)
//boolean isKwang 광(光)이면 true, 아니면 false


public class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num , boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return String.format("%d%s", num, isKwang?"K":" ");
	}
	
}
