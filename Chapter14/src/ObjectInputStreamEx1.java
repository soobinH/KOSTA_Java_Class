import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx1 {

	public static void main(String[] args) {
		try(ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("stud.ser"))) {
			Student s = (Student) ooi.readObject();
			System.out.println(s);
		}catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
