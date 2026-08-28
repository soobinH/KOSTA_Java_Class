import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;
import dao.AccountDao;
import exc.BankException;
import exc.ERR_CODE;


public class Bank{
	
	Scanner sc = new Scanner(System.in);
	
	AccountDao dao = new AccountDao();
	
	
	
	int menu() throws BankException{
		System.out.println("[곰순이 은행]");
		System.out.println("1. 계좌 개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌 송금");
		System.out.println("5. 계좌 조회");
		System.out.println("6. 전체 계좌 조회");
		System.out.println("0. 종료");
		System.out.print("선택 >> ");
		
		int sel= Integer.parseInt(sc.nextLine());
		if(!(sel>=0 && sel<=6)) throw new BankException("메뉴오류", ERR_CODE.MENU);
		
		return sel;
	}
	
	boolean checkAccount(Account acc) {
		if(accs.containsKey(acc.getId())) {
			System.out.println("계좌 번호가 틀립니다.");
			return false;
		}
		
		return true;
	}
	
	
	int selMakeAccount() throws BankException{
		System.out.println("[계좌 개설]");
		System.out.println("1. 일반 계좌");
		System.out.println("2. 특수 계좌");
		System.out.print("선택 >>");
		int sel = Integer.parseInt(sc.nextLine());
		switch(sel) {
		case 1: makeAccount(); break;
		case 2: makeSpecialAccount(); break;
		default: throw new BankException("메뉴오류", ERR_CODE.MENU);
		}
		
		

		
		return sel;
	}
	
	void makeAccount() throws BankException{
		System.out.println();
		System.out.println("===================");

		System.out.println("[일반 계좌 개설]");
		System.out.print("계좌 번호: ");
		String id = sc.nextLine();
		
		// 1.id를 계좌 조회: selectAccount
		Account acc = dao.selectAccount(id);
		if(acc!=null) {
			throw new BankException("계좌오류", ERR_CODE.DOUBLEID);
		}
		
		if(searchAccById(id)!=null)
			throw new BankException("계좌오류", ERR_CODE.DOUBLEID);
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("입금액: ");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("비밀번호: ");
		int pwd = Integer.parseInt(sc.nextLine());
		
		dao.insertAccount(new Account(id, name, money, pwd));
		//accs[cnt++] = new Account(id, name, money, pwd);
		System.out.println("===================");
		System.out.println();
	}
	
	void makeSpecialAccount() throws BankException{
		System.out.println();
		System.out.println("===================");

		System.out.println("[특수 계좌 개설]");
		System.out.print("계좌 번호: ");
		String id = sc.nextLine();
		if(searchAccById(id)!=null)
			throw new BankException("계좌오류", ERR_CODE.DOUBLEID);
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("입금액: ");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("등급(VIP, Gold, Silver, Normal): ");
		String grade = sc.nextLine();
		System.out.print("비밀번호: ");
		int pwd = Integer.parseInt(sc.nextLine());
		
		accs.put(id, new SpecialAccount(id, name, money, pwd, grade));
		//accs[cnt++] = new SpecialAccount(id, name, money, pwd, grade);

		
		System.out.println("===================");
		System.out.println();
	}
	
	Account searchAccById(String id) {
		Account acc = null;
		
		for(Account a: accs.values()) 
		{
			if(a.getId().equals(id))
			{
				acc = a;
				break;
			}
		}
		
		return acc;
	}
	
	void deposit() throws BankException{
		System.out.println();
		System.out.println("===================");

		System.out.println("[입금]");
		System.out.println();
		
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		
		Account acc = dao.selectAccount(id);
		if(acc == null) throw new BankException("계좌오류", ERR_CODE.ACCID);
		if(!checkAccount(acc)) return;
		
		System.out.print("비밀번호를 입력하세요: ");
		int pwd = Integer.parseInt(sc.nextLine());
		
		boolean checkPwd = acc.checkPwd(pwd);
		if(checkPwd == false) throw new BankException("비밀번호 오류", ERR_CODE.PASSWORD);

		
		System.out.print("입금액: ");
		int money =Integer.parseInt(sc.nextLine());
		

		
		System.out.println();
		System.out.println(String.format("%s 님에게 %d원을 송금합니다.", acc.getName(), money));
		acc.deposit(money);
		dao.updateBalance(acc);
		System.out.println("===================");
		System.out.println();
	}
	
	
	
	void withdraw() throws BankException{
		System.out.println();
		System.out.println("===================");
		
		System.out.println("[출금]");
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		
		Account acc = dao.selectAccount(id);
		if(acc == null) throw new BankException("계좌오류", ERR_CODE.ACCID);
		if(!checkAccount(acc)) return;
		
		System.out.print("비밀번호를 입력하세요: ");
		int pwd = Integer.parseInt(sc.nextLine());
		
		boolean checkPwd = acc.checkPwd(pwd);
		if(checkPwd == false) throw new BankException("비밀번호 오류", ERR_CODE.PASSWORD);
		
		System.out.print("출금액: ");
		int money =Integer.parseInt(sc.nextLine());
		
		
		
		System.out.println();
		System.out.println(String.format("%d원을 출금합니다.", money));
		acc.withdraw(money);
		System.out.println(String.format("잔액: %d원", acc.getBalance()));
		acc.withdraw(money);
		dao.updateBalance(acc);
		System.out.println("===================");
		System.out.println();
	}
	
	void transfer() throws BankException{
		System.out.println();
		System.out.println("===================");
		
		System.out.println("[계좌 송금]");
		
		// 본인 계좌
		System.out.print("본인 계좌 번호: ");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if(acc == null) throw new BankException("계좌 오류", ERR_CODE.SENDACCID);

		
		System.out.print("숫자 4자리 비밀번호를 입력하세요: ");
		int pwd = Integer.parseInt(sc.nextLine());
		
		boolean checkPwd = acc.checkPwd(pwd);
		if(checkPwd == false) throw new BankException("비밀번호 오류", ERR_CODE.PASSWORD);


		
		// 상대 계좌
		System.out.print("송금받을 계좌 번호: ");
		id = sc.nextLine();
		
		Account toAcc = searchAccById(id);
		if(toAcc == null) throw new BankException("계좌 오류", ERR_CODE.RECVACCID);

		
		// 송금할 금액
		System.out.print("송금액: ");
		int money =Integer.parseInt(sc.nextLine());
		
		
		
		System.out.println();
		System.out.println(String.format("%s 님에게 %d원을 송금합니다.", toAcc.getName(), money));
		acc.withdraw(money);
		toAcc.deposit(money);
		System.out.println(String.format("잔액: %d원", acc.getBalance()));
		
		System.out.println("===================");
		System.out.println();
	}
	
	void accountInfo() throws BankException{
		System.out.println();
		System.out.println("===================");
		System.out.println("[계좌 조회]");
		
		System.out.print("계좌 번호: ");
		String id = sc.nextLine();
		Account acc = null;
		
		acc = searchAccById(id);
		if(!checkAccount(acc)) return;
		
		System.out.print("비밀번호를 입력하세요: ");
		int pwd = Integer.parseInt(sc.nextLine());
		
		boolean checkPwd = acc.checkPwd(pwd);
		if(checkPwd == false) throw new BankException("비밀번호 오류", ERR_CODE.PASSWORD);


		
		System.out.println("찾으신 계좌: " + acc.info());
		System.out.println("===================");
		System.out.println();
		
	}
	
	void allAccountInfo() {
		System.out.println();
		System.out.println("===================");
		System.out.println("[전체 계좌 조회]");
		
		int i = 0;
		for(Account acc:accs.values()) {
			i++;
			System.out.println(i+ "번: " +acc.info());
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
	
	
	void storeAccs() {
		FileOutputStream fos = null;
		BufferedOutputStream bos= null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("accs.data");
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			
			//계좌 수 저장
			dos.writeInt(accs.size());
			for(Account acc: accs.values()) {
				if(acc instanceof SpecialAccount) {
					dos.writeChar('S');
					dos.writeUTF(((SpecialAccount)acc).getGrade());
				} else {
					dos.writeChar('N');
				}
				dos.writeUTF(acc.getId());
				dos.writeUTF(acc.getName());
				dos.writeInt(acc.getBalance());
				dos.writeInt(acc.getPwd());
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) dos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	void loadAccs() {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("accs.data");
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			char sect;
			int cnt = dis.readInt();
			String id, name, grade = null;
			int balance, pwd;
			for(int i = 0; i<cnt; i++) {
				sect = dis.readChar();
				if(sect == 'S') {
					grade =dis.readUTF();
				}
				id = dis.readUTF();
				name = dis.readUTF();
				balance = dis.readInt();
				pwd = dis.readInt();
				
				if(sect == 'S') {
					accs.put(id,  new SpecialAccount(id, name, balance, pwd, grade));
				} else {
					accs.put(id,  new Account(id, name, balance, pwd));
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis != null) dis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	void storeAccs_txt() {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("info.txt"))) {
			
			for(String key: accs.keySet()) {
				bw.write(accs.get(key).info());
				bw.newLine();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	void storeAccs_ser() {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("account.ser"))) {
			oos.writeObject(accs);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	void loadAccs_ser() {
		try(ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("account.ser"))) {
			// Map 객체를 통째로 읽어와서 기존 accs 변수에 할당합니다.
	        accs = (HashMap<String, Account>) ooi.readObject();
	        
	        // 읽어온 데이터 출력 예시
	        for (String key : accs.keySet()) {
	            System.out.println("계좌번호: " + key + ", 정보: " + accs.get(key).info());
	        }
		}catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.loadAccs();
		bank.loadAccs_ser();
		
		Loop1 : while(true) {
			try {
				int sel = bank.menu();
				switch(sel) {
				case 1: bank.selMakeAccount(); break;
				case 2: bank.deposit(); break;
				case 3: bank.withdraw(); break;
				case 4: bank.transfer(); break;
				case 5: bank.accountInfo(); break;
				case 6: bank.allAccountInfo(); break;
				case 0: bank.goodBye(); break Loop1;}
			}
			catch(Exception e) {
				System.out.println(e.toString());
			}
		}
		
		bank.storeAccs();
		bank.storeAccs_txt();
		bank.storeAccs_ser();
	}
}



