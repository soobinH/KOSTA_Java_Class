class Test {
	void method1() {
		System.out.println("Call Method1");
		method2();
		System.out.println("Exit Method1");
	}
	
	void method2() {
		System.out.println("Call Method2");
		method3();
		System.out.println("Exit Method2");

	}
	
	void method3() {
		System.out.println("Call Method3");
		System.out.println("Exit Method3");
	}
}
public class MethodEx1 {

	public static void main(String[] args) {
		Test t = new Test();
		t.method1();
		
		System.out.println("Exit main");
	}
	
	

}
