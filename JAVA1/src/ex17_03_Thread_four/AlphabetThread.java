package ex17_03_Thread_four;

public class AlphabetThread extends Thread{

		public void run() {
			for(int ch =0; ch <10; ch++) {
				System.out.print(ch);
			try {
				DigitThread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
