package ex20_3;

import java.net.Socket;

public class CilnetExample4 {
	public static void main(String[] args) {
		//args 파라미터로 대화명을 입력 받기
		if (args.length != 1) {
			System.out.println("대화명을 입력하세요");
			return;
		}
		try {
			System.out.println("================================");
			System.out.println("나의 대화명은 " + args[0] + "입니다.");
			System.out.println("================================");
			//서버와 연결을 맺기
			Socket socket = new Socket("192.168.0.42", 9002);
			
			//메세지 송신 스레드 생성
			Thread thread1 = new SenderThread(socket, args[0]);
			
			//메세지 수신 스레드 생성
			Thread thread2 = new ReceiverThread(socket);
			
			//스레드 시작
			thread1.start();
			thread2.start();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//socket 닫으면 안됩니다.
	}
}
