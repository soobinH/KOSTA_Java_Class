import java.util.Comparator;
import java.util.TreeSet;

class PersonCompare implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		return o1.age-o2.age;
	}
}

public class TreeSet3 {

	public static void main(String[] args) {
		TreeSet<Person> ts1 = new TreeSet<>(new PersonCompare());
		ts1.add(new Person(20, "홍길동"));
		ts1.add(new Person(45, "김길동"));
		ts1.add(new Person(23, "이길동"));
		ts1.add(new Person(67, "박길동"));
		
		System.out.println(ts1);

		
	}

}
