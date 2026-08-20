import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx1 {

	public static void main(String[] args) {
		String name = "곰순이";
		int age = 20;
		double weight = 70.2;
		float height = 180.1f;
		boolean married = false;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("info.data");
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			dos.writeUTF(name);
			dos.writeInt(age);
			dos.writeFloat(height);
			dos.writeDouble(weight);
			dos.writeBoolean(married);
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos!=null) dos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
