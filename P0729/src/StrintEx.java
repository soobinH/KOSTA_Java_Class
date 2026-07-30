
public class StrintEx {

	public static void main(String[] args) {
		String str1 = null;
		String str2 = "";
		
//		char ch1 = ''; // error
		char ch2 = ' ';
		
//		String str3 = "7" + "7";
		String str3 = 7+7+7+"7"+7; // 숫자들은 따로 string으로 형변환 돼서 모두 String으로 들어감(앞에서 숫자 연산되는 거면 연산 결과가 String)
		System.out.println(str3);
		
		System.out.println((int)'7');
		System.out.println((int)ch2);
		
		
		
	}

}
