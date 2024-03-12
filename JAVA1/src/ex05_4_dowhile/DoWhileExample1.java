package ex05_4_dowhile;

public class DoWhileExample1 {

	public static void main(String[] args) {
		int cnt=1;
		do {
			System.out.println(cnt); //1,2,3,4 ~ 10
		} while (cnt++ < 10); //1<10, 2<10, 3<10, 4<10~ 10<10
		System.out.println("끝");
	}

}
