import java.util.Scanner;

public class Bank {
	
	Scanner sc = new Scanner(System.in);
	Account[] accs = new Account[100];
	int cnt;
	
	int menu() {
		System.out.println("[곰순이 은행]");
		System.out.println("1. 계좌 개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌 송금");
		System.out.println("5. 계좌 조회");
		System.out.println("6. 전체 계좌 조회");
		System.out.println("0. 종료");
		System.out.print("선택 >> ");
		
		return Integer.parseInt(sc.nextLine());
	}
	
	void error() {
		return;
	}
	
	void makeAccount() {
		System.out.println();
		System.out.println("===================");

		System.out.println("[계좌 개설]");
		System.out.print("계좌 번호: ");
		String id = sc.nextLine();
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("입금액: ");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("비밀번호: ");
		int pwd = Integer.parseInt(sc.nextLine());
		
		Account acc = new Account();
		acc.id = id;
		acc.name = name;
		acc.balance = money;
		acc.setPwd(pwd);
		
		accs[cnt++] = acc;
		System.out.println("===================");
		System.out.println();
	}
	
	Account searchAccById(String id) {
		Account acc = null;
		for(int i = 0; i<cnt; i++) {
			if(accs[i].id.equals(id)) {
				acc =  accs[i];
			}
		}
		return acc;
	}
	
	void deposit() {
		System.out.println();
		System.out.println("===================");

		System.out.println("[입금]");
		System.out.println();
		
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		
		Account acc = searchAccById(id);
		if(acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		
		System.out.print("비밀번호를 입력하세요: ");
		int pwd = Integer.parseInt(sc.nextLine());
		
		if(!acc.checkPwd(pwd))
		{
			System.out.println("비밀번호가 틀립니다.");
			return;
		}
		
		System.out.print("입금액: ");
		int money =Integer.parseInt(sc.nextLine());
		

		
		System.out.println();
		System.out.println(String.format("%s 님에게 %d원을 송금합니다.", acc.name, money));
		acc.deposit(money);
		System.out.println("===================");
		System.out.println();
	}
	
	
	
	void withdraw() {
		System.out.println();
		System.out.println("===================");
		
		System.out.println("[출금]");
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		
		if(acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		
		System.out.print("비밀번호를 입력하세요: ");
		int pwd = Integer.parseInt(sc.nextLine());
		
		if(!acc.checkPwd(pwd))
		{
			System.out.println("비밀번호가 틀립니다.");
			return;
		}
		System.out.print("출금액: ");
		int money =Integer.parseInt(sc.nextLine());
		
		
		
		System.out.println();
		System.out.println(String.format("%d원을 출금합니다.", money));
		acc.withdraw(money);
		System.out.println(String.format("잔액: %d원", acc.balance));
		
		System.out.println("===================");
		System.out.println();
	}
	
	void transfer() {
		System.out.println();
		System.out.println("===================");
		
		System.out.println("[계좌 송금]");
		
		// 본인 계좌
		System.out.print("본인 계좌 번호: ");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		
		if(acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		
		System.out.print("비밀번호를 입력하세요: ");
		int pwd = Integer.parseInt(sc.nextLine());
		
		if(!acc.checkPwd(pwd))
		{
			System.out.println("비밀번호가 틀립니다.");
			return;
		}
		
		// 상대 계좌
		System.out.print("송금받을 계좌 번호: ");
		id = sc.nextLine();
		Account toAcc = searchAccById(id);
		
		if(toAcc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		
		// 송금할 금액
		System.out.print("송금액: ");
		int money =Integer.parseInt(sc.nextLine());
		
		
		
		System.out.println();
		System.out.println(String.format("%s 님에게 %d원을 송금합니다.", toAcc.name, money));
		acc.withdraw(money);
		toAcc.deposit(money);
		System.out.println(String.format("잔액: %d원", acc.balance));
		
		System.out.println("===================");
		System.out.println();
	}
	
	void accountInfo() {
		System.out.println();
		System.out.println("===================");
		System.out.println("[계좌 조회]");
		
		System.out.print("계좌 번호: ");
		String id = sc.nextLine();
		Account acc = null;
		acc = searchAccById(id);
		
		if(acc == null) {
			System.out.println("계좌 번호가 틀립니다.");
			return;
		}
		
		System.out.print("비밀번호를 입력하세요: ");
		int pwd = Integer.parseInt(sc.nextLine());
		
		if(!acc.checkPwd(pwd))
		{
			System.out.println("비밀번호가 틀립니다.");
			return;
		}
		
		System.out.println("찾으신 계좌: " + acc.info());
		System.out.println("===================");
		System.out.println();
		
	}
	
	void allAccountInfo() {
		System.out.println();
		System.out.println("===================");
		System.out.println("[전체 계좌 조회]");
		for(int i= 0; i<cnt; i++) {
			System.out.println(cnt + "번: " + accs[i].info());
				
		}
		System.out.println("===================");

		System.out.println();
	}
	
	void goodBye() {
		System.out.println("     ___   ___");
        System.out.println("    ( o ) ( o )");
        System.out.println("    /   \\_/   \\");
        System.out.println("   /           \\");
        System.out.println("  |    o   o    |");
        System.out.println("  |      v      |");
        System.out.println("   \\   \\___/   /");
        System.out.println("    \\_________/");
        System.out.println("\n  곰순이 은행을 이용해 주셔서 감사합니다.  ");
	}
	

	public static void main(String[] args) {
		Bank bank = new Bank();
		Loop1 : while(true) {
			int sel = bank.menu();
			switch(sel) {
			case 1: bank.makeAccount(); break;
			case 2: bank.deposit(); break;
			case 3: bank.withdraw(); break;
			case 4: bank.transfer(); break;
			case 5: bank.accountInfo(); break;
			case 6: bank.allAccountInfo(); break;
			case 0: bank.goodBye(); break Loop1;
			
			}
		}
	}
}



