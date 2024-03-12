//obj변수의 타입이 Account이기 때문에
//Account에 없는 pay메소드나 cardNo필드는 컴파일 에러 발생
package ex09_03upcasting;
public class RefTypeExample7 {

	public static void main(String[] args) {
		Account obj = 
				new CheckingAccount("111-22-3333333", "홍길동", 10000, "4444-5555-6666-7777");
			try {
				obj.withdraw(1000);
				System.out.println("계좌번호:" + obj.accountNo);
				System.out.println("예금주 이름:" + obj.ownerName);
				System.out.println("잔액:"+ obj.balance);
			} catch (Exception e) {
				System.out.println(e.getMessage());
		}
	}
}