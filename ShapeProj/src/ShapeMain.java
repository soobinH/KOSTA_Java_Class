
public class ShapeMain {
	public static void main(String[] args) {
		
		ShapeSet ss = new ShapeSet();
		ss.add(new Circle());
		ss.add(new Circle("파랑", new Point(10, 10), 5));
		ss.add(new Circle("노랑", 20, 35, 15));
		ss.add(new Rectangle());
		ss.add(new Rectangle("초록", new Point(2, 3),10, 5));
		ss.add(new Rectangle("초록", 12, 35 ,17, 23));
		ss.add(new Triangle());
		ss.add(new Triangle("연두", new Point(2,3), new Point(5, 6), new Point(23, 22)));
		ss.add(new Triangle("레몬", 5, 3, 7, 8, 9, 1));
		ss.add(new Elipse());
		ss.add(new Elipse("검정", new Point(54,67), new Point(89, 99), 25));
		ss.add(new Elipse("핑크", 12, 23, 45, 67, 56));
		ss.add(new Diamond());
		ss.add(new Diamond("빨강", new Point(1, 2), new Point(5, 6), new Point(8, 9), new Point(3, 4)));
		ss.add(new Diamond("하늘", 12, 34, 32, 54, 76, 33, 19, 23));
		
		
		
		ss.circleDraw(ss.shapes);
		System.out.println("==========================================================");
		System.out.println();
		ss.allShapeDraw();
		
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
//[타원: 색- 흰색, 중심점1-(0, 0), 중심점2-(0, 0), 거리-0]
//[타원: 색- 검정, 중심점1-(54, 67), 중심점2-(89, 99), 거리-25]
//[타원: 색- 핑크, 중심점1-(12, 23), 중심점2-(45, 67), 거리-56]
//[마름모: 색- 흰색, 점1-(0, 0), 점2-(0, 0), 점3-(0, 0), 점4-(0, 0)]
//[마름모: 색- 빨강, 점1-(1, 2), 점2-(5, 6), 점3-(8, 9), 점4-(3, 4)]
//[마름모: 색- 하늘, 점1-(12, 34), 점2-(32, 54), 점3-(76, 33), 점4-(19, 23)]
