
public class Rectangle extends Shape{
	Point startPos;
	int width;
	int height;
	
	Rectangle() {
		startPos = new Point(0, 0);
	}
	
	Rectangle(String color, Point p, int width, int height) {
		super(color);
		this.startPos = p;
		this.width = width;
		this.height = height;
	}
	
	Rectangle(String color, int x, int y, int width, int height) {
		this(color, new Point(x, y), width, height);
	}
	
	String info() {
		return String.format("[사각형: 색- %s, 중심점-%s, 너비-%d, 높이-%d]", color, startPos.info(), width, height);
	}
}
