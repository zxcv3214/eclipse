//Runnble인터페이스를 이용한 멀티스레드 프로그램
package ex17_04_Runnable_Interface;

public class MultithreadExample1 {

	public static void main(String[] args) {
		//Runnble인터페이스를 구현하는 클래스의 객체를 생성해서 Thread 생성자의 파라미터로 사용합니다
		SmallLetters small = new SmallLetters();
		Thread th1 = new Thread(small);//스레드 생성
		th1.start();
		
		char arr[] = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ',
						'ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
		for(char ch : arr)
			System.out.print(ch);
		
	}

}
