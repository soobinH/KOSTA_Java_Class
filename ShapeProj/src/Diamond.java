
public class Diamond extends Shape{
	Point p1;
	Point p2;
	Point p3;
	Point p4;
	
	public Diamond() {
		this("흰색", 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	public Diamond(String color, Point p1, Point p2, Point p3, Point p4) {
		super(color);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	
	public Diamond(String color, int ax, int ay, int bx, int by, int cx, int cy, int dx, int dy) {
		this(color, new Point(ax, ay), new Point(bx, by), new Point(cx, cy), new Point(dx, dy));
	}
	
	public String info() {
		return String.format("[마름모: 색- %s, 점1-%s, 점2-%s, 점3-%s, 점4-%s]", color, p1.info(), p2.info(),p3.info(), p4.info());
	}
}
