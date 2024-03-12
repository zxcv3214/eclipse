//입력 받은 수가 1~10사이면 "1~10 사이의 수 입니다. 출력
//아니면 "1~10 사이의 수가 아닙니다." 출력
package ex04_10_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample3 {
public static void main(String args[]) {
	InputStream in = System.in;
	Scanner sc = new Scanner(in);
	int num;
	
	System.out.println("나이를 입력하세요>");
	num =sc.nextInt();
	/*if (num>10 && num < 19) {
		System.out.println("10대");
	}else if (num>10 && num<19) {
		System.out.println("10대");
	}else if (num>20 && num<29) {
		System.out.println("20대");
	}else if (num>30 && num<39 ) {
		System.out.println("30대");
	}else if (num>40 && num<49) {
		System.out.println("40대");
	}else {
		System.out.println("10대미만");
	}*/
	
	if (num>=1 && num<=9) {
		System.out.println("10대 미만");
	}else {
		System.out.println(num/10 * 10 + "대");
	}
	sc.close();
	}
}