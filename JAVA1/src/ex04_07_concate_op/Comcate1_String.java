package ex04_07_concate_op;

import java.io.InputStream;
import java.util.Scanner;

//ctrl + shift + o
public class Comcate1_String {
	public static void main(String[] args) {
		String str1= "hap"+3+4;//문자열이 나와서 문자열로 출력
		System.out.println(str1);
		
		String str2= 3+4+"hap";//숫자열 시작해서 더한다음 문자열로 출력
		System.out.println(str2);
		
		String str3="hap=" +(3+4);//가로우선순위로 문자열 출력
		System.out.println(str3);
	}
}
