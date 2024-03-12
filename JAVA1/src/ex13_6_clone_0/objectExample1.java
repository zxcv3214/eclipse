//clone()메소드는 객체를 복제하는 기능을 합니다.
//즉, 똑같은 값을 갖는 객체를 한 개 더 만듭니다.
//복제 가능한 클래스에 대해서만 호출할 수 있습니다.
//복제 가능한 클래슨느 Cloneable 인터페이스 구현 여부입니다.

//Cloneable 인터페이스를 구현한 GregorianCalendar 클래스에 대해서
//clone()메소드를 호출하는 예제

package ex13_6_clone_0;
import java.util.GregorianCalendar;
public class objectExample1 {

	public static void main(String[] args) {
		//객체를 생성합니다.
		GregorianCalendar obj1 = new GregorianCalendar(2024, 0 ,29);
		
		//clone 메소드로 객체를 복제합니다.
		Object imsi = obj1.clone();
		GregorianCalendar obj2 = (GregorianCalendar)imsi;
		//위 두 문장을 한 문장으로 표현하면 다음과 같습니다.
		//GregorianCalendar obj2 = (GregorianCalendar) obj1,clone();
		
		//%tF : 포맷 명세자는 날짜를 yyyy-MM-dd 형식으로 포맷하는 역하을 한다.
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
		
		obj1.set(2024, 6, 1);
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
		
	}

}
