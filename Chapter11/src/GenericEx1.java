import java.util.ArrayList;

public class GenericEx1 {

	public static void main(String[] args) {
		ArrayList<Person> par1 = new ArrayList<>();
		
		par1.add(new Person(20,"hong"));
		par1.add(new Person(10,"tong"));
		par1.add(new Person(30,"qong"));
		par1.add(new Person(40,"aong"));
		
		Person p = par1.get(0);
		System.out.println(p);
	}

}
