package ex07_21_Account;

public class Account2 {
	String accountNo; //계좌번호
	String ownerName; //예금주 이름
	int balance; 	  //잔액
	
	
	Account2 (String accountNo,String ownerName,int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	//예금 메소드
	void deposit(int deposit) {
		balance=+deposit;
		System.out.println("예금되었습니다.");
	}
	
	//인출 메소드
	int withdraw(int withdraw) throws Exception {
		//Exception 클래스를 이용해서 예외를 발생합니다.
		if(balance<withdraw) 
				throw new Exception("잔액이 부족합니다.");
		balance -= withdraw;
		return withdraw;
	}
}
