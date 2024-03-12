package ex17_02_Thread_sleep;
public class MultithreadExample {

	public static void main(String[] args) {
		Thread th = new DigitThread();
		th.start();
		
		for(char ch = 'A'; ch <='Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000); //sleep 메소드:일정시간이 경과되기를 기다리는메소드
				//public static void sleep(long millis) throws InterruptedException
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}//catch end
		}//for end
	}//main end
}//class end
