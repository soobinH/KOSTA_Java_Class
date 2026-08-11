
public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
//			String str = null;
			String str = "str";
			System.out.println(str.toString());
			int[] arr = new int[2];
			arr[2] = 100;
			int n = Integer.parseInt("11o");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
//			catch(NullPointerException e) {
//			System.out.println(e.getMessage());
//		} catch(NumberFormatException e) {
//			System.out.println(e.getMessage());
//		}
		
		System.out.println("프로그램종료");
	}

}
