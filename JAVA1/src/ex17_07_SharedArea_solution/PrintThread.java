package ex17_07_SharedArea_solution;

public class PrintThread extends Thread{
	private SharedArea sha;
	
	PrintThread(SharedArea sha){
		this.sha=sha;
	}

	public void run() {
		//sha객체의 isReady 필드 값이 true될때 까지 반복한다.
		while (sha.isReady() != true) {
			System.out.println("실행중~");
		}
		
		//공유 영역의 데이터 출력
		System.out.println("공유 영역 데이터 출력" +sha.getResult());
	}
}
