
public class CastEx {

	public static void main(String[] args) {
		char ch = 'A';
		int n = 97;
		float f = 1.6f;
		int m = 10;
		
		char nch = (char)n; // char의 byte가 더 작기 때문에 강제 형변환 해야 함
		System.out.println("int to char: " + nch);
		
		int chn = ch; // 자동 형변환
		System.out.println("char to int: " + chn);
		
		int fn = (int)f; // 데이터 손실이 있기 때문에 강제 형변환 해야 함
		System.out.println("float to int: " + fn);
		
		float mf = m; // 자동 형변환
		System.out.println("int to float: " + mf);
		
		byte b = 10;
		int bn = b;
		
		byte b2 = (byte)bn; // byte가 더 작기 때문에 강제 형변환
		System.out.println("int to byte: " + b2);
		
		double d1 = 10.4;
		float d2 = (float)d1; // float의 byte가 더 작기 때문에 강제 형변환
		System.out.println("double to float: " + d2);
	}

}
