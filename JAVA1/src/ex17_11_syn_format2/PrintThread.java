package ex17_11_syn_format2;

public class PrintThread extends Thread{
	private SharedArea sha;
	
	PrintThread(SharedArea sha){
		this.sha=sha;
	}
	public void run() {
		
		for(int i=0; i<3; i++) {
			
			int sum = sha.getTotal();
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}