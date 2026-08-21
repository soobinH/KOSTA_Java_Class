import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx {

	public static void main(String[] args) {
		Student s = new Student(101, "hong", "sports1", 3);
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stud.ser"))) {
			oos.writeObject(s);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
