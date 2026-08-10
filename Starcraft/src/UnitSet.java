
public class UnitSet {

	
	Unit[] units = new Unit[10];
	int cnt;
	
	public void createUnit(Unit unit) {
		units[cnt++] = unit;
	}
	
	public void moveAll(int x, int y) {
		System.out.println();
		System.out.println("<<move all>>");
		for(int i = 0; i<cnt; i++) {
			units[i].move(x, y);
		}
	}
	
	public void allAirUnits() {
		System.out.println();
		System.out.println("<<print air units>>");
		for(int i = 0; i<cnt; i++) {
			if(units[i] instanceof AirUnit ) {
				System.out.println(units[i].toString());
			}
		}
	}
	
	public void allGroundUnits() {
		System.out.println();
		System.out.println("<<print ground units>>");
		for(int i = 0; i<cnt; i++) {
			if(units[i] instanceof GroundUnit ) {
				System.out.println(units[i].toString());
			}
		}
	}
	
	public void moveTank(int x, int y) {
		System.out.println();
		System.out.println("<<move tank>>");
		for(int i = 0; i<cnt; i++) {
			if(units[i] instanceof Tank) {
				units[i].move(x, y);
			}
		}
	}
	
	public void moveDropship(int x, int y) {
		System.out.println();
		System.out.println("<<move dropship>>");
		for(int i = 0; i<cnt; i++) {
			if(units[i] instanceof Dropship) {
				units[i].move(x, y);
			}
		}
	}
	
	public void move(Unit unit, int x, int y) {
		System.out.println();
		System.out.println("<<move " + unit.toString()+">>");
		for(int i = 0; i<cnt; i++) {
			if(units[i] == unit) {
				units[i].move(x, y);
			}
		}
	}
	
	public void stimPack() {
		System.out.println();
		System.out.println("<<Marine StimPack>>");
		for(int i = 0; i<cnt; i++) {
			if(units[i] instanceof Marine) {
				((Marine)units[i]).stimPack();
			}
		}
	}
	
	public void gather() {
		System.out.println();
		System.out.println("<<SCV gather>>");
		for(int i = 0; i<cnt; i++) {
			if(units[i] instanceof SCV) {
				((SCV)units[i]).gather();
			}
		}
	}
	
	

}
