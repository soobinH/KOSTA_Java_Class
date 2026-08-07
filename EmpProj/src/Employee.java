
public class Employee {
	String id;
	String name;
	
	public Employee() {}
	
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getPay() {
		return 0;
	}
	
	public String info() {
		return String.format("사번: %s, 이름: %s, 급여: %d", id, name, getPay());
	}
}
