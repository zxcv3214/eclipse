//instanceof 사용예
package ex09_07_instanceof;
public class RefTypeExample10 {

	public static void main(String[] args) {
		Account obj = new Account("111-22-333333", "홍길동", 100000);
		
		//obj를 CheckingAccount로 캐스트 가능한 여부 확인(CheckingAccount) obj)
		if(obj instanceof CheckingAccount) {
			//obj를 CheckingAccount로 캐스트할 수 있을 때만 pay메서드 호출
			pay((CheckingAccount) obj);
		}else {
			//obj를 CheckingAccount로 캐스트할 수 없을 경우
			System.out.println("캐스트할 수 없는 타입입니다.");
		}
	}

	static void pay(CheckingAccount obj) {
		try {
			int amount=obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("인출액: " + amount);
			System.out.println("카드번호: " + obj.cardNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//obj는 메인에서 생성한 변수로 부모영역이나 자식영역에서 캐스트해서 사용할수없다.
	}
}
