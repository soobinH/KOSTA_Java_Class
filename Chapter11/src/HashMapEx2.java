import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
	String num;
	String name;
	String department;
	int pay;
	
	Employee() {
		
	}
	
	Employee(String num, String name, String department,int pay) {
		this.num = num;
		this.name = name;
		this.department = department;
		this.pay = pay;
	}
	
	@Override
	public String toString() {
		return "Employee [num: " + num + ", name: "+name + ", department: " + department + ", pay: " + pay + "]" ;
	}
	
}

public class HashMapEx2 {
	static Scanner sc =new Scanner(System.in);
	static HashMap<String, Employee> emps = new HashMap<>();
	
	static void enterEmployee() {
		System.out.println("[사원 등록]");
		System.out.print("사번: ");
		String num = sc.nextLine();
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("부서명: ");
		String deptName = sc.nextLine();
		System.out.print("급여: ");
		int pay = Integer.parseInt(sc.nextLine());
		
		
		if(emps.containsKey(num)) {
			System.out.println("사원 번호가 중복됩니다.");
			return;
		}
		
		emps.put(num,new Employee(num, name, deptName, pay));
	
	}
	
	static void findEmployee() {
		System.out.println("[직원 검색]");
		System.out.print("사번: ");
		String num = sc.nextLine();
		
		if(!emps.containsKey(num)) {
			System.out.println("사번이 틀립니다.");
			return;
		}
		
		Employee emp = emps.get(num);
		System.out.println(emp);
	}
	
	static void allEmployee() {
		System.out.println("[전직원 조회]");
		for(Employee emp:emps.values()) {
			System.out.println(emp);
		}
	}
	
	static void leavCompany() {
		System.out.println("[퇴사]");
		System.out.println("사번: ");
		String num = sc.nextLine();
		
		if(!emps.containsKey(num)) {
			System.out.println("사번이 틀립니다.");
			return;
		}
		
		System.out.println(emps.get(num).name + "님을 퇴사 처리합니다.");
		emps.remove(num);
		
	}
	
	static int menu() {
		System.out.println("[코스타 주식회사]");
		System.out.println("1. 입사");
		System.out.println("2. 직원 검색");
		System.out.println("3. 전직원 조회");
		System.out.println("4. 퇴사");
		System.out.println("0. 종료");
		System.out.print("선택>>");
		int sel = Integer.parseInt(sc.nextLine());
		return sel;
	}
	
	public static void main(String[] args) {
		while(true) {
			switch(menu()) {
			case 1: enterEmployee(); break;
			case 2: findEmployee(); break;
			case 3: allEmployee(); break;
			case 4: leavCompany(); break;
			case 0: System.exit(0);
			}
		}

	}

}
