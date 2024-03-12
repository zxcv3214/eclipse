package ex07_21_Account;

public class Account_main_test {

	public static void main(String[] args) {
		Account2 obj = new Account2("777-777-777123456", "홍길동", 10);
		try {
			int amount= obj.withdraw(100000);
			System.out.println("인출액:" + amount);
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}

}
