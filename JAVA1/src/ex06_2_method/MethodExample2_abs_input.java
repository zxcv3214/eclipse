package ex06_2_method;

import java.util.Scanner;

/*
 * 1.input()
 *   기능 : 정수를 입력 받는 메서드
 *   반환형 : 입력 받은 정수형을 리턴합니다.
 *   
 * 2.abs(int data)
 *   기능 : 절대값 구하기 (양수 -> 양수, 음수 -> 음수)
 *   매개변수 : 정수형 한 개
 *   반환형 : 매개변수로 입력받은 정수형 값을 절대값으로 구한 뒤 리턴합니다.
 *   
 *   출력결과
 *   정수를 입력하세요? -3
 *   절대값 : 3
 *   
 *   출력결과)
 *   정수를 입력하세요? 3
 *   절대값: 3
 */	
public class MethodExample2_abs_input {
	
public static int input() {    
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요?");
		int data=sc.nextInt();
		sc.close();
	
		return data;
	}

	public static int abs(int data) {//절대값 구하는 메소드
		if(data<0)
			data = -data;
		return data;
}
	public static void main(String[] args) {
		int inputdata = input();
		int result = abs(inputdata);
		//int result = abs(input());
		
		System.out.println("절대값 :" +result);
	}
	
}

