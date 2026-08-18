import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Person> ll = new LinkedList<>();
		ll.add(new Person(20,"hong"));
		ll.add(new Person(10,"tong"));
		ll.add(new Person(30,"qong"));
		ll.add(new Person(40,"aong"));
		ll.add(new Person(100,"torng"));
		ll.add(new Person(300,"qyong"));
		ll.add(new Person(400,"uaong"));
		
		System.out.println(ll);
		
		ll.removeFirst();
		System.out.println(ll);
		Person p = ll.peek();
		System.out.println(p);
		System.out.println(ll);
	}

}
