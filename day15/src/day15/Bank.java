package day15;

public class Bank {
	String ownername = "홍길동";
	String ownernum = "00000000000000";
	private int balance = 0;
	static double interestlate = 0.07;
	
	public Bank() {
		String ownername = "";
		String ownernum = "00000000000000";
		int balance = 0;
		double interestlate = 0.07;
	}
	//setter 반환타입이 없고 매개변수가 있음
	public void setMoney(int balance) {
		this.balance+=balance;
		}
	
	//getter 반환타입이 있고 매개변수가 없음
	public int getMoney() {
		return balance;
	}
	
	public void deposit(int gold) {
		System.out.println(gold+"원을 입금합니다");
		balance += gold;
		balance += gold*interestlate;//더 큰 자료형으로 자동계산 된다
		
	}
	public void withdrawal(int balance) {
		if (this.balance - balance < 0) {
			System.out.println("잔액이 부족합니다");
			return;
		}else {
			this.balance -= balance;
			System.out.println(this.balance+"원을 인출합니다");
		}
	}
	
	public void jango() {
		System.out.println("잔금:"+balance);
	}
	
	public void interestgold() {
		balance += (int)balance*interestlate;
	}
	
	public void getinfo() {
		System.out.println("예금주:"+ownername);
		System.out.println("계좌번호:"+ownernum);
		System.out.println("잔금:"+balance);
		System.out.println("이자율:"+interestlate);
	}
	
	
}
