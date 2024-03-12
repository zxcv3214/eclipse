package ex19_03_Serialization_transient_no;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class ObjectOutputExample3 {
	public static void main(String[] args) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output3.dat"));
			BBSItem obj = new BBSItem("홍길동", "HTA-L3", "7월 모임", "집에서 할 수 있는 취미");
			System.out.println(obj);
			
			out.writeObject(obj);//객체를 직렬화 하는 부분
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