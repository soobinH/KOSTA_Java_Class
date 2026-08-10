class Unit {
	int hitPoint;
	Unit() {
		hitPoint = 150;
	}
	int getHitPoint() {
		return hitPoint;
	}
}

interface Movable {
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit unit);
	
}

interface Fightable extends Movable, Attackable{ // interface를 상속받아 ijnterface를 만들 때는 extends 사용
	

	
}

class Fighter extends Unit implements Fightable {
	// interface를 상속받아클래스ㅡ를 만들 때에는 implements를 사용한다.
	
	@Override
	public void move(int x, int y) {
		
	}
	
	@Override
	public void attack(Unit unit) {
		
	}
	public void fight() {
		
	}
}



public class InterfaceEX1 {

	public static void main(String[] args) {
		Fighter f = new Fighter(); // 인터페이스도 업캐스팅된다. 하지만 해당 인터페이스 기능만 호출 가능
		f.move(0, 0);
		f.attack(null);
		f.getHitPoint();
		f.fight();
		
		Unit f2 = new Fighter();
		f2.getHitPoint();
//		f2.move(0, 0); //error
//		f2.attack(null); //error
//		f2.fight();	//error
		
		Fightable f3 = new Fighter();
		f3.attack(f2);
		f3.move(0, 0);
//		f3.getHitPoint(); //error
//		f3.fight(); //error
		
		Movable f4 = new Fighter();
		f4.move(0, 0);
//		f4.attack(f2); //error
//		f4.getHitPoint(); //error
//		f4.fight(); //error
		
		Attackable f5 = new Fighter();
		f5.attack(f2);
//		f5.getHitPoint(); //error
//		f5.fight(); //error
//		f5.move(0, 0); //error
		
		Object f6 = new Fighter();
//		f6.attack(f2); //error
//		f6.getHitPoint(); //error
//		f6.fight(); //error
//		f6.move(0, 0); //error
		
	}

}
