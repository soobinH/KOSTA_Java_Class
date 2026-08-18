import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList ar1 = new ArrayList();
		ar1.add(3);
		ar1.add(4);
		ar1.add(7);
		ar1.add(3);
		ar1.add(2);
		
		System.out.println(ar1);
		
		ArrayList ar2 = new ArrayList(ar1);
		ar1.add(1, 8);
		System.out.println(ar1);
		System.out.println(ar2);
		
		ar1.set(1, 9);
		System.out.println(ar1);
		
		ArrayList ar3 = new ArrayList(ar1.subList(1, 4));
		System.out.println(ar3);
		
		System.out.println(ar1.containsAll(ar3));
		Collections.sort(ar1);
		System.out.println(ar1);
		
		for(int i=0; i<ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
		ar1.remove(2);
		System.out.println(ar1);
		System.out.println(ar3);
		ar1.retainAll(ar3);
		System.out.println(ar1);
		System.out.println(ar1.indexOf(2));
		ar3.clear();
		System.out.println(ar3);
	}

}
