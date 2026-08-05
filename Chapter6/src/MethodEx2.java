class Data {
	int num;
	
}


public class MethodEx2 {
	
	static void print2(Data data) { // reference variable
		data.num++;
		System.out.println(data.num);
	}
	
	static void print(int data) {
		data++;
		System.out.println(data);
	}
	
	public static void main(String[] args) {
		Data d = new Data();
		d.num = 10;
		
		print(d.num);
		System.out.println(d.num);
		
		System.out.println("=========");

		print2(d);
		System.out.println(d.num);
		
	}

}
