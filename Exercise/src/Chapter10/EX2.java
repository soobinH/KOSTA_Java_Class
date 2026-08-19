package Chapter10;


class Outer2 {
	static class Inner {
		int iv = 200;
	}
}


public class EX2 {

	public static void main(String[] args) {
		System.out.println(new Outer2.Inner().iv);

	}

}
