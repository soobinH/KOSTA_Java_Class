import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("news.txt");
			int data;
			while((data=fis.read())!=-1) {
				System.out.print((char)data);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) fis.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
