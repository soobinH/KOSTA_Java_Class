import java.util.HashSet;

class Complex {
	int real;
	int imaginary;
	
	Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	@Override
	public String toString() {
		return real + " + " + imaginary + " i ";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals(object obj");
		if(!(obj instanceof Complex)) return false;
		Complex c = (Complex)obj;
		return real == c.real && imaginary == c.imaginary;
	}
	
	@Override
	public int hashCode() {
		return real * real + imaginary;
	}
}

public class HashSetEx1 {

	public static void main(String[] args) {
		Complex com1 = new Complex(3, 5);
		Complex com2 = new Complex(3, 5);
		
		HashSet<Complex> hs3 =  new HashSet<>();
		hs3.add(com1);
		hs3.add(com2);
		System.out.println(hs3);
		
		HashSet<Integer> hs1 = new HashSet<>();
		hs1.add(10);
		hs1.add(20);
		hs1.add(10);
		hs1.add(20);
		hs1.add(35);
		hs1.add(55);
		System.out.println(hs1);
		
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("hong");
		hs2.add("song");
		hs2.add("hong");
		hs2.add("gong");
		System.out.println(hs2);
		
		HashSet<Person> hs4 = new HashSet<>();
		
		hs4.add(new Person(25,"hong"));
		hs4.add(new Person(20,"hong"));

		hs4.add(new Person(20 , "hong"));

		hs4.add(new Person(25, "song"));
		System.out.println(hs4);


	}

}
