package ex17_14_;

public class ThreadSleep_date_Runnble_main2 {

	public static void main(String[] args) {
		Thread t =new Thread(new ThreadSleep_date1());
		t.start();
	}

}
