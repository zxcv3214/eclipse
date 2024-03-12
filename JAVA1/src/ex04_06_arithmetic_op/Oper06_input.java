package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

//ctrl + shift + o
public class Oper06_input {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("정수1를 입력 하세요>");
		int a = sc.nextInt();
		System.out.println("정수2를 입력 하세요>");
		int b = sc.nextInt();
		System.out.println("연산자(+)를 입력하세요>");
		String c = sc.next();
		String c1 = "+";
		if(c.equals(c1)) {
			int result = a+b;
			System.out.println(a+"+"+b + "=" + result);
		}else {
			System.out.println("연산자를 사용해주세요.");
		}
		sc.close();
	}
}
