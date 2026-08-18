package Chapter9;

public class EX10 {

	static String format(String str,int length, int alignment) {
		if(length<str.length()) return str.substring(length);
		char[] carr = new char[length];
		for(int i = 0; i<carr.length; i++)
		{
			carr[i] =' ';
		}
		
		int tarIdx = 0;
		
		if(alignment == 1) {
			tarIdx = (length-str.length())/2;
		}
		else if(alignment == 2) {
			tarIdx = (length-str.length());
		}
		
		System.arraycopy(str.toCharArray(), 0, carr, tarIdx, str.length());
		return new String(carr);

	}
	public static void main(String[] args) {
		String str = "가나디";
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str,7, 2));
	}

}
