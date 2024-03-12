//checked exception을 던지는 메소드
//컴파일 에러 발생
//throw Exception를 가진 메소드 호출시 try~catch문으로 처리
package ex07_20_Exception;
public class ExceptionExample3_3 {
	public static void main(String[] args) {
		int resule;
		try {
			resule = add (1,-2);
			System.out.println(resule);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	//throws Exception : throw에 의해 발생한 에러를 호출한 메소드로 넘깁니다.
	static int add(int a, int b) throws Exception {
		int result = a+b;
		if (result < 0)
			throw new Exception("0보다 작아 에러 발생합니다.");
		System.out.println("나는 출력이 될까요?");
		return result;
	}
	
}
