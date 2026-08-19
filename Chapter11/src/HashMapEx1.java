import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm1 = new HashMap<>();
		hm1.put(100, "hong");
		hm1.put(200, "qong");
		hm1.put(300, "wong");
		hm1.put(400, "eong");
		
		String name = hm1.get(100);
		System.out.println(name);
		
		for(Integer key: hm1.keySet()) {
			System.out.println(key+","+hm1.get(key));
		}
		
		System.out.println(hm1.containsKey(200));
		System.out.println(hm1.containsValue("hong"));
		
		for(Entry<Integer, String> entry: hm1.entrySet()) {
			System.out.println(entry.getKey()+", "+entry.getValue());
		}
	}

}
