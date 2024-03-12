package test;

import java.io.InputStream;
import java.util.Scanner;

//ctrl + shift + o
public class Comcate1_test2 {
	public static void main(String[] args) {
		
		InputStream is= System.in;
		
		Scanner sc= new Scanner(is);
		System.out.println("정수를 입력하세요.>");
		int num1 = sc.nextInt();
		
		int outnum= (num1-1)/10; //(변수에 -1를 하면 출력값을 -1빼고가능함)
		System.out.println(outnum);
		sc.close();
		
		/*
		Scanner sc= new Scanner(is);
		
		System.out.println("입력값>");
		int num = sc.nextInt();
		if (num > 30 ) {
			System.out.println("출력값>3");
		}else if(num > 20){
			System.out.println("출력값>2");
		}else if (num > 10) {
			System.out.println("출력값>1");
		}else
			System.out.println("출력값>0");
		sc.close();
		*/
		
	 
	}
}
