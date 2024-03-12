
/*
 * 0.상속 관계
 * java.lang.Object
 * 		java.util.Calendar
 * 			java.util.GregorianCalendar
 * 
 * Calendar는 추상 클래스로 이렇게 사용할 수 없습니다.
 * 1.Calendar c = new Calendar();
 * 
 * 2.Calendar 사용법 두가지
 * 		하나)정적 메소드를 이용해서 사용하는 방법
 * 			Calendar c1 = calendar.getInsrance();
 * 			getInstance() : Calendar 클래스를 구현한 클래스의 인스턴스를 반환
 * 			getInstance() : 메소드는 달력 필드가 현재 날짜 및 시간으로 초기화 된 Calendar 객체를 반환
 * 		둘) 업캐스팅 방법(자식의 주소를 부모의 자료형을 가진 변수에 저장)
 * 			Calendar c2 = new GregorianCalendar();
 * 
 * 3.GregorianCalendar c = new GregorianCalendar();
 * */
package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calender03 {
	public static void main(String[] args) {
	//기본적으로 현재날짜와 시간으로 설정
		//Calendar today=Calendar.getInstance();
		
		String[] yo= {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		String[] ampm= {"오전", "오후"};
	//특정 날짜에 대한 정보를 얻고자 할때 생성자에 년, 월 ,일을 인자로 넘깁니다.
	Calendar c1 = new GregorianCalendar(2024,5,1);//2024년 1월1일
	
	int y= c1.get(Calendar.YEAR);
	int m= c1.get(Calendar.MONTH)+1;
	int d= c1.get(Calendar.DATE);
	int h1=c1.get(Calendar.HOUR);
	int ap=c1.get(Calendar.AM_PM);
	int mm=c1.get(Calendar.MARCH);
	int s=c1.get(Calendar.SECOND);
	int yoil=c1.get(Calendar.DAY_OF_WEEK);
	
	System.out.print(y+"년 "+m+"월 "+d+"일 ");
	System.out.print(" " + ampm[ap] + " ");
	System.out.print(h1 +":"+ mm + ":" + s+"");
	System.out.print(yo[yoil-1]+ "입니다.");
	
	
	}				
}
