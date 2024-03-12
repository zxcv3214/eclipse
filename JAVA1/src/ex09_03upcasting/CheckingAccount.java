package ex09_03upcasting;
//은행 계좌 클래스를 상속받는 직불 계좌 클래스
//은행 계좌 클래스(Account)			--슈퍼 클래스(상속을 해주는 클래스)
//직불 계좌 클래스(CheckingAccount)	--서브 클래스(상속을 받는 클래스)
class CheckingAccount extends Account{

	String cardNo;//직불카드 번호
	
	CheckingAccount(String accountNo, String ownerName, int balance,String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo=cardNo;
	}

	//직불 카드 사용액을 지불한다에 해당하는 메소드
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다.");
		return super.withdraw(amount);
	}
}
