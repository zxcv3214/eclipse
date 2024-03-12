//알바벳과 숫자를 동시에 출력하는 멀티스레드 프로그램
/*
 * JVM이 쓰레드에 할당하는 시간과 실행 순서는 하드웨어의 성능이나 시스템 환경에
 * 	따라 달라 실행 결과는 매번 다른 결과가 나올 수 있습니다.
 * 
 * */
/*
	 * start() 설명 :
	 * Causes this thread to begin execution; 
	 * the Java Virtual Machinecalls the run method of this thread.
	 * 
	 * => this thread(Thread thread = new DigitThread()의 thread)가 실행을 시작하도록 합니다.
	 *    java 가상 머신이 스레드의 run() 메소드를 호출합니다.
	 *    
	 *  - 
	 *    start()를 통해서 run() 실행 합니다.
	 *    start method는 java.lang.Thread 클래스에 메소드입니다.
	 *  
	 * 	  thread.run(); 이렇게 호출 하지 않는다.
	 */
		
package ex17_01_Thread;

import java.util.Iterator;

public class MultithreadExample1 {

	public static void main(String[] args) {
		Thread thread = new DigitThread();//쓰레드를 생성
		thread.start();
		
			for(char ch= 'A'; ch <= 'Z'; ch++)
				System.out.print(ch);
			
			System.out.println("스레드 이름 : " + Thread.currentThread().getName());
		

	}

}
