class Base {
	void method1() {
		System.out.println("Base method1");
	}
}

class Derived1 extends Base {
	@Override
	void method1() {
		System.out.println("Derived1 method1");
	}
	
	void method2() {
		System.out.println("Derived1 method2");
	}
}

class Derived2 extends Base {
	@Override
	void method1() {
		System.out.println("Derived2 method1");
	}
	
	void method3() {
		System.out.println("Derived2 method3");
	}
	
}

public class PolinoEx1 {
	
	static Base[] bases = new Base[10];
	
	static int cnt;
	
	static void add(Base base) // Base base = new Derived1()
	{
		bases[cnt++] = base;
	}
	public static void main(String[] args) {
//		Base d1 = new Derived1(); // upcasting
//		d1.method1();
//		
//		Derived1 d2 = (Derived1)d1; //downcasting : 명시적으로 해야 함
//		d2.method2();
//		
//		Base b1 = new Base();
//		Derived1 d3 = (Derived1)b1;
//		d3.method2(); //error
//		
//		Base b2 = new Derived2();
//		b2.method1();
//		b2.method3(); // 아무리 Derived2 객체 생성이어도 변수의 타입이 Base이기 때문에 Base에 없는 메소드의 호출은 불가능하다. 
	
		add(new Derived1());
		add(new Derived1());
		add(new Derived1());
		add(new Derived1());
		add(new Derived1());
		add(new Derived2());
		add(new Derived2());
		add(new Derived2());
		add(new Derived2());
		add(new Derived2());

		
		
		Base[] bases = new Base[10];
		bases[0] = new Derived1();
		bases[1] = new Derived1();
		bases[2] = new Derived1();
		bases[3] = new Derived1();
		bases[4] = new Derived1();
		
		bases[5] = new Derived2();
		bases[6] = new Derived2();
		bases[7] = new Derived2();
		bases[8] = new Derived2();
		bases[9] = new Derived2();

		for(int i = 0; i<bases.length; i++) {
			bases[i].method1();
		}
		System.out.println("================");
		
		for(int i = 0; i<bases.length; i++) {
			if(bases[i] instanceof Derived2) {
				((Derived2)bases[i]).method3();
			}
		}
		
		System.out.println("================");

		
		for(int i = 0; i<bases.length; i++) {
			if(bases[i] instanceof Derived1) {
				((Derived1)bases[i]).method2();
			}
		}
		
		System.out.println("================");



	}

}
