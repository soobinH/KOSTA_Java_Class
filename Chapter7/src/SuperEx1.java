class Parent1 {
	int x = 10;
}

class Child1 extends Parent1 {
	int x = 100;
	void method() {
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(this.x);
	}
}

public class SuperEx1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c = new Child1();
		c.method();

	}

}
