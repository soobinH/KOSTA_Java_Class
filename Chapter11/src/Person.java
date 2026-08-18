
public class Person {

	int age;
	String name;
	
	public Person() {
		this(0, "이름없음");
	}
	
	public Person(int age) {
		this(age, "이름없음");
	}
	
	public Person(String name) {
		this(0, name);
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name= name;
	}
	
	public String toString() {
		return String.format("이름 %s, 나이 %d", name, age);
	}

}
