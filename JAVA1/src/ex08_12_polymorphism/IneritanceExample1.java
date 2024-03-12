//인스턴스화 할수 없다(객체로 만들 수 없다) 에러 발생
//Cannot instantiate the type Account
package ex08_12_polymorphism;
public class IneritanceExample1 {
	public static void main(String[] args) {
		Account obj1 = new Account("111-22-333333","임꺽정",10000); 
		System.out.println("계좌번호:" + obj1.accountNo);
		System.out.println("예금주 이름:" + obj1.ownerName);
		System.out.println("잔액:" + obj1.balance);
		System.out.println();
		
		CheckingAccount obj2= new CheckingAccount ("444-55-666666", "홍길동", 200000, "5555-6666-7777-8888");
		System.out.println("계좌번호:" + obj2.accountNo);
		System.out.println("예금주 이름:" + obj2.ownerName);
		System.out.println("잔액:" + obj2.balance);
		System.out.println();
		
		CreditLineAccount obj3 = new CreditLineAccount("777-88-999999", "김선달", 30000, 2000000);
		System.out.println("계좌번호:" + obj3.accountNo);
		System.out.println("예금주 이름:" + obj3.ownerName);
		System.out.println("잔액:" + obj3.balance);
		System.out.println();
		
		BonusPintAccount obj4 = new BonusPintAccount("000-00-000000", "김미영", 0, 0);
		System.out.println("계좌번호:" + obj4.accountNo);
		System.out.println("예금주 이름:" + obj4.ownerName);
		System.out.println("잔액:" + obj4.balance);
		System.out.println();
	}
	
}