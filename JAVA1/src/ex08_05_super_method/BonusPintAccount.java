//포인트 적립 계좌 클래스
package ex08_05_super_method;
public class BonusPintAccount extends Account {

	int bonusPoint; //필드 생성
	
	//생성자 오버라이딩
	BonusPintAccount(String accountNo, String ownerName,
						int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);//부모 클래스의 생성자 호출
		this.bonusPoint=bonusPoint;
	}
	//예금한다 기능을 다시 구현
	//상속받은 메소드의 로직을 단순히 확장
	//super는 자식 클래스에서 부모 클래스로 상속 받은 필드와 메서드를 참조하는데 사용
	//포인트적립 메소드
	void deposit(int amount) {
		//balance=+amount;
		super.deposit(amount);
		//bonusPoint += (int)(amount * 0.001);
		//bonusPoint += amount*(1/1000); 정수형으로 나누기하면 0이 나온다.
		bonusPoint += amount*(1.0/1000);
	}
}
