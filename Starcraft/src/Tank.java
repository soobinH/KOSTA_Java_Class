public class Tank extends GroundUnit implements IRepairable {
	public Tank() {
		super(150);
	}

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y= y;
		System.out.println(String.format("(%d, %d)까지 굴러서 이동한다.", x,y));

	}
	
	void changeMode() {
		System.out.println("공격 모드를 변환한다.");
	}
	
	public String toString() {
		return "Tank";
	}
	
	@Override
	public void repaire(IRepairable unit) {
//		unit.hitPoint = unit.MAX_HP;
//		System.out.println("체력이 깎인 기계 유닛이나 건물을 고친다.");
	}

}
