package ex18_2_Filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEmample3 {

	public static void main(String[] args) {
		// 1.파일을 엽니다.
		/*
		 * 생성자 인지값으로 파일의 위치를 지정합니다. 지정 방법 
		 * 		: 상대 경로와 절대 결로 지정 
		 * 		1.상대 경로: 프로젝트 경로를 기준으로 차례대로 파일의 위치를 지정합니다 
		 * 		2.정대 경로: 드라이브명부터 차레대로 파일의 위치를 지정합니다. 
		 * 		예) D:/작업폴더/프로젝트/prem.txt 의미
		 */
		FileReader reader = null;
		try {
			reader = new FileReader("poem.txt");
			// FileReader reader =new FileReader("D:/workspace_Java/java/poem.txt");
			// FileReader reader =new FileReader("D:\\workspace_Java\\java\\poem.txt");

			while (true) {
				// read() : 파일에 있는 문자 하나를 읽어서 리턴하는 메소드
				int data = reader.read();
				if (data == -1)// 더 이상 읽을 데이터가 없는 경우
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
			reader.close();// 만약 read() 메소드에서 오류가 발생하면
							// close() 메소드가 실행 되지 않은 채 프로그램을 끝난다.
		} catch (FileNotFoundException fnfe) { // FileReader() 생성자가 발생한 Exception 처리
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {// read() 메소드가 발생한 예외 처리
			System.out.println("파일을 읽을 수 없습니다.");
		} finally { //파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 사용함
			//finally 에러가 발생 여부와 상관없이 수행가능
			try {
				if (reader != null) {
					reader.close(); // 파일을 닫는 명령문
				}
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
	}
}