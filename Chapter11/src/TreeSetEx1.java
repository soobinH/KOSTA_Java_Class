import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts1 = new TreeSet<>();
		ts1.add(7);
		ts1.add(1);
		ts1.add(9);
		ts1.add(5);
		ts1.add(4);
		ts1.add(2);
		
		System.out.println(ts1);
		
		TreeSet<String> ts2= new TreeSet<>();
		ts2.add("tong");
		ts2.add("song");
		ts2.add("dong");
		ts2.add("fong");
		ts2.add("gong");
		
		System.out.println(ts2);
	}

}
