package com;

public class Triangle extends Shape {
	Point p1;
	Point p2;
	Point p3;
	
	public Triangle() {
		p1 = new Point(0, 0);
		p2 = new Point(0, 0);
		p3 = new Point(0, 0);
	}
	
	public Triangle(String color, Point p1, Point p2, Point p3) {
		super(color);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public Triangle(String color, int ax, int ay, int bx, int by, int cx, int cy) {
		this(color, new Point(ax, ay), new Point(bx, by), new Point(cx, cy));
	}
	
	public String info() {
		return String.format("[삼각형: 색- %s, 점1-%s, 점2-%s, 점3-%s]", color, p1.info(), p2.info(),p3.info());
	}
}
