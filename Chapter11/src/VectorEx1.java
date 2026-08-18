import java.util.Enumeration;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		Vector<Person> v = new Vector<>();
		v.add(new Person(20,"hong"));
		v.add(new Person(10,"tong"));
		v.add(new Person(30,"qong"));
		v.add(new Person(40,"aong"));
		
		Enumeration<Person> e = v.elements();
		while(e.hasMoreElements()) {
			Person p = e.nextElement();
			System.out.println(p);
		}
	}

}
