package ex17_12_notify_wait;

public class PrintThread extends Thread{
	private SharedArea sha;
	
	PrintThread(SharedArea sha){
		this.sha=sha;
	}

	public void run() {
		if(sha.isReady() != true) {//파이가 계산 중인 경우
			try {
				synchronized (sha) {
					sha.wait(); //다른 스레드로 부터 신호를 기다린다.
								//파이의 계산이 끝나면 다른 스레드에서 신호를 보낸다
					
				}
			} catch (InterruptedException e) {//wait 메소드가 발생하는 익셉션 처리
				System.out.println(e.getMessage());
			}
		}
		
		//공유 영역의 데이터 출력
		System.out.println("공유 영역 데이터 출력" +sha.getResult());
	}
}
