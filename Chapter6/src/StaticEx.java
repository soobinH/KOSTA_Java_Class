class Test2 {
	int iv;
	static int sv;
	
	void method1() {
		iv =10; // 인스턴스 메소드에서 인스턴스 변수 사용 가능
		sv++; // 인스턴스 메소드에서 클래스 변수 사용 가능
		method2(); // 인스턴스 메소드에서 인스턴스 메소드 호출 가능
		method3(); // 인스턴스 메소드에서 클래스 메소드 호출 가능
	}
	
	void method2() {
		
	}
	
	static void method3() {
		// System.out.println(iv); // 클래스 메소드에서 인스턴스 변수 사용 불가
		sv++; // 클래스 메소드에서 클래스 변수 사용 가능
		// method2(); // 클래스 메소드에서 인스턴스 메소드 호출 불가
		method4(); // 클래스 메소드에서 클래스 메소드 호출 가능
	}
	
	static void method4() {
		
	}
}
public class StaticEx {
	public static void main(String[] args) {
		
		// 인스턴스 생성 전, 클래스 명으로는 static 변수 및 메소드만 사용 가능(인스턴스 변수 및 메소드 사용 불가)
		Test2.sv = 10;
		Test2.method3();
		Test2.method4();
		
		// 인스턴스 생성한 후 인스턴스.static, 인스턴스.instance 변수 및 메소드 모두 사용 가능
		Test2 t2 = new Test2();
		t2.iv=100;
		t2.sv++;
		t2.method1();
		t2.method2();
		t2.method3();
		t2.method4();
	}
}
