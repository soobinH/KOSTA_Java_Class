class InitTest {
	int iv;
	static int cv = 10;
	
	{iv = 2;} // 초기화 블럭
	static { cv = 20; } // static 초기화 블럭
	
	InitTest() {}
	
	InitTest(int iv) {
		this.iv = iv;
//		cv = 200; // 생성자에서 클래스 변수(static 변수) 초기화는 권장하지 않음(객체들이 공유하는 변수이기 때문에)
	}
}
public class ClassInitTest {

	public static void main(String[] args) {
//		InitTest it = new InitTest();
//		System.out.println(it.iv);
		System.out.println(InitTest.cv);
	}

}
