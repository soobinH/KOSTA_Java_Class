package acc;

import exc.BankException;

public class SpecialAccount extends Account{

	public String grade;
	
	
	public SpecialAccount(String id, String name, int balance, int pwd, String grade) {
		super(id, name, balance, pwd);
		this.grade = grade;
	}
	
	@Override
	public void deposit(int money) throws BankException{ 
		double rate = 0;
		switch(grade.toUpperCase()) {
		case "VIP": rate = 0.04; break;
		case "GOLD" : rate = 0.03; break;
		case "SILVER" : rate = 0.02; break;
		case "NORMAL" : rate = 0.01; break;
		}
		super.deposit(money+(int)(money*rate));
	}
	
	public String info() {
		return String.format("계좌번호: %s, 이름: %s, 잔액: %d, 등급: %s", id, name, balance, grade);
	}
}
