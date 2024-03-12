package ex05_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class IfExample1_5 {

	public static void main(String[] args) {
		
		InputStream in = System.in;
		Scanner sc= new Scanner(in);
		
		System.out.println("점수를 입력하세요>");
		int num =sc.nextInt();
		
		if(num>95 && num<=100) {
			System.out.println(num + "점" +"A+학점입니다.");
		}else if (num>90) {
			System.out.println(num +"점" + "A0학점입니다.");
		}else if (num>85) {
			System.out.println(num +"점" + "B+학점입니다.");
		}else if (num>80) {
			System.out.println(num +"점" + "B0학점입니다.");
		}else if (num>75) {
			System.out.println(num +"점" + "C+학점입니다.");
		}else if (num>70) {
			System.out.println(num +"점" + "C0학점입니다.");
		}else if (num>65) {
			System.out.println(num +"점" + "D+학점입니다.");
		}else if (num>60) {
			System.out.println(num +"점" + "D0학점입니다.");
		}else {
			System.out.println(num +"점" + "F학점입니다.");
		}
		
		
		sc.close();
	}
	

}
