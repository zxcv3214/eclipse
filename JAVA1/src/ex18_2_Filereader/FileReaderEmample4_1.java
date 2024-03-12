// 1.파일을 엽니다.
		/*
		 * 생성자 인지값으로 파일의 위치를 지정합니다. 지정 방법 
		 * 		: 상대 경로와 절대 결로 지정 
		 * 		1.상대 경로: 프로젝트 경로를 기준으로 차례대로 파일의 위치를 지정합니다 
		 * 		2.정대 경로: 드라이브명부터 차레대로 파일의 위치를 지정합니다. 
		 * 		예) D:/작업폴더/프로젝트/prem.txt 의미
		 */
package ex18_2_Filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEmample4_1 {

	public static void main(String[] args) {
		
		FileReader reader =null;
		char arr[] = new char[64];
		try {
			reader = new FileReader("거위의 꿈.txt");
			
			while (true) {
				//Returns : The number of characters read
				//arr의 배열 크기 만큼 문자를 읽어 arr에 저장한 후 읽은 개수를 변환
				int num = reader.read(arr);
				if(num == -1)// 더이상 읽은 문자가 없을 경우 -1 리턴
					break;
				for(int cnt=0; cnt <num; cnt++) {
					System.out.printf("%c",arr[cnt]);
				}// for end
			}//while end
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