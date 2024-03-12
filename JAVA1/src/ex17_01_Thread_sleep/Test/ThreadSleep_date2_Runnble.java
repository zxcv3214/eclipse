package ex17_01_Thread_sleep.Test;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ThreadSleep_date2_Runnble implements Runnable{

	public void run() {
		SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일 E요일 HH시mm분ss초");
		for(;;) { //for문 무한루프
			Date d = new Date(); //오늘 시스템 날짜와 시간
			System.out.println(s.format(d));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.out.println(ie.toString());
			}
		}
	}
}
