
public class EqulOpEx {
	public static void main(String[] args) {

		int i = 1;
		i += 3; // i = i+3
		System.out.println(i);
		
		int n = 10;
		n *= 3+5; // 80 -> *=는 대입연산자라 연산 우선순위가 가장 낮음
		System.out.println(n);
	}

}
