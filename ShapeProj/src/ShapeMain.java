
public class ShapeMain {
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2= new Point(10, 10);
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		
		Circle c1 = new Circle();
		Circle c2 = new Circle("파랑", new Point(10, 10), 5);
		Circle c3 = new Circle("노랑", 20, 35, 15);
		
		System.out.println(c1.info());
		System.out.println(c2.info());
		System.out.println(c3.info());
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle("초록", new Point(2, 3),10, 5);
		Rectangle r3 = new Rectangle("초록", 12, 35 ,17, 23);
		
		System.out.println(r1.info());
		System.out.println(r2.info());
		System.out.println(r3.info());
		
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle("연두", new Point(2,3), new Point(5, 6), new Point(23, 22));
		Triangle t3 = new Triangle("레몬", 5, 3, 7, 8, 9, 1);
		
		System.out.println(t1.info());
		System.out.println(t2.info());
		System.out.println(t3.info());
	}
}

//(0, 0)
//(10, 10)
//[원: 색- 흰색, 중심점-(0, 0), 반지름-0]
//[원: 색- 파랑, 중심점-(10, 10), 반지름-5]
//[원: 색- 노랑, 중심점-(20, 35), 반지름-15]
//[사각형: 색- 흰색, 중심점-(0, 0), 너비-0, 높이-0]
//[사각형: 색- 초록, 중심점-(2, 3), 너비-10, 높이-5]
//[사각형: 색- 초록, 중심점-(12, 35), 너비-17, 높이-23]
//[삼각형: 색- 흰색, 점1-(0, 0), 점2-(0, 0), 점3-(0, 0)]
//[삼각형: 색- 연두, 점1-(2, 3), 점2-(5, 6), 점3-(23, 22)]
//[삼각형: 색- 레몬, 점1-(5, 3), 점2-(7, 8), 점3-(9, 1)]
