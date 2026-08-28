package acc;

import java.io.Serializable;

import exc.BankException;
import exc.ERR_CODE;

public class Account implements Serializable{
	String id;
	String name;
	int balance;
	private int pwd;
	
	public Account(String id, String name, int balance, int pwd) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.pwd = pwd;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPwd() {
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	public String info() {
		return String.format("계좌번호: %s, 이름: %s, 잔액: %d", id, name, balance);
	}
	
	public void transfer(int money) {
		balance += money;
	}
	
	public void deposit(int money) throws BankException{
		if(money <= 0) throw new BankException("입금 오류", ERR_CODE.DEPOSIT);
		balance += money;
	}
	
	public void withdraw(int money) throws BankException{
		if(balance <= 0) throw new BankException("출금 오류", ERR_CODE.WITHDRAW);
		if(balance >= money)
			balance -= money; 
	}
	
	public boolean checkPwd(int check) {
		if(pwd == check)
			return true;
		
		else
			return false;
	}
}
