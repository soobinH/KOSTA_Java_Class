class A {}
class B extends A{}
class C extends B{}


public class InstanceofEx1 {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c instanceof C);
		System.out.println(c instanceof B);
		System.out.println(c instanceof A);
		System.out.println(c instanceof Object);
		
		A[] arr = new A[3];
		arr[0] = new A();
		arr[1] = new B();
		arr[2] = new C();
		
		for(int i= 0; i<arr.length; i++) {
			if(!(arr[i] instanceof B) && !(arr[i] instanceof C)) {
				System.out.println(true);
			}
		}
	}

}
