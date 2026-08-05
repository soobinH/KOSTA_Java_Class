class Calculator2 {
	static double add(double x, double y) {
		return x+y;
	}
	
	static double sub(double x, double y) {
		return x-y;
	}
	
	static double div(double x, double y) {
		return y==0?0:x/y;
	}
	
	static double mul(double x, double y) {
		return x*y;
	}
}
public class ClassEx4 {

	public static void main(String[] args) {
		System.out.println(Calculator2.add(1.3, 2));
		System.out.println(Calculator2.sub(1.6, 2));
		System.out.println(Calculator2.div(1, 2));
		System.out.println(Calculator2.mul(1, 2));
	}

}
