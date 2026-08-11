class MyClass {
	MyClass() {}
}
public class SingleTonEx {

	public static void main(String[] args) {

//		MyClass mc = new MyClass();
		SingleArray sa1 = SingleArray.getSingleArrayRef();
	}

}
