//포인트 적립 계좌 클래스
package ex08_12_polymorphism;
public class BonusPintAccount extends Account {

	int bonusPoint; //필드 생성
	
	//생성자 오버라이딩
	BonusPintAccount(String accountNo, String ownerName,
						int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);//부모 클래스의 생성자 호출
		this.bonusPoint=bonusPoint;
	}
	
	void deposit(int amount) {
		//balance=+amount;
		super.deposit(amount);
		bonusPoint += (int)(amount * 0.001);
		
	}
}
