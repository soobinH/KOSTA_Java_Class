
public class Account {
	String id;
	String name;
	int balance;
	private int pwd;
	
	Account(String id, String name, int balance, int pwd) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.pwd = pwd;
	}
	
	String info() {
		return String.format("계좌번호: %s, 이름: %s, 잔액: %d", id, name, balance);
	}
	
	void deposit(int money) {
		balance += money;
	}
	
	void withdraw(int money) {
		if(balance >= money)
			balance -= money; 
	}
	
	boolean checkPwd(int check) {
		if(pwd == check)
			return true;
		
		else
			return false;
	}
}
