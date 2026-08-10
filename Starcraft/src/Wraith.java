
public class Wraith extends AirUnit implements IRepairable{
	public Wraith() {
		super(120);
	}

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(String.format("%d, %d)까지 대기권과 우주 공간을 비행하며 이동한다.", x, y));
		
	}
	
	public void cloak() {
		System.out.println("에너지를 소모하여 적의 눈에 보이지 않게 숨는다.");
	}
	
	public void dualWeaponSystem() {
		System.out.println("적이 공중에 있으면 제미니 미사일, 지상에 있으면 버스트레이저로 이원화 공격이 가능하다");
	}
	
	public String toString() {
		return "Wraith";
	}

	@Override
	public void repaire(IRepairable unit) {
		// TODO Auto-generated method stub
		
	}
	
	


}
