package ex06_2_method;

public class MethodExample8 {
	
//접근제어자     객체생성없이 접근 가능   반환되는 값의 자료형   메서드이름(매개변수 목록)
public        static            void             main(String[] args) {       
	
	
	hap(1,10);//아무덕도 출력되지 않습니다.
	
	//1.return sum의 값을 저장해서 출력하는 방법
	int result=hap(1,100);
	System.out.println("1: result = " + result);
	
	//2. 출력문에서 메서드 호출하는 방법
	System.out.println("출력문 안에서 호출 : " + hap(1,5));
	return;//여기서 main()메서드를 종료합니다.
}
	//메서드 정의
	public static int hap(int start, int end) {
		int sum=0;
		for(int i=start;i<=end; i++) {
			sum+= i ;
			
		}
		return sum;//반환되는 값이 자로형이 void인 경우 이 문장은 생략이 가능하다.
	}
}
