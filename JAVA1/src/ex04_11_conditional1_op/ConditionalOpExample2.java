package ex04_11_conditional1_op;

import java.io.InputStream;
import java.util.Scanner;

public class ConditionalOpExample2 {

	public static void main(String[] args) {
		
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		
		System.out.println("3개의 정수를 입력하세요>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		/*int max = (num1 > num2) ? num1 : num2;
		 * max = (max > num3) ? max : num3;
		 * 
		 * int min = (num1 < num2) ? num1 : num2;
		 * min = (min < num3) ? min : n3;
		 * 
		 * System.out.println("max =" + max);
		 * System.out.println( num1 + "," + num2 + "," + num3 + "중 가장 큰 수"
		 * 						+ max + "입니다.");
		 * System.out.println("min =" + min);
		 * System.out.println( num1 + "," + num2 + "," + num3 + "중 가장 작은 수"
		 * 						+ min + "입니다.");
		 * */
		int min, max;
		min= (num1<num2)&&(num1<num3)?num1:(num3<num2?num3:num1);
		//min
		
		max=(num1>num2)&&(num1>num3)?num1:(num3>num2?num3:num2);
		//max
		System.out.println("최소값 =" + min);
		System.out.println("최대값 =" + max);
		
		sc.close();
	}

}
