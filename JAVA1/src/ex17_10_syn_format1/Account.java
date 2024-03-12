
package ex17_10_syn_format1;

public class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	
	//클래스안에서 마우스 우클릭 -> Source -> Generate,Getters and Setters로 만들수있다.
	
	Account(String accountNo, String ownerName, int balance) {
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	void deposit(int deposit) {
		balance+=deposit;
		System.out.println("예금되었습니다.");
	}
	
	//인출 메소드
	int withdraw(int withdraw) {
		if(balance<withdraw) {
			return 0;
		}
		balance -= withdraw;
		return withdraw;
	}
	
	public String getAccountNo() {//예금메소드
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo=accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
