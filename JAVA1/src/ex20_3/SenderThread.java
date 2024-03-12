package ex20_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread {

	private Socket socket;
	private String name; //추가
	
	public SenderThread(Socket socket, String name) {// 수정
		this.socket=socket;
		this.name=name;//추가
	}
	
	public void run() {
    	PrintWriter writer=null; //자료를 내보낼때
    	BufferedReader reader=null; //자료를 받을때
        try {
        	//키보드로 값을 받는 상태
            reader = new BufferedReader(new InputStreamReader(System.in));
            //값을 내보낼때
            writer = new PrintWriter(socket.getOutputStream());
            //추가
            //제일 먼저 서버로 대화명을 송신한다.
            writer.println(name);
            writer.flush();
          //키보드로부터 문자열을 입력받습니다.
            while (!socket.isClosed()) {
                String str = reader.readLine();
                //사용자가 "bye"라고 입력하면 반복문을 빠져나갑니다.
                if (str.equals("bye"))
                   break;
                //입력된 문자열을 송신합니다.
                writer.println(str);
                writer.flush();
            }
        }
        catch (Exception e) {        	
            System.out.println(e.getMessage());
        }   
        finally {
            try {
                writer.close();
            }
            catch (Exception e) {
            	e.printStackTrace();
            }
            try {
                reader.close();
            }
            catch (Exception e) {
            	e.printStackTrace();
            }
        }
    }
}
