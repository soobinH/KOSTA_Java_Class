import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		try {
			fis= new FileInputStream("info.data");
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			String name = dis.readUTF();
			int age = dis.readInt();
			float height = dis.readFloat();
			double weight = dis.readDouble();
			boolean married = dis.readBoolean();
			
			System.out.printf("이름: %s, 나이: %d, 몸무게: %.1f, 키: %.1f, 결혼여부: %b\n", name, age, weight, height, married);
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(weight);
			System.out.println(height);
			System.out.println(married);
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis != null) dis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
