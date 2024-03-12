//인스턴스화를 금지하는 abstract키워드
//abstract 키워드가 붙은 클래스를 추상 클래스(abstract class)라고 한다.
package ex09_03upcasting;
 class Account {
	
	String accountNo; //계좌번호
	String ownerName; //예금주 이름
	int balance; 	  //잔액
	
	//기본 생성자를 컴파일러가 자동 추가합니다.
	Account (String accountNo, String ownerName, int balance){
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;	
	}
	
	//예금 메소드
	void deposit(int deposit) {
		balance=+deposit;
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
