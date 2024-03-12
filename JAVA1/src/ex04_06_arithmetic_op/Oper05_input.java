package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

//ctrl + shift + o
public class Oper05_input {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("정수를 입력 하세요>");
		int data = sc.nextInt();
		int pandan = data % 3;
		if (pandan == 0) {
			System.out.println(data + "(은)는 3의배수 입니다.");
		}else {
			System.out.println(data + "(은)는 3의배수가 아닙니다.");
		}
		sc.close();
	}
}
