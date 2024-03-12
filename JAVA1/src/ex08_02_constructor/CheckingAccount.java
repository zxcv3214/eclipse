package ex08_02_constructor;
//은행 계좌 클래스를 상속받는 직불 계좌 클래스
//은행 계좌 클래스(Account)			--슈퍼 클래스(상속을 해주는 클래스)
//직불 계좌 클래스(CheckingAccount)	--서브 클래스(상속을 받는 클래스)
public class CheckingAccount extends Account{

	String cardNo;//직불카드 번호
		
	CheckingAccount(String accountNo, String ownerName, 
						int balance, String cardNo) {
		//생성자 첫 줄에서 부모 생성자를 호출하지 않았기 때문에 컴파일러가 부모의 생성자를
		//호출하는 문장인 super();를 여기 삽입합니다.
		//super();
		this.accountNo=accountNo;//상속 받은 필드 초기화
		this.ownerName=ownerName;//상속 받은 필드 초기화
		this.balance=balance;	 //상속 받은 필드 초기화
		this.cardNo=cardNo;		 //클래스 안에 선언된 필드 초기화
	}
		
	//직불 카드 사용액을 지불한다에 해당하는 메소드
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다.");
		return withdraw(amount);
	}
	
	
	
	
	
	
	
}
