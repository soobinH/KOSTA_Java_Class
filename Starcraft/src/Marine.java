
public class Marine extends GroundUnit{
	public Marine() {
		super(40);
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(String.format("(%d, %d)까지 걸어간다.", x,y));
	}

	public void stimPack() {
		System.out.println("도핑을 맞고 각성하여 총알을 빨리 쏜다");
	}
	
	public String toString() {
		return "Marine";
	}
}
