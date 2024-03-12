package ex08_03_super_constructor;
//모든 클래스의 조상은 object 클래스입니다.
//다른 클래스로부터 상속 받지 않는 모든 클래스들은 자동적으로 object 클래스로 부터 상속 받습니다.
public class Account {//컴파일러가 extends Object를 추가합니다.
	
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
		balance =+ deposit;
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
