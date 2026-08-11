package Chapter7;
abstract class Shape {
	Point p;
	Shape() {
		this(new Point(0,0));
	}
	Shape(Point p) {
		this.p = p;
	}
	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;
	Point() {
		this(0,0);
	}
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "["+x+","+y+"]";
	}
}

class Circle extends Shape {
	double r;

	Circle() {}
	
	Circle(double r){
		this.r =r;
	}
	
	Circle(Point p, int r) {
		super(p);
		this.r = r;
	}
	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		return r*r*3.141592653589793     f;
	}
}

class Rectangle extends Shape {
	int width;
	int height;
	
	Rectangle() {}
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	Rectangle(Point p, int width, int height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	@Override
	double calcArea() {
		return width*height;
	}
	
	boolean IsSquare() {
		if(width == height) return true;
		else return false;
	}
}

public class EX22 {

	static double sumArea(Shape[] arr) {
		double total = 0;
		for(int i = 0; i<arr.length; i++) {
			total += arr[i].calcArea();
		}
		
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("면적의 합:"+sumArea(arr));
	}

}
