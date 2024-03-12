package ex06_2_method;

public class MethodExample7 {
	
//접근제어자     객체생성없이 접근 가능   반환되는 값의 자료형   메서드이름(매개변수 목록)
public        static            void             main(String[] args) {       
	
	
	hap(1,10);
	
	return;//여기서 main()메서드를 종료합니다.
}
	//메서드 정의
	public static int hap(int start, int end) {
		int sum=0;
		for(int i=start;i<end; i++) {
			sum+= i ;
			
		}
		return sum;//반환되는 값이 자로형이 void인 경우 이 문장은 생략이 가능하다.
	}
}
