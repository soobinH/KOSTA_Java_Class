package Chapter9;

public class EX3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";
        
        path = fullPath.substring(0, fullPath.lastIndexOf("\\"));
        fileName = fullPath.substring(fullPath.lastIndexOf("\\")+1, fullPath.length());

        System.out.println("fullPath:"+fullPath);
        System.out.println("path:"+path);
        System.out.println("fileName:"+fileName);
    }
    
}
