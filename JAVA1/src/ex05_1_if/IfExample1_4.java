package ex05_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class IfExample1_4 {

	public static void main(String[] args) {
		
		InputStream in = System.in;
		Scanner sc= new Scanner(in);
		
		System.out.println("점수를 입력하세요>");
		int num =sc.nextInt();
		int sum= num/10;
		/*
		if(num>90 && num<=100) {
			System.out.println(num + "점" +"A학점입니다.");
		}else if (num>80) {
switchExample1_char.java			System.out.println(num +"점" + "B학점입니다.");
		}else if (num>70) {
			System.out.println(num +"점" + "C학점입니다.");
		}else if (num>60) {
			System.out.println(num +"점" + "D학점입니다.");
		}else {
			System.out.println(num +"점" + "F학점입니다.");
		}
		*/
		String grade="F";
		if (sum ==9 || sum== 10) {
			grade="A";
		}else if (sum ==8) {
			grade="B";
		}else if (sum ==7) {
			grade="C";
		}else if (sum ==6) {
			grade="D";
		}
		System.out.println(grade +"학점");
		sc.close();
	}
	

}
