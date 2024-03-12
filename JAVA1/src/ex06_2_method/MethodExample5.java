package ex06_2_method;

public class MethodExample5 {
	
//접근제어자     객체생성없이 접근 가능   반환되는 값의 자료형   메서드이름(매개변수 목록)
public        static            void             main(String[] args) {       
	
	int num=50;
	char data='*';
	
	print(num,data);//두 개의 값을 넘기고 싶으면 콤마를 사용하면 된다.
}
	//메서드 정의
	public static void print(int p_num,char p_data) {
		System.out.println("ptint() 메서드 입니다.");
		System.out.println("main() 메서드에서 전달받은 데이터의 값은 " + p_num 
				+","+p_data + "입니다.");
	}
}
