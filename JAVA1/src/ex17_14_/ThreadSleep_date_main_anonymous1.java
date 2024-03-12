package ex17_14_;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep_date_main_anonymous1 {

	public static void main(String[] args) {		
	//익명 클래스 = 간단한 작업이나 한페이지에 해결할수있을때 사용한다 업캐스팅 방식
		Thread t1 = new Thread() {
			
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
		};
	t1.start();
	}
	}
