package ex17_03_Thread_four;

public class MultithreadExample1 {

	public static void main(String[] args) {
		//세 개의 스레드를 생성해서 시작합니다.
		Thread th1= new DigitThread();
		Thread th2= new AlphabetThread();
		Thread th3= new AlphabetThread();
		
		th1.start();
		th2.start();
		th3.start();

	}

}
