import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Member implements Serializable{
	String id;
	transient String password;
	String name;
	String address;
	
	public Member(String id, String password, String name, String address) {
		super();
		this.id= id;
		this.password= password;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Member [id = " + id + ", password = " + password + ", name = " + name + ", address = " + address + "]";
	}
}
public class ObjectStreamEx1 {

	public static void main(String[] args) {
//		Member member = new Member("hong", "1234", "홍길동", "서울시 금천구 가산동");
//		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mem.ser"))) {
//			oos.writeObject(member);
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mem.ser"))) {
			Member member = (Member)ois.readObject();
			System.out.println(member);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
