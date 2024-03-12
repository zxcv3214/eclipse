package ex17_10_syn_format1;

public class TransferThread extends Thread {
	private SharedArea sha;

	public TransferThread(SharedArea area) {
		sha = area;
	}

	public void run() {
		// 필드 계좌 account1과account2의 잔액을 더한다
		for (int cnt = 0; cnt < 12; cnt++) {
			
			sha.transfer();
			
		} // for
	}// run
}// class
