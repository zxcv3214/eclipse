package ex09_04_downcasting_error;
public class RefTypeExample8 {

	public static void main(String[] args) {
		Account obj1 = new CheckingAccount("111-22-3333333", "홍길동", 
									100000, "5555-6666-7777-8888");
			
		CheckingAccount obj2 = (CheckingAccount) obj1;//컴파일러는 변수의 타입만 보고
									//대입 가능성을 검사하기 때문에 에러발생
		
		try {
			int amount = obj2.pay("5555-6666-7777-8888", 47000);
				System.out.println("인출액:" + amount);
				System.out.println("카드번호:" + obj2.cardNo);
				System.out.println("잔액:"+ obj2.balance);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}
