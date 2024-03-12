// equals메소드 사용 예 - 똑같은 값을 갖는 두 개의 객체를 생성
/*
 * Object 클래스의 equals() 메소드
 * 1. 매개변수로 객체의 참조변수를 받아서 비교하여 그 결과를 boolean값으로 알려 주는 역할을 합니다.
 * 2. 다음은 equals메소드의 실제 내용입니다.
 * public boolean equals(Object arh0) {
 * 	 reture this == arg0;
 * }
 * 3. 두 객체의 같고 다름은 참조변수의 값으로 판단하고 있습니다.
 * 4. 서로 다른 두 객체를 equals메소드로 비교하면 항상 false 결과를 얻게 됩니다/
 * 
 * */

package ex13_5;

public class ObjectExample {

	public static void main(String[] args) {
		Circle2 obj1 = new Circle2(5);
		Circle2 obj2 = new Circle2(5);
		
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		//System.out.println(obj1.toString()); 
		//System.out.println(obj2.toString());
		
		if(obj1==obj2) //주소를 비교하고 있다.
			System.out.println("obj1==obj2 : 같음");
		else 
			System.out.println("obj1==obj2 : 다름");
		
		if (obj1.equals(obj2))//주소안에 있는 값을 비교한다.
			System.out.println("obj1.equals(obj2): 같음");
		else {
			System.out.println("obj1.equals(obj2): 다름");
		}
	}

}