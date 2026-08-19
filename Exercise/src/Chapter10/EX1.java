package Chapter10;


class Outer {
	class Inner {
		int iv = 100;
	}
}

public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner inner = new Outer().new Inner();
		System.out.println(inner.iv);
	}

}
