//checked exception을 던지는 메소드
//throws 절 없어도 try~catch 문으로 예외 처리 가능
//정수는 0으로 나누는 것이 금지되어 ArithmeticException 발생합니다.
package ex07_20_Exception;

import java.io.FileReader;

public class ExceptionExample8 {
	public static void main(String[] args) {
		FileReader reader = new FileReader("some.txt");
		
		//개발자가 선택해서 문제를 해결할수있다. try~catch 으로 해결할수 있고
		//FileNotFoundException사용해서 해결할 수 있다.
	}
	
}
