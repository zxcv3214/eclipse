package ex08_04_overruding;

public class IneritanceExample1 {
	public static void main(String args[]) {
		
		CreditLineAccount obj = 
		new CreditLineAccount("111-222-3333333","홍길동",100,20000);

		try {
			int amount = obj.withdraw(500);
			System.out.println("인출액:"+amount);
			System.out.println("잔액:"+obj.balance);
			System.out.println("마이너스 한도:"+obj.creditLine);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
