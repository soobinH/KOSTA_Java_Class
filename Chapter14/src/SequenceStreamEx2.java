import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceStreamEx2 {

	public static void main(String[] args) {
		SequenceInputStream sis = null;
		FileOutputStream fos = null;
		Vector<FileInputStream> vector = new Vector<>();
		
		try {
			vector.add(new FileInputStream("news.txt"));
			vector.add(new FileInputStream("news2.txt"));
			vector.add(new FileInputStream("news3.txt"));
			
			sis = new SequenceInputStream(vector.elements());
			fos = new FileOutputStream("totnews3.txt");
			
			byte[] buff = new byte[1024];
			int len = 0;
			while((len = sis.read(buff))>0) {
				fos.write(buff, 0, len);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sis!=null) sis.close();
				if(fos!=null) fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
