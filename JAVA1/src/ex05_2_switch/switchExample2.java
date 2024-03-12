package ex05_2_switch;

import java.io.InputStream;
import java.util.Scanner;

public class switchExample2 {

	public static void main(String[] args) {
		InputStream in = System.in;
		Scanner sc= new Scanner(in);
		
		System.out.println("점수를 입력하세요>");
		int num =sc.nextInt();
		String grade="F";
		
		num= num / 5;
		switch (num) {
		case 20:
		case 19:
			grade="A+";
			break;
		case 18:
			grade="A0";
			break;
		case 17:
			grade="B+";
			break;
		case 16:
			grade="B0";
			break;
		case 15:
			grade="C+";
			break;
		case 14:
			grade="C0";
			break;
		case 13:
			grade="D+";
			break;
		case 12:
			grade="D0";
			break;
			default :
				System.out.println(grade+"학점");
		}
	
}
}
