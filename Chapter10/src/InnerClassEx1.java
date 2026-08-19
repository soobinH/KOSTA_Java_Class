abstract class TempClass {
	int num;
	TempClass() {
		
	}
	TempClass(int num) {
		
	}
	abstract void method2();
}


class Outer{
	class InstanceInner {
		
	}
	
	static class StaticInner {
		
	}
	
	InstanceInner iv1 = new InstanceInner();
	// Instance inner class 객체를 static 변수로 가질 수는 없다.
//	static InstanceInner iv2 = new InstanceInner(); //error
	StaticInner sv1 = new StaticInner();
	
	void instanceMethod() {
		InstanceInner iic = new InstanceInner();
		StaticInner sic = new StaticInner();
	}
	
	static void staticMethod() {
//		InstanceInner iic = new InstanceInner(); // static method에서는 instance inner class를 생성할 수 없다.
		StaticInner sic = new StaticInner();
	}
	
	void myMethod() {
		class LocalInner {
			
		}
		
		LocalInner li = new LocalInner();
	}
	
	TempClass myMethod2() {
//		class ChildTemp extends TmpClass {
//			ChildTemp(int num) {
//				super(num);
//			}
//			
//			void method() {
//				System.out.println("method override");
//			}
//		}
		
		int n = 0;
		return new TempClass(n) {
			@Override
			void method2() {
				System.out.println("method override"+num);
			}
		}
	}
	
	
}


public class InnerClassEx1 {

	public static void main(String[] args) {
		// Static Inner class는 Outer class 생성 없이 단독으로 생성할 수 있다.
		Outer.StaticInner si = new Outer.StaticInner();
		
		//InstanceInner class는 Outer class를 생성한 후 그 레퍼런스를 통해 생성한다.
		Outer outer = new Outer();
		Outer.InstanceInner ii = outer.new InstanceInner();
	}

}
