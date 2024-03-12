// 1.파일을 엽니다.
		/*
		 * 생성자 인지값으로 파일의 위치를 지정합니다. 지정 방법 
		 * 		: 상대 경로와 절대 결로 지정 
		 * 		1.상대 경로: 프로젝트 경로를 기준으로 차례대로 파일의 위치를 지정합니다 
		 * 		2.정대 경로: 드라이브명부터 차레대로 파일의 위치를 지정합니다. 
		 * 		예) D:/작업폴더/프로젝트/prem.txt 의미
		 */
package ex18_3_1_FileInputStream_FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreamExample1 {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("파일명을 Arguments텝에 output1.dat 입력해 주세요");
			return;
		}
		FileInputStream in = null;
		try {
			in = new FileInputStream(args[0]);
			//Run ->Run Configurations에서 매개변수 값으로  output.dat입력
			byte arr[] = new byte[21];
			while (true) {
				int num = in.read(arr);
				if(num== -1)
					break;
			}
		}
		 catch (IOException ioe) {// read() 메소드가 발생한 예외 처리
			System.out.println("파일을 읽을 수 없습니다.");
		} finally { //파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 사용함
			//finally 에러가 발생 여부와 상관없이 수행가능
			try {
				if (in != null) {
					in.close(); // 파일을 닫는 명령문
					
					System.out.println("파일을 저장했습니다.");
				}
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
	}
}