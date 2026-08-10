package com;

public class Circle extends Shape {
	Point center;
	int radius;
	
	public Circle() {
		center = new Point(0, 0);
	}
	
	public Circle(int x, int y) {
		super();
		this.center = new Point(x, y);
	}
	
	public Circle(String color, Point center, int radius) {
		super(color);
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(String color, int x, int y, int radius) {
		this(color, new Point(x, y), radius);
	}
	
	public String info() {
		return String.format("[원: 색- %s, 중심점-%s, 반지름-%d]", color, center.info(), radius);
	}
}
