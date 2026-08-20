import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamEx1 {

	public static void main(String[] args) {
		File file = new File("test.txt");
		PrintStream ps = null;
		
		try {
//			ps = new PrintStream(file);
			ps = new PrintStream(new FileOutputStream("test.txt"));
			ps.printf("이름: %s, 나이: %d, 전공: %s", "목요일", 30, "스포츠");
			ps.println();
			ps.printf("이름: %s, 나이: %d, 전공: %s", "금요일", 30, "디자인");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(ps!=null) ps.close();
		}

	}

}
