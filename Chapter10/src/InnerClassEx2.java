class Temp1 {
	int iv =10;
	static int cv = 30;
	void func() {}
	
	class Temp2 {
		int iv = 100;
		void method2() {
			int iv = 20;
			System.out.println(iv); // 20
			System.out.println(this.iv); // 100
			System.out.println(Temp1.this.iv); // 10
			func();
		}
	}
	
	static class Temp3 {
		int iv = 200;
		static int cv = 300;
		void method3() {
			int iv = 10;
			System.out.println(iv); // 10
			System.out.println(this.iv); // 200
//			System.out.println(Temp1.this.iv); // error: Temp1이 생성되지 않은 상태임
			System.out.println(cv);
			System.out.println(Temp1.cv);
		}
	}
		
		void method() {
			class Temp4 {
				int iv = 400;
			}
			
			System.out.println(new Temp4().iv);
			
		
	}
	
	
}
public class InnerClassEx2 {

	public static void main(String[] args) {
		Temp1.Temp2 temp2 = new Temp1().new Temp2();
		System.out.println(temp2.iv);
		
		System.out.println(Temp1.Temp3.cv);
	}

}
