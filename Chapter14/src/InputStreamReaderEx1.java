import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			fis = new FileInputStream("news.txt");
			isr = new InputStreamReader(fis, "UTF-8");
			br = new BufferedReader(isr);
			
			String str = null;
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null) br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}

			
		}
	}

}
