package ex07_20_Exception;

public class ExceptionExample3_1 {
//unchecked exception에 해당 - 컴파일 에러 없음

	public static void main(String[] args) {
		int resule = add (1,-2);
		System.out.println(resule);
		
	}
	//throws Exception : throw에 의해 발생한 에러를 호출한 메소드로 넘깁니다.
	static int add(int a, int b) {
		int result = a+b;
		if (result < 0)
			throw new Exception("0보다 작아 에러 발생합니다.");
		return result;
	}
	
}
