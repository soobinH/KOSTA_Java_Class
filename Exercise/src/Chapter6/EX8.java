package Chapter6;
//다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.

class PlayingCard {
	int kind;
	int num;
	static int width;
	static int height;
	
	PlayingCard(int k, int n) {
		kind = k;
		num = n;
	}
}

//- 클래스변수(static변수) : static int width, static int height;
//- 인스턴스변수 : int kine; int num;
//- 지역변수 :  int k, int n;

public class EX8 {
	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1,1);

	}

}


