/* Lisy 인터페이스  - ArrayList (상속받는 클래스)
 * 1. 여러가지 자료형의 Date를 모두 저장할 수 있습니다.     
 *      ex) int, double, char, boolean,String, etc
 * 2. 엽력한 순새대로 출력됩니다.(index번호 순 저장됨)
 * 3. 중복된 Date를 저장 할 수 있습니다.
 * 4. 동적인 저장 구조를 이용할 수 있습니다(add(),remove();
 * */
package ex15_1_ArrayList;

import java.util.ArrayList;

public class Array_list1 {
	public static void main(String[] args) {
		//업캐스팅(상속해준 메소드만 사용가능합니다.)
		//List list== new ArrayList();
		
		ArrayList list= new ArrayList();
		//자료 추가
		list.add("하나");
		list.add(2); //list.add(Integer.valueOf(2);
		list.add(false);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add('A');
	}
}