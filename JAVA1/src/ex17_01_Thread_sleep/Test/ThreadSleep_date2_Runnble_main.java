package ex17_01_Thread_sleep.Test;

public class ThreadSleep_date2_Runnble_main {

	public static void main(String[] args) {
		Thread t =new Thread(new ThreadSleep_date1());
		t.start();
	}

}
