package ex05_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class IfExample1_3 {

	public static void main(String[] args) {
		
		InputStream in = System.in;
		Scanner sc= new Scanner(in);
		
		System.out.println("정수,변수를 입력하세요>");
		int num =sc.nextInt();
		/*
		if (num >= 10 && num < 100) {
			System.out.println(num + "값이 10 이상, 100미만입니다.");
		}else if (num >=100 && num <1000) {
			System.out.println(num + "값이 100이상 1000미만입니다.");
		}else if (num >=1000) {
			System.out.println(num + "값이 1000이상입니다.");
		}else {
			System.out.println(num + "값이 10미만입니다.");
		}
		*/
		if (num < 10 ) {
			System.out.println(num + "값이 10 이상, 100미만입니다.");
		}else if (num< 100) {
			System.out.println(num + "값이 100이상 1000미만입니다.");
		}else if (num < 1000) {
			System.out.println(num + "값이 1000이상입니다.");
		}else {
			System.out.println(num + "값이 10미만입니다.");
		}
		
		sc.close();
	}
	

}
