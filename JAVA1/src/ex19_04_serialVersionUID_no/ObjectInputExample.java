package ex19_04_serialVersionUID_no;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class ObjectInputExample {

	public static void main(String[] args) {
		
		ObjectInputStream in =null;
		try {
			in = new ObjectInputStream(new FileInputStream("output10.dat"));
			
				Rectangle obj = (Rectangle) in.readObject();
				System.out.println("****역직렬화 합니다.****");
				System.out.println(obj);
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일로 존재 하지 않습니다.");
		}catch (IOException ioe) {
			System.out.println(ioe.getMessage());
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