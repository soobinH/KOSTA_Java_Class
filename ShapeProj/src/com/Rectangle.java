package com;

public class Rectangle extends Shape{
	Point startPos;
	int width;
	int height;
	
	public Rectangle() {
		startPos = new Point(0, 0);
	}
	
	public Rectangle(String color, Point p, int width, int height) {
		super(color);
		this.startPos = p;
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(String color, int x, int y, int width, int height) {
		this(color, new Point(x, y), width, height);
	}
	
	public String info() {
		return String.format("[사각형: 색- %s, 중심점-%s, 너비-%d, 높이-%d]", color, startPos.info(), width, height);
	}
}
