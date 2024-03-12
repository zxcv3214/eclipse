package ex05_5_for;

import java.util.Iterator;
import java.util.Scanner;

public class FowExample1_7 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단을 입력하세요>");
		int dan=0;
		dan = sc.nextInt();
		System.out.println(dan+"단");
		for(int i=1; i<10; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
	}
		sc.close();
}
}