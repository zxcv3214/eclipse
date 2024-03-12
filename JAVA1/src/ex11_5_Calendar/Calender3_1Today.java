
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

public class Calender3_1Today {
	public static void main(String[] args) {
	System.out.println("=======오늘의 날짜========");
	Today t= new Today();
	System.out.println(t.toString());
	System.out.println(t);
	System.out.println("=======특정날짜==========");
	GregorianCalendar g = new GregorianCalendar(2024,6,1);
	Today t2=new Today(g);
	System.out.println(t2.toString());
	System.out.println(t2);
	
	
	System.out.println("========특정날짜=========");
	Today t3 = new Today(new GregorianCalendar(2024,6,1));
	System.out.println(t3.toString());
	System.out.println(t3);
	}				
}