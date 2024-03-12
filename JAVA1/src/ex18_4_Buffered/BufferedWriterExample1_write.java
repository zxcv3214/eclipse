package ex18_4_Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample1_write {

	public static void main(String[] args) {
		String message = "하하입니다. \n오늘도 화이팅입니다.";
		
		BufferedWriter writer =null;
		try {
			writer = new BufferedWriter
					(new FileWriter
					("E:\\jaeyun\\HTML\\src\\ex18_4_Buffered\\output2.dat"));
			writer.write(message);
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}finally {
			try {
				if(writer != null)
					writer.close();
			} catch (IOException e) {
				System.out.println("닫는 중 오류입니다.");
			}
		}
	}
}
