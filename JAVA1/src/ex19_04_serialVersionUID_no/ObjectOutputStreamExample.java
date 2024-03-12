package ex19_04_serialVersionUID_no;

import java.io.*;


import ex19_03_Serialization_transient_no.BBSItem;
public class ObjectOutputStreamExample {

	public static void main(String[] args) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output10.dat"));
			Rectangle obj= new Rectangle(100,200);
			System.out.println(obj);
			out.writeObject(obj);
		} 
		catch (IOException ioe) {

			System.out.println("파일로 출력할 수 없습니다.");
		}
		finally {
			try {
				if(out != null)
					out.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
