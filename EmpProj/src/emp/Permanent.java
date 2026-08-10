package emp;

public class Permanent extends Employee{
	int salary;
	
	public Permanent() {
		super();
	}
	
	public Permanent(String id, String name, int salary) {
		super(id, name);
		this.salary = salary;
	}
	
	@Override
	public int getPay() {
		return salary;
	}


	
	
	
	

}
