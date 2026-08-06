class Person { // 클래스(약간 거푸집? 느낌)
	int age;
	String name;
	
	// 기본 생성자 : 매개변수가 없는 생성자
	// 클래스에 생성자가 하나도 없으면 기본 생성자는 자동 생성된다.
	// 하지만 생성자가 하나라도 있으면 자동 생성되지 않기 때문에 수동으로 반드시 넣어 줘야 한다.
	Person() {}
	
	Person(int Age) {
		this(Age, "이름 없음");
	}
	
	Person(String aName){
		this(0, aName);
	}
	
	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	
	
	void info() {
		System.out.println(String.format("이름: %s, 나이: %d", name,age));
	}
}


public class ClassEx1 {

	public static void main(String[] args) {
		int n;
		Person p1 = new Person(); // 객체, 인스턴스 선언
		p1.age= 20;
		p1.name = "곰순이";
		
		//System.out.println(p1.info());
		
		
		Person p3 =p1;
		
		//System.out.println(p3.info()); // 나이, 이름 전부 p1이랑 같음
		
		p1.age = 100;
		//System.out.println(p3.info()); // p1 걸 바꿨는데 p3까지 같이 바뀜
		
		Person[] pers = new Person[3]; // 객체를 생성한 것이 아니라 배열을 생성한 것임
		
		for(int i = 0; i<pers.length; i++) {
			pers[i] = new Person();
		}
		
		pers[0].age = 10;
		pers[1].age = 20;
		pers[2].age = 20;
		
		pers[0].name = "고길동";
		pers[1].name = "하길동";
		pers[2].name = "정길동";
		
		for(int i = 0; i<pers.length; i++) {
			pers[i].info();
		}

		
	}

}

// 10,고길동
// 20, 하길동
//20, 정길동
