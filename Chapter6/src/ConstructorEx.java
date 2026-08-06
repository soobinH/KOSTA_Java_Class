
public class ConstructorEx {

	public static void main(String[] args) {
		Person p = new Person();
		p.age = 10;
		p.name ="홍길동";
		p.info();
		
		Person p2 = new Person(20, "하길동");
		p2.info();
	}

}
