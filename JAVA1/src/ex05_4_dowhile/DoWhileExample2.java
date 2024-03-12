package ex05_4_dowhile;

import java.util.Scanner;

public class DoWhileExample2 {

	public static void main(String[] args) {
		/*지역입려 (exit=q)서울
		 * 입력하신 지역은 서울입니다.
		 * 지역입력 (exit=q)부산
		 * 입력하신 지역은 부산입니다.
		 * 지역 입력 (exit=q)>q
		 * 입력하신 지역은 q입니다.
		 * 끝
		 * */
		String location="";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("지역입력(exit=q)>");
			location = sc.next();
			
			System.out.println("입력하신 지역은 " + location+ "입니다.");
			} while (!location.equals("q"));
	System.out.println("끝");
	sc.close();
	}

}
