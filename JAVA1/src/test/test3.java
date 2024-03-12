package test;

import java.io.InputStream;
import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		
		InputStream in = System.in;
		Scanner sc= new Scanner(in);
		
		System.out.println("정수를 입력하세요>");
		int page=sc.nextInt();
		
		int startpage = (page-1)/10;
		System.out.println(startpage*10);
		sc.close();
		
	}
}