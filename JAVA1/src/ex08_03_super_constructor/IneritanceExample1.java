package ex08_03_super_constructor;

public class IneritanceExample1 {
	public static void main(String args[]) {
		
		CheckingAccount obj = 
		new CheckingAccount("111-222-3333333","홍길동",0,"5555-6666-7777-8888");
		
		obj.deposit(10000000);//상속받은 메소드

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
