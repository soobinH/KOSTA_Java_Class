
public class Dropship extends AirUnit implements IRepairable {
	public Dropship() {
		super(150);
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(String.format("(%d, %d) 까지 날아간다.", x, y));
	}
	
	public void load() {
		System.out.println("선택된 대상을 태운다.");
	}
	
	public void unload() {
		System.out.println("선택된 대상을 내린다.");
	}
	
	public String toString() {
		return "Dropship";
	}

	@Override
	public void repaire(IRepairable unit) {
		
	}
	


	
}
