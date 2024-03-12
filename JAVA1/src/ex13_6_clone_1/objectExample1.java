//clone()메소드는 객체를 복제하는 기능을 합니다.
//즉, 똑같은 값을 갖는 객체를 한 개 더 만듭니다.
//복제 가능한 클래스에 대해서만 호출할 수 있습니다.
//복제 가능한 클래슨느 Cloneable 인터페이스 구현 여부입니다.

//Cloneable 인터페이스를 구현한 GregorianCalendar 클래스에 대해서
//clone()메소드를 호출하는 예제

package ex13_6_clone_1;
import java.util.GregorianCalendar;
public class objectExample1 {

	public static void main(String[] args) {
		//객체를 생성합니다.
		Rectangle obj1 = new Rectangle(10, 20);
		
		//The method clone() from the type Object is not visible
		//clone메소드로 객체를 복제합니다.
		Rectangle obj2 = (Rectangle) obj1.clone();
		
		//원본 객체와 복제 객체의 값을 출력합니다.
		System.out.println("obj1 [" + obj1 +"]");
		System.out.println("obj1 [" + obj2 +"]");
		
		obj1.width =200;
		obj1.height=100;
		System.out.println("obj1 [" + obj1 +"]");
		System.out.println("obj1 [" + obj2 +"]");
		
	}

}
