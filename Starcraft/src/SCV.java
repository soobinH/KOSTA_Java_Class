
public class SCV extends GroundUnit implements IRepairable{
	public SCV() {
		super(60);
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(String.format("(%d,%d)까지 호버링으로 이동한다.", x, y));
	
	}
	
	public void gather() {
		System.out.println("미네랄을 캐고 베스핀 가스를 채취하여 본진으로 운반한다.");
	}
	
	public void buildStructure() {
		System.out.println("테란의 건물을 짓는다");
	}
	
	
	@Override
	public void repaire(IRepairable runit) {
		Unit unit = (Unit)runit;
		unit.hitPoint = unit.MAX_HP;
//		System.out.println("체력이 깎인 기계 유닛이나 건물을 고친다.");
	}
	
	public String toString() {
		return "SCV";
	}
	
}
