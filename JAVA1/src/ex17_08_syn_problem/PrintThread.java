package ex17_08_syn_problem;

public class PrintThread extends Thread{
	private SharedArea sha;
	
	PrintThread(SharedArea sha){
		this.sha=sha;
	}
	public void run() {
		
		for(int i=0; i<3; i++) {
			
			int sum = sha.getAccount1().getBalance()+
					sha.getAccount2().getBalance();
			System.out.println("계좌 잔액 합계: "+sum);
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}