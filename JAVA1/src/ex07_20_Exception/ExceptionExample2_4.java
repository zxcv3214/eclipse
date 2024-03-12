package ex07_20_Exception;

public class ExceptionExample2_4 {
//unchecked exception에 해당 - 컴파일 에러 없음

	public static void main(String[] args) {
		int num1 = 3, num2 = 0;
		try {
			int result = num1 / num2;
			System.out.println(result);
		} catch (ArithmeticException e) {
			//ArithmeticException객체에 있는 에러 메시지를 가져옵니다.
			String message = e.getMessage();
			System.out.println(message);
		}finally {
			System.out.println("여기까지 왔어요");
		}
		
		
	}
	
}
