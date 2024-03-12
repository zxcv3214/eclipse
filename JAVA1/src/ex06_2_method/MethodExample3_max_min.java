package ex06_2_method;

import java.util.Scanner;

/*
 * 1.최댓값을 구하는 메서드  max
 *  
 * 2.최솟값을 구하는 메서드 min
 *  
 */	
public class MethodExample3_max_min {

	public static void main(String[] args) {
		System.out.print("두 개의 정수를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		int data1=sc.nextInt();
		int data2=sc.nextInt();
		
		int max2= max(data1, data2);
		int min2= min(data1, data2);
		//max2는 변수, max(data1,data2)의 max는 메소드 이름
		System.out.println("max = " +  max2);
		System.out.println("min = " +  min2);
		sc.close();
		
		
	}

	private static int max(int a, int b) {
		return a>b?a:b;
	}

	private static int min(int a, int b) {
		return a<b?a:b;
	}
}

