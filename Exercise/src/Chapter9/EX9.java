package Chapter9;

public class EX9 {
    public static String delChar(String src, String delCh) {
        StringBuffer str = new StringBuffer(src);
        for(int i = 0; i<src.length(); i++) {
            if(src.indexOf(delCh.charAt(i)) == -1)
                return src;
            str.deleteCharAt(src.indexOf(delCh.charAt(i)));
        }

        //src = (String)str;
    }
    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)"+" -> "
        + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)"+" -> "
        + delChar("(1 2 3 4\t5)"," \t"));
    }
}
