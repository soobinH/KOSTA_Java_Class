
class MyData<T> {
	T data;
	void setData(T data) {
		this.data = data;
	}
	
	T getData() {
		return data;
	}
}


class Data {
	Object data;
	void setData(Object data) {
		this.data = data;
	}
	
	Object getData() {
		return data;
	}
}

public class GenericEx2 {
	
	public static void main(String[] args) {
//		Data d = new Data();
//		d.setData(10);
//		Integer n = (Integer)d.getData();
//		
//		System.out.println(n);
		
		MyData<String> smd = new MyData<>();
		smd.setData("hello cutiee");
		String greet = smd.getData();
		System.out.println(greet);
		
		MyData<Person> pmd = new MyData<>();
		pmd.setData(new Person(30, "Kong"));
		Person p= pmd.getData();
		System.out.println(p);
	}

}
