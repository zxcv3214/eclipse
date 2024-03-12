package ex17_09_syn_soltion;

public class TransferThread extends Thread {
	private SharedArea sha;

	public TransferThread(SharedArea area) {
		sha = area;
	}

	public void run() {
		// 필드 계좌 account1과account2의 잔액을 더한다
		for (int cnt = 0; cnt < 12; cnt++) {
			//동기화 시작 (부분 동기화)
			synchronized (sha) {
				sha.getAccount1().withdraw(1000000);
				System.out.print("회사 계좌 : 100만원 인출, ");

				sha.getAccount2().deposit(1000000);
				System.out.println("직원 계좌 : 100만원 입금");
			
			}//동기화 끝
		} // for
	}// run
}// class
