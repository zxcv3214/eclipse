package ex17_09_syn_soltion;

public class PrintThread extends Thread{
	private SharedArea sha;
	
	PrintThread(SharedArea sha){
		this.sha=sha;
	}
	public void run() {
		
		for(int i=0; i<3; i++) {
			/* 
			 synchronized 키워드를 사용해서 블록으로 묶은 부분을 동기화 블럭이라고 합니다/
			 */
			//동기화 시작 (일부 동기화 형태)
			synchronized (sha) {
				int sum = sha.getAccount1().getBalance()+
						sha.getAccount2().getBalance();
				System.out.println("계좌 잔액 합계: "+sum);
			}
			//동기화 끝
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}