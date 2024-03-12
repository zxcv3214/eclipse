package ex14_1_wrapper;

public class Wrapper2_1_String_to_int {

	public static void main(String[] args) {
		//Wrapper 클래스의 생성자를 대신하는 정적 메소드
		//박싱 - 기본형 타입의 값을 객체화
		//int -> Integer
		
		Integer obj1 = Integer.valueOf(10);
		Integer obj2 = Integer.valueOf(10);
		
		//똑같은 기본값을 가지고 valueOf메소드를 여러 번 호출하면 같은 객체에 대한 참조값을 리턴
		if(obj1 == obj2)
			System.out.println("obj1==obj2");
		else 
			System.out.println("obj1 != obj2");
		
		//String과 마찬가지로 equals 메소드는 주소값이 아닌 내용을 비교하도록
		//오버라이딩되어 있습니다.
		if(obj1.equals(obj2))
			System.out.println("obj1.equals(obj2) 같아요");
		else {
			System.out.println("obj1.equals(obj2) 달라요"); 
		}
	}

}
