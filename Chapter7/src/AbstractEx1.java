abstract class Player {
	abstract void play(int pos);
	abstract void stop();
	
	void play() {
		play();
	}
}

class PlayerImp1 extends Player {
	void play(int pos) {
		System.out.println(pos+"위치에서 경기중");
	}
	
	void stop() {
		System.out.println("경기종료");
	}
}
public class AbstractEx1 {

	public static void main(String[] args) {
//		Player p1 = new Player(); // error": abstract 클래스는 객체 생성 불가능
		PlayerImp1 pil= new PlayerImp1(); // abstract 클래스를 상속받은 클래스는 abstract 메소드 모드를 오버라이딩 해야 객체 생성이 가능하다.
		pil.play(); // 부모의 메소드가 자식이 오버라이딩 한 play(int) 함수를 호출한다.
		pil.stop();
	}

}
