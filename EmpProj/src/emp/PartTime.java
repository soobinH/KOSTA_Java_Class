package emp;

public class PartTime extends Employee implements IBusinessTrip{
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

	@Override
	public void goBusinessTrip(int day) {
		time  = 24*day;
	}
	
}
