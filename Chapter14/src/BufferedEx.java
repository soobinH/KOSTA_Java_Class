import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Student {
	int num;
	String name;
	String department;
	int grade;
	public Student(int num, String name, String department, int grade) {
		super();
		this.num = num;
		this.name = name;
		this.department = department;
		this.grade = grade;
	}
	
	public String toString() {
		return String.format("%d, %s, %s, %d", num, name, department, grade);
	}
}
public class BufferedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studs = new ArrayList<>();
		studs.add(new Student(101, "홍길동", "스포츠1", 1));
		studs.add(new Student(102, "김길동", "스포츠2", 2));
		studs.add(new Student(103, "박길동", "스포츠3", 3));
		studs.add(new Student(104, "최길동", "스포츠4", 4));
		studs.add(new Student(105, "이길동", "스포츠5", 2));
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("info.txt"))) {
			
			for(int i = 0; i<studs.size(); i++) {
				bw.write(studs.get(i).toString());
				bw.newLine();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
