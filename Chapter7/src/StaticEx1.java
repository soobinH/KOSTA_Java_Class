class Card {
	final int number;
	final String shape;
	

	
	Card(int number, String shape) { // 인스턴스, 파이널 변수는 반드시 생성자에서 초기화해야 한다. 
		this.number = number;
		this.shape = shape;
	}
	
	static int width = 150; // static final 변수는 명시적 초기화나 static 초기화 블록을 통해 초기화 해야 한다.
	static int height = 120;

	final String info() {
		return String.format("(%d, %s)", number, shape);
	}
}

//class SpecialCard extends Card {
//	boolean joker;
//	SpecialCard(int number, String shape) {
//		super(number, shape);
//		this.joker = joker;
//	}
//}


public class StaticEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		n = 20;
		
		final int FN = 200;

	}

}
