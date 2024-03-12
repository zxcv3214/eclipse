package ex18_2_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrterExample1 {

	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			//생성자의 매개변수가 열 파일의 이름을 의미합니다.
			//output.txt파일이 없는 경우는 파일 생성 후 파일이 열립니다.
			//만약 이름이 있는 경우 기존 파일이 지워집니다.
			writer = new FileWriter("output.txt");
			//public FileWriter(String fileName)throws IOException
			//FileWriter 생성자는 IOException에러를 발생하기 때문에
			//IOException 처리문이 있어야 합니다.
			
			char arr[] = {'내','꺼','인',' ','듯',' ','내','꺼',' ','아','닌',
					'내','꺼',' ','같','은',' ','너'
			};
			//파일에 반복해서 문자들을 씁니다.
			for (int cnt =0; cnt<arr.length; cnt++) {
				writer.write(arr[cnt]);
				//위 두 문장과 같은 의미
				//writer.write(arr);
			}
		} catch (IOException ioe) {
			System.out.println("파일로 출력 할 수 없습니다.");
		}finally {
			try {
				if(writer !=null)
					writer.close();//파일을 닫습니다.(종료)
			} catch (IOException e) {
				System.out.println("파일 닫는 중 오류입니다.");
			}
		}
	}

}
