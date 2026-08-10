
public class SingleArray {
	private int[] arr = new int[10];
	private int cnt;
	
	private SingleArray() {}
	
	private static SingleArray singleArray;
	
	public static SingleArray getSingleArrayRef() {
		if(singleArray == null) {
			singleArray = new SingleArray();
		}
		return singleArray;
	}
}
