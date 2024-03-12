package ex05_6_break;

import java.util.Scanner;

public class BreakExample4 {
	public static void main(String[] args) {
		int sum1, sum2, result = 0;
		String op, ox;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("수1>");
			sum1=sc.nextInt();
			
			System.out.println("수2>");
			sum2=sc.nextInt();
			
			System.out.println("연산자>");
			op=sc.next();
			
			switch (op) {
			case "+" :
				result=sum1+sum2;
				break;
			case "-" :
				result=sum1-sum2;
				break;
			case "*" :
				result=sum1*sum2;
				break;
			case "/" :
				result=sum1/sum2;
				break;
			case "%" :
				result=sum1%sum2;
			}
			System.out.println(sum1+op+sum2+"="+result);
		System.out.println("계속 입력하시겠습니다?(N(n))종료. 그외 문자는 계속 입력 가능");
			ox=sc.next();
		} while (!ox.equals('N') || ox.equals('n'));
		System.out.println("끝");
		
		sc.close();
	}
}
