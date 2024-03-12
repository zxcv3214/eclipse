package ex18_4_Buffered;

import java.io.*;


public class BufferedReaderExample2_readLine {

	public static void main(String[] args) {
		BufferedReader reader =null;
		String message = null;
		try {
			reader = new BufferedReader(new FileReader("E:\\jaeyun\\HTML\\src\\ex18_4_Buffered\\output2.dat"));
			
			//더이상 읽을 데이터가 없는 경우 null를 리턴합니다.
			while ((message = reader.readLine()) != null) {
				System.out.println(message);
			}
			
		}catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}finally {
			try {
				if(reader != null)
					reader.close();
			} catch (IOException e) {
				System.out.println("닫는 중 오류입니다.");
			}
		}
	}
}
