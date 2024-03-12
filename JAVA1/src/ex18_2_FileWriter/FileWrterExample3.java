package ex18_2_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrterExample3 {

	public static void main(String[] args) {
		FileWriter writer = null;
		String message= null;
		try {
			// turn : append(원래 있던 파일 내용 뒤에 추가로 쓴다.)
			// false: overwrie(덮어 쓰기 한다.)
			writer = new FileWriter("E:\\jaeyun\\HTML\\src\\ex18_2_FileWriter\\ggdan.txt", true);// 파일을 연다
			// public FileWriter(String fileName)throws IOException
			// FileWriter 생성자는 IOException에러를 발생하기 때문에 IOException 처리문이 있어야 합니다.
			int i,j;
			for(int k=2; k<10; k++) {
				message=("["+k+"단]" +"\t");
				writer.write(message);	
			}//한줄먼저 실행해서 보고 다음 식을 계산하자
			for(j=1;j<10;j++) {//고정숫자는 바깥쪽
				writer.write("\n");
				for(i=2;i<10;i++) {//변동숫자는 안쪽
					message=(i+"*"+j+"="+(i*j)+"\t");
					writer.write(message);
				}
			}
		} catch (IOException ioe) {
			System.out.println("파일로 출력 할 수 없습니다.");
		} finally {
			try {
				if (writer != null)
					writer.close();// 파일을 닫습니다.(종료)
			} catch (IOException e) {
				System.out.println("파일 닫는 중 오류입니다.");
			}
		}
	}

}
