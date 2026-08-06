package Chapter6;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){}
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		return String.format("%s, %d, %d, %d, %d, %d", name, ban, no, kor, eng, math);
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return Math.round(getTotal()/3f * 10)/10f;
	}

}
