import java.util.Comparator;
import java.util.TreeSet;

class Student implements Comparable<Student>{
	int score;
	int age;
	String name;
	
	Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return name+","+ age + ","+ score;
	}
	
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}

	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false;
		Student stud = (Student)obj;
		return age==stud.age && score==stud.score && name.equals(stud.name);
	}
	
	@Override
	public int hashCode() {
		return age+score*score+name.hashCode();
	}
	
	
}


public class TreeSetEx2 {

	public static void main(String[] args) {

		TreeSet<Student> ts1 = new TreeSet<>();
		ts1.add(new Student("hong", 20, 98));
		ts1.add(new Student("song", 25, 95));
		ts1.add(new Student("bong", 22, 90));
		ts1.add(new Student("hong", 20, 85));
		
		System.out.println(ts1);

		TreeSet<Student> ts2 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.score == o2.score) {
                    return o1.age - o2.age; // 성적이 같으면 나이순 ascending (오름차순)
                } else {
                    return o2.score - o1.score; // 성적순 descending (내림차순)
                }
            }
        });
		
		ts2.addAll(ts1);
		System.out.println(ts2);
		//Comparerator을 통한 TreeSet 객체를 생성하여 성적순 descending 하고 성적이 같으면 나이순ascending 하시오
	}

}
