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
public class FileReaderEmample4_2 {
	public static void main(String[] args) {
		char arr[] = new char[64];//파일에 있는 문자를 담을 char배열
	/*
	  1. try-with-resource문으로 try() 괄호 안에 선언된 자원은
		 try문이 끝 날 때 자동으로 close() 메소드를 호출합니다.
		 	
	  2. try-with-resource문에 의해 자동으로 객체의 close()가 호출될 수 있으려면
		 클래스가 AutoCloseable이라는 인터페이스를 구현한 것이어야 합니다.
		 	   
		 형식)
		 try(){
		  ......
		 }catch(){
		 	   
		 }finally{
		 	   
		 }
	 */
		try (
			FileReader reader = new FileReader(
					"bin\\ex18_2_Filereader\\poem12.txt")
					) {
			while (true) {
				//Returns : The number of characters read
				int num = reader.read(arr);
				if(num == -1)// 더이상 읽은 문자가 없을 경우 -1 리턴
					break;
					//arr의 0부터 num개 만큼 스트링으로 만든후 출력
					System.out.print(new String(arr,0,num));
			}//while end
		}//try end
		 catch (FileNotFoundException fnfe) { 
			System.out.println("파일이 존재하지 않습니다.");
		} 
		 catch (IOException ioe) {// read() 메소드가 발생한 예외 처리
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			System.out.println("final입니다.");
	};
}
}