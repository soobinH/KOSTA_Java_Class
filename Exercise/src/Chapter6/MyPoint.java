package Chapter6;

public class MyPoint {

	int x;
	int y;
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		return Math.sqrt(Math.pow(x-x1, 2)+Math.pow(y-y1, 2));
	}

}
