package emp;

public class Sales extends Permanent implements IBusinessTrip {
	int incentive;
	
	public Sales() {
		super();
	}
	
	public Sales(String id, String name, int salary, int incentive) {
		super(id, name, salary);
		this.incentive = incentive;
	}
	
	@Override
	public int getPay() {
		return salary+incentive;
	}
	
	@Override
	public void goBusinessTrip(int day) {
		incentive += day*200000;
	}
	
}
