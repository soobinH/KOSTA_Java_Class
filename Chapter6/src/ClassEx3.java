class Calculator {
	double x;
	double y;
	
	double add() {
		return x+y;
	}
	
	double sub() {
		return x-y;
	}
	
	double div() {
		return y==0? 0:x/y;
	}
	
	double mul() {
		return x*y;
	}
}


public class ClassEx3 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.x = 20;
		cal.y = 3;
		
		System.out.println(cal.add());
		System.out.println(cal.sub());
		System.out.println(cal.div());
		System.out.println(cal.mul());
	}

}
