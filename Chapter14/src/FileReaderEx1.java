import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("news.txt");
			br = new BufferedReader(fr);
			char[] buff = new char[1024];
			int len = 0;
			while((len= br.read(buff))>0) {
				for(int i = 0; i<len; i++) {
					System.out.printf("%c", buff[i]);
				}
			}
			
//			int data;
//			while((data=fr.read()) != -1) {
//				System.out.print((char)data);
//			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) br.close();
			} catch(IOException e) {
				e.printStackTrace();
			}

		}
	}

}
