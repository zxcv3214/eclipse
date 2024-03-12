package test;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Scanner;
//sum1= 10, sum2= 20 인 경우
public class test9 {
	public static void main(String[] args) {
		
		int	sum1= 10, sum2= 20, imsi;

		//1단계 sum2에 원래 값은 사라진다.
		sum2=sum1;
		
		//2단계 sum2에 값을 다른 곳에 보관해 준다.
		imsi=sum2;
		
		//sum1의 값을 sum2의 원래값으로 설정한다.
		sum1=imsi;
		
		System.out.println(sum1);
		System.out.println(sum2);
		
	}
}
