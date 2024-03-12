package ex17_08_syn_problem;

public class TransferThread extends Thread {
	private SharedArea sha;

	public TransferThread(SharedArea area) {
		sha = area;
	}

	public void run() {
		// 필드 계좌 account1과account2의 잔액을 더한다
		for (int cnt = 0; cnt < 12; cnt++) {
			sha.getAccount1().withdraw(1000000);
			System.out.print("회사 계좌 : 100만원 인출, ");

			sha.getAccount2().deposit(1000000);
			System.out.println("직원 계좌 : 100만원 입금");

		} // for
	}// run
}// class
