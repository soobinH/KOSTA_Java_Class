package com;

public class Point {
	int x;
	int y;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String info() {
		return String.format("(%d, %d)", x, y);
	}
}
