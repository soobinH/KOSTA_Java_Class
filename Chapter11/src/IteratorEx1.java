import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> par1 = new ArrayList<>();
		par1.add(new Person(20,"hong"));
		par1.add(new Person(10,"tong"));
		par1.add(new Person(30,"qong"));
		par1.add(new Person(40,"aong"));
		
		Iterator<Person> pit = par1.iterator();
		while(pit.hasNext()) {
			Person p = pit.next();
			if(p.age == 20) {
				pit.remove();
			}
		}
		
		ListIterator<Person> li = par1.listIterator();
		
		System.out.println(par1);
	}

}
