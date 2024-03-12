/* SimpleDateFormat 클래스를 사용하여 날짜와 시산을 포맷하는 프로그램
 * SimpleDateFormat 클래스의 format()메소드의 매개변수로 Date형 필요
 * Calendar의 gettime() 메소드를 이용해서 Date형 리턴값 얻음
 * Calendar -> Date형
 * */
package ex11_6_DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class DateFormatExample2_GregorianCalendar {
	public static void main(String[] args) {
	
	GregorianCalendar c1= new GregorianCalendar();
	
	c1.getTime();
	SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sd2 = new SimpleDateFormat("yyyy년MM월dd일");
	System.out.println(sd1.format(c1.getTime()));//yyyy-MM-dd 형태로 출력
	System.out.println(sd2.format(c1.getTime()));//yyyy년MM월dd일 형태로 출력
	
	//calendar.getTime() : calendar객체가 가지고 있는 날짜와 시간과 똑같은
	//정보를 갖는 Date 객체를 만들어서 리턴하는 메서드입니다.
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 a HH시 mm분 ss초 E요일");
	System.out.println(sdf1.format(c1.getTime()));
		
	}

}