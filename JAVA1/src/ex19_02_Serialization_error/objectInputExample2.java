package ex19_02_Serialization_error;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class objectInputExample2 {

	public static void main(String[] args) {
		
		ObjectInputStream in =null;
		try {
			in = new ObjectInputStream(new FileInputStream("output2.dat"));
			while (true) {
			
				GoodsStock gs = (GoodsStock) in.readObject();
				//System.out.printf("상품코드:"+gs.goodsCode+"\t"+"상품코드:"+gs.num+"\n");
				System.out.println(gs);
				
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
