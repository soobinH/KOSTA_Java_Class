

import com.Circle;
import com.Shape;

public class ShapeSet {
	Shape[] shapes = new Shape[100];
	int cnt;
	
	public void add(Shape shape) {
		shapes[cnt++] = shape;
	}
	
	
	public void allShapeDraw() {
		for(int i = 0; i<cnt; i++) {
			System.out.println(shapes[i].info());
		}
	}
	
	public void circleDraw(Shape[] shapes) {
		for(int i = 0; i<shapes.length; i++) {
			if(shapes[i] instanceof Circle) {
				System.out.println(((Circle)shapes[i]).info());
			}
		}
	}
	

	
	

}
