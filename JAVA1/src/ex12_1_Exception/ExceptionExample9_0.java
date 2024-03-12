/* 상속 관계에 있는 두 종류의 Exception을 처리하는 try~catch문
 * */

package ex12_1_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample9_0 {
	private static void main(String args[]) {
		
		try {
			FileReader reader = new FileReader("some.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
		}
}
