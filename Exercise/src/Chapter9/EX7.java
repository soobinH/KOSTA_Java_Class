package Chapter9;

public class EX7 {
    public static boolean contains(String src, String target) {
        if(src.lastIndexOf(target) != -1)
            return true;

        return false;
    }
    public static void main(String[] args) {
        System.out.println(contains("12345","23"));
        System.out.println(contains("12345","67"));
    }
}
