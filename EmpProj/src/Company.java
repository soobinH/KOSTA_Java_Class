import java.util.ArrayList;
import java.util.Iterator;

import emp.Employee;
import emp.IBusinessTrip;
import emp.PartTime;
import emp.Permanent;
import emp.Sales;

public class Company {
	//Employee[] emps = new Employee[100];
	ArrayList<Employee> emps = new ArrayList<>();
	//int cnt;
	
	public void addEmployee(Employee emp) {
		emps.add(emp);
	}
	
	public void allEmployeeInfo() {
		for(Employee emp: emps) {
			System.out.println(emp.info());
		}
	}
	
	public int getAllTotalPay() {
		int totalPay = 0;
		Iterator<Employee> it = emps.iterator();
		while(it.hasNext()) {
			totalPay += it.next().getPay();
		}
		
		return totalPay;
	}
	
	public void regBusinessTrip(IBusinessTrip emp,int day) {
		emp.goBusinessTrip(day);
	}

	public static void main(String[] args) {
		Company com = new Company();
		Permanent emp1 = new Permanent("1001", "홍길동",  3000000);
		Sales emp2 = new Sales("1002","김길동", 2000000, 1500000);
		PartTime emp3 = new PartTime("1003", "고길동", 20000, 160);
		com.addEmployee(emp1);
		com.addEmployee(emp2);
		com.addEmployee(emp3);
		
//		com.regBusinessTrip(emp1, 2);
		com.regBusinessTrip(emp2, 1);
		com.regBusinessTrip(emp3, 3);
		
		
		com.allEmployeeInfo();
		System.out.println("총급여: " + com.getAllTotalPay());
	}
}

// 출력 결과
// 사번: 1001, 이름: 홍길동, 급여: 3000000
// 사번: 1002, 이름: 김길동, 급여: 3500000
// 사번: 1003, 이름: 고길동, 급여: 3200000
// 총급여: 9700000