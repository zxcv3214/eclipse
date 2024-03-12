package ex05_7_continue;

public class ContinueExample1 {
	//0부터 9까지 1씩 증가되는 출력문 작성
	//단, 5는 출력되지 않는다.
	public static void main(String args[]) {
		for(int cnt=0; cnt < 10; cnt++) {
			if(cnt != 5)
				System.out.println(cnt);
		}
		System.out.println("=======================");
		
		for(int cnt=0; cnt <10; cnt++) {
			if(cnt == 5)
				continue;
			System.out.println(cnt);
		}
		System.out.println("End");
	}
}
