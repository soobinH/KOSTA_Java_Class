import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 문장을 입력하세요: ");
		
		String str = sc.nextLine();
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("in.txt");
			fw.write(str);
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw!=null) fw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
