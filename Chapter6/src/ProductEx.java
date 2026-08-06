class TV{
	static String model = "NOSE10AT";
	static int count;
	String serialNo;
	{
		count++;
		serialNo = String.format("%s%08d", model, count);
	}

}
public class ProductEx {
	public static void main(String[] args) {
		TV[] tvs = new TV[10];
		for(int i = 0; i<10; i++) {
			tvs[i] = new TV();
			System.out.println(tvs[i].serialNo);

		}
	}
}

//NOSE10AT00000001
//NOSE10AT00000002
//NOSE10AT00000003
