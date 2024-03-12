package ex19_03_Serialization_transient_no;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class ObjectInputExample3 {

	public static void main(String[] args) {
		
		ObjectInputStream in =null;
		try {
			in = new ObjectInputStream(new FileInputStream("output3.dat"));
			while (true) {
				BBSItem bb =(BBSItem) in.readObject();
				System.out.println(bb);	
				
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일로 존재 하지 않습니다.");
		}catch (EOFException eofe) {//파일로부터 더 이상 읽을 객체가 없을 때 발도하는 원리
			System.out.println("끝");
		}catch (IOException ioe) {
			System.out.println("파일로 읽을 수 습니다.");
		}catch (ClassNotFoundException ioe) {
			System.out.println("해당 클래스가 존재할 수 없습니다.");
		}
		finally {
			try {
				if(in != null)
					in.close();// 3.파일을 닫기
			} catch (IOException e) {
				System.out.println("파일 닫는 중 오류 발생");
			}
		}
	}
}