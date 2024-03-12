package ex20_2_server;

import java.net.Socket;

import ex20_2.ReceiverThread;
import ex20_2.SenderThread;

public class ClinetExample3 {

	public static void main(String[] args) {
		System.out.println("여기는 클라이언트입니다.");
		Socket socket=null;
		try {
			socket = new Socket("192.168.0.42",9002);
			//두 개의 스레드를 생성
			Thread thread1 = new ReceiverThread(socket);
			Thread thread2 = new SenderThread(socket);
			//두 개의 스레드를 시작
			thread1.start();
			thread2.start();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//socket 닫으면 안됩니다.
	}
}
