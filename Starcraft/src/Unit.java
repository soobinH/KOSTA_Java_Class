
abstract public class Unit {

	int x, y;
	int hitPoint;
	
	final int MAX_HP;
	
	public Unit(int hp) {
		this.MAX_HP = hp;
		hitPoint = MAX_HP;
	}

	abstract public void move(int x, int y);
	public void stop() {
		System.out.println("멈춘다");
	}

}
