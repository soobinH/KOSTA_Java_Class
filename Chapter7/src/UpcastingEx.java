
public class UpcastingEx {

	public static void main(String[] args) {
//		Parent p1 = new Parent();
//		p1.pnum = 10;
//		p1.method1();
//		
//		Child c1 = new Child();
//		c1.pnum = 20;
//		c1.cnum = 30;
//		c1.method1();
//		c1.method1(0);
//		c1.method2();
		
		Parent p2 = new Child(); // upcasting : 상속 관계에서만 자식 객체를 부모 타입의 변수에 담을 수 있다.
		p2.pnum = 200;
		p2.method1(); // child method1 : override를 하고 있기 때문에 child 것이 실행된다(부모에도 있고 자식에도 있기 때문에)
		
	}

}

// 다형성
// 선행 조건 : 반드시 상속을 받아야 함 & 오버라이딩 & upcasting 
// 자식 객체를 담은 부모 변수가 오버라이딩 한 메소드 호출 시 부모의 메소드가 아닌 자식의 메소드를 호출한다.