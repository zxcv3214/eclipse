package ex20_2_server;

import java.net.*;

import ex20_2.ReceiverThread;
import ex20_2.SenderThread;

public class ServerExample3 {

	public static void main(String[] args) {
		System.out.println("여기는 서버입니다.");
		ServerSocket serversocket = null;
		Socket socket = null;
		try {
			serversocket = new ServerSocket(9002);
			socket = serversocket.accept();
			System.out.println("====================접속 정보====================");
			System.out.println(socket.getInetAddress().getHostAddress() + "에서 접속하였습니다.");
			System.out.println("===============================================");
			//두 스레드를 생성
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			
			//두 스레드를 시작
			thread1.start();
			thread2.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			
		}try {
			serversocket.close();
		} catch (Exception e) {
			System.out.println("서버 소켓 닫는 중 에러 발생했습니다.");
		}
	}
}
