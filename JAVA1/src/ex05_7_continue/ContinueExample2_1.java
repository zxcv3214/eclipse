package ex05_7_continue;

public class ContinueExample2_1 {
	//contunue 잘못사용된 예
	//0 1 2 3 4 만 출력
	public static void main(String args[]) {
		int cnt=-1;
		while (cnt < 10) {
			cnt++;
			if (cnt == 5)
				continue;
			System.out.println(cnt);
		}
		System.out.println("끝");
	}
}