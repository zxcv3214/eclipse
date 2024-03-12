package ex08_06_final_class;

public class IneritanceExample1 {
	public static void main(String args[]) {
		
		BonusPintAccount obj = 
		new BonusPintAccount("111-222-3333333","김미영",0,0);
		
		obj.deposit(1000);
		System.out.println("잔액:"+obj.balance);
		System.out.println("누적 포인트:"+obj.bonusPoint);
	}
}