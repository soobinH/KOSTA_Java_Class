
public class Sales extends Permanent {
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
	
}
