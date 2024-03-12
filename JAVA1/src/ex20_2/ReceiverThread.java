package ex20_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread extends Thread{
	//메세지를 수신하는 스레드 클래스
	
	private Socket socket;
	
	public ReceiverThread (Socket socket) {
		this.socket=socket;
	}
//	public void run()
//    기능 : 클라이언트로부터 메시지를 수신(reader.readLine())해서 모니터로 출력합니다.
//           소켓의 연결이 끊어지면 수신된 문자열은 null입니다.
//           null이면 반복문을 벗어납니다.      
//           출력문)System.out.println("수신>" + str);
           
 public void run() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));

			while (!socket.isClosed()) {
				
				String str = reader.readLine();

				 //소켓의 연결이 끊어지면 null을 리턴합니다.
				if(str == null)
					break;
				
				// 수신된 메시지를 모니터로 출력합니다.
				System.out.println("수신>" + str);
			}
		} catch (Exception e) {			
			System.out.println(e.getMessage());
		} finally {
			try {
				reader.close();//소켓 닫기
			} catch (Exception e) {
				e.printStackTrace();;
			}
			
		}
	}
}

