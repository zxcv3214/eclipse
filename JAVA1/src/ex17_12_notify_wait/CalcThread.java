//파이를 계산하는 스레드 클래스
package ex17_12_notify_wait;

public class CalcThread extends Thread {
	private SharedArea sha;
	
	public CalcThread(SharedArea sha) {
		this.sha=sha;
	}
	
	 public void run() {
		double total = 0.0;
		// 파이를 계산하는 부분
		for (int cnt = 1; cnt < 1000000000; cnt += 2)
			if (cnt / 2 % 2 == 0)
				total += 1.0 / cnt;
			else
				total -= 1.0 / cnt;

		// 계산 결과를 공유 영역에 저장
		sha.setResult(total*4);
		
		//sha 객체의 isReady 필드 값을 true로 설정
		sha.setReady(true);
		
		//다른 스레드로 신호를 보내는 메소드
		synchronized (sha) {
			 sha.notify();
		 }	
	 }
	
}
