package test;

import java.io.InputStream;
import java.util.Scanner;

//ctrl + shift + o
public class Comcate1_test1 {
	public static void main(String[] args) {
		InputStream is= System.in;
		Scanner sc= new Scanner(is);
		
		System.out.println("입력값>");
		int num = sc.nextInt();
		if (num >= 30 ) {
			System.out.println("출력값>3");
		}else if(num >= 20){
			System.out.println("출력값>2");
		}else if (num >= 10) {
			System.out.println("출력값>1");
		}else
			System.out.println("출력값>0");
		sc.close();
	}
}
