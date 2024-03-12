package ex08_02_constructor;

public class IneritanceExample2 {
	public static void main(String args[]) {
		CheckingAccount obj = new CheckingAccount("111-222-3333333",
									"홍길동",0,"5555-6666-7777-8888");
		/* 오류 발생
		 * CheckingAccount obj = new CheckingAccount();
		 * */
		
		obj.deposit(10000000);//상속받은 메소드
		//obj.deposit(10);
		try {
			int paidAmount = obj.pay("5555-6666-7777-8888", 470000);
			System.out.println("지불액:"+paidAmount);
			System.out.println("잔액:"+obj.balance);
		} catch (Exception e) {
			String msg=e.getMessage();
			System.out.println(msg);
		}
	}
}
