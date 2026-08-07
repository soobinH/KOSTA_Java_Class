
public class SpecialAccount extends Account{

	String grade;
	
	
	SpecialAccount(String id, String name, int balance, int pwd, String grade) {
		super(id, name, balance, pwd);
		this.grade = grade;
	}
	
	void deposit(int money) {
		switch(grade.toUpperCase()) {
		case "VIP": balance += money + (money*0.04); break;
		case "GOLD" : balance += money + (money*0.03); break;
		case "SILVER" : balance += money + (money*0.02); break;
		case "NORMAL" : balance += money + (money * 0.01); break;
		}
	}
	
	String info() {
		return String.format("계좌번호: %s, 이름: %s, 잔액: %d, 등급: %s", id, name, balance, grade);
	}
}
