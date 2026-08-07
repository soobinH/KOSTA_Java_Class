class Parent {
	int pnum;
	
	Parent(int pnum) {
		this.pnum = pnum;
	}
	
	void method1() {
		System.out.println("method1");
	}
}

class Child extends Parent {
	int cnum;
	
	Child(int pnum, int cnum) {
		super(pnum);
		this.cnum = cnum;
	}
	
	void method1() { // 부모의 메소드를 재정의
		System.out.println("child method1");
	}
	
	void method1(int n) {
		System.out.println("method1(int n)");
	}
	
	void method2() {
		System.out.println("method2");
	}
}

public class InheritEx2 {

	public static void main(String[] args) {
		Child c1 = new Child(10, 20);
		c1.method1();
		c1.method2();
		c1.method1();
		c1.method1(0);
	}

}
