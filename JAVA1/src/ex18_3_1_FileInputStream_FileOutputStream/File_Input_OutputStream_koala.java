package ex18_3_1_FileInputStream_FileOutputStream;

import java.io.*;

public class File_Input_OutputStream_koala {

	public static void main(String[] args) {
		String origialFileName= "E:/temp/koala.jpg";
		String targetFileName="E:/temp2/koala.copy.jpg";
		try (	FileInputStream fis=new FileInputStream(origialFileName);
				FileOutputStream fos=new FileOutputStream(targetFileName);
			)	
			{
			{
				byte[] readBytes = new byte[1024];
				while (fis.read(readBytes) != -1) {
					//write(byte[] b)
					fos.write(readBytes);
				}
				System.out.println("파일이 복사되었습니다.");
			}
		}catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} 
		 catch (IOException ioe) {// read() 메소드가 발생한 예외 처리
			System.out.println("파일을 읽을 수 없습니다.");
		}
		
		finally { //파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 사용함
			System.out.println("IOException");
		}
	}
}
