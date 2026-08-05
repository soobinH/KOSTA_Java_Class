class Variables {
	int iv;
	static int cv; // 객체들이 하나의 변수를 공유해야 할 때 쓰라고 만들어 놓은 것
	
	String info() {
		return String.format("iv: %d, cv: %d", iv, cv);
	}
	
	void print_info() {
		System.out.println(info());
	}
}
public class ClassEx2 {

	public static void main(String[] args) {
		Variables v1;
		Variables.cv = 200; // static 변수는 클래스가 로드될 때 생성되기 때문에 객체 생성하지 않고 사용한다.
		System.out.println(Variables.cv);
		
		v1 = new Variables();
		v1.iv = 10;
		
		v1.print_info();
		
		v1.cv = 199;
		v1.print_info();
		
		Variables v2 = new Variables();
		v2.print_info();
	}

}
