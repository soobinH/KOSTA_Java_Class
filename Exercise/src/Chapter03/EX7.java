package Chapter03;

// 화씨를 섭씨로 변환하는 코드이다. 
// 변환 공식 C = 5/9 * (F-32)
// 단, 변환 결과값은 소수점 셋째자리에서 반올림해야 한다.(Math.round()를 사용하지 않고 처리할 것)
public class EX7 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (fahrenheit - 32) * 5/9F;
		celcius = (int)(celcius * 100 + 0.5) / 100F;
		
		System.out.println("Fahrenheit: " + fahrenheit);
		System.out.println("Celcius: " + celcius);
	}
}
