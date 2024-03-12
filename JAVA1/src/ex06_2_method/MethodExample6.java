package ex06_2_method;

public class MethodExample6 {
	
//접근제어자     객체생성없이 접근 가능   반환되는 값의 자료형   메서드이름(매개변수 목록)
public        static            void             main(String[] args) {       
	
	int num=20;
	char data='*';
	
	print(num,data);
}
	//메서드 정의
	public static void print(int p_num,char p_data) {
		for(int i=0; i<p_num; i++) {
			System.out.print(p_data);
		}
	}
}
