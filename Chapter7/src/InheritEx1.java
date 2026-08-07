class Person {
	int age;
	String name;
	
	Person() {}
	Person(int age, String name) {
		this.age = age;
		this.name= name;
	}
	
	String info() {
		return String.format("이름: %s, 나이: %d", name, age);
	}
}

class Student extends Person{
	int grade;
	String major;
	
	
	// 부모 함수 갖다 붙이는 방법
	@Override
	String info() {
		return super.info()+String.format("학년: %d, 전공: %s", grade, major);
	}
	
	// 부모 클래스에 기본 생성자가 없으면 -> 자식은 무조건 기본 생성자를 호출하기 때문에 오류가 남
	// 따라서 없는 경우에는 부모의 생성자를 명시적으로 호출해 주어야 함
	Student() {
		super(0, null); // 자식 -> 부모의 생성자를 호출하는 것
	}
	
	Student(int age, String name, int grade, String major) {
		super(age, name);
		this.age = age;
		this.name = name;
		this.grade = grade;
		this.major = major;
	}
}

public class InheritEx1 {

	public static void main(String[] args) {
		Person p1 = new Person(20, "김길동");
		System.out.println(p1.info());
		
		Student s1 = new Student();
		s1.age = 29;
		s1.name ="홍길동";
		s1.grade = 4;
		s1.major = "철학";
		System.out.println(s1.info());
		
		Student s2 = new Student(20, "고길동", 1, "심리학");
		System.out.println(s2.info());
	}

}
