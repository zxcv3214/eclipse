package ex06_2_method;

public class MethodExample2 {
	
//접근제어자     객체생성없이 접근 가능   반환되는 값의 자료형   메서드이름(매개변수 목록)
public        static            void             main(String[] args) {       
	
	print();//메서드 호출해야 출력이 된다.
	print();//호출할 메서드를 2번쓰면 2번 호출이 가능하다.
		

	}
	//메서드 정의
	public static void print() {
		System.out.println("ptint() 메서드 입니다.");
		System.out.println("ptint() 메서드 입니다.");
	}
}
