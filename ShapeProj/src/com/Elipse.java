package com;

public class Elipse extends Shape {
	Point cen1;
	Point cen2;
	int distance;
	
	public Elipse() {
		cen1 = new Point();
		cen2 = new Point();
	}
	
	public Elipse(String color, Point cen1, Point cen2, int distance) {
		super(color);
		this.cen1 = cen1;
		this.cen2 = cen2;
		this.distance = distance;
	}
	
	public Elipse(String color, int ax, int ay, int bx, int by, int distance) {
		this(color, new Point(ax, ay), new Point(bx, by), distance);
	}
	
	public String info() {
		return String.format("[타원: 색- %s, 중심점1-%s, 중심점2-%s, 거리-%d]", color, cen1.info(), cen2.info(), distance);

	}
	
	
}
