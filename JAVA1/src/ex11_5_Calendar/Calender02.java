
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

public class Calender02 {
	public static void main(String[] args) {
	//기본적으로 현재날짜와 시간으로 설정
		Calendar today=Calendar.getInstance();
		
		
		System.out.print(today.get(1) + "년" );
		System.out.print((today.get(Calendar.MARCH)+1) +"월 ");					
		System.out.print(today.get(Calendar.DATE) +"일 ");
		if(Calendar.AM_PM != 1) {
			System.out.print("오후 ");
		}else {
			System.out.print("오전 ");
		}
		System.out.print(today.get(Calendar.HOUR) +":");					
		System.out.print(today.get(Calendar.MINUTE) +":");
		System.out.print(today.get(Calendar.SECOND));
		if(Calendar.DAY_OF_WEEK != 5) {
			System.out.print("목요일입니다.");
		}else {
			System.out.println("금요일입니다.");
		}
			
		
			
		
		
								
							
							
							

	}
}
