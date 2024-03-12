package ex11_6_DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormatExample1_Date {

	public static void main(String[] args) {
		//현재 시스템 날짜와 시간 구하느 방법
		//클래스 Date 이용하는 방법 - 현재 시스템 날짜와 시간을 구합니다.
		
		Date d = new Date();
		System.out.println("Date 사용 :" + d);
		
		
		
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy년MM월dd일");
		System.out.println(sd1.format(d));//yyyy-MM-dd 형태로 출력
		System.out.println(sd2.format(d));//yyyy년MM월dd일 형태로 출력
		
		//379페이지 참조하기
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 a HH시 mm분 ss초 E요일");
		System.out.println(sdf1.format(d));

	}

}