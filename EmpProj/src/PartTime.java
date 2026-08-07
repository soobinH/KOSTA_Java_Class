
public class PartTime extends Employee {
	int time;
	int payPerTime;
	
	public PartTime() {
		super();
	}
	
	public PartTime(String id, String name, int payPerTime, int time) {
		super(id, name);
		this.payPerTime = payPerTime;
		this.time = time;
	}
	
	@Override
	public int getPay() {
		int total = time*payPerTime;
		return total;
	}
	
}
