package ex17_06_SharedArea_problem;

public class PrintThread extends Thread{
	private SharedArea sha;
	
	PrintThread(SharedArea sha){
		this.sha=sha;
	}

	public void run() {
		//공유 영역의 데이터 출력
		System.out.println("공유 영역 데이터 출력" +sha.getResult());
	}
}
