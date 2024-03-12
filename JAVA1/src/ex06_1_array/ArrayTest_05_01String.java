/*
 * 실행1. 배열 요소의 값 중 입력한 경우
 * 실행결과화면)
 * 검색할 이름을 입력하세요?
 * 이름:홍길동
 * 홍길동는(은) 배열의 인덱스 2에서 찾았습니다.
 * 
 * 실행2. 배열 요소의 값이 아닌 데이터를 입력한 경우
 * 실행결과화면)
 * 검색할 이름을 입력하세요?
 * 이름:HTA
 * HTA는(은) 배열방에서 찾지 못했습니다.
 * */
package ex06_1_array;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTest_05_01String {
	public static void main(String[] args) {	
		String names[] = {"홍길동","전우치","홍길동","세종대왕","김길동"};
		Scanner sc = new Scanner(System.in);
		
		//몇 번 방에 들어있는지 확인하는 변수로 초기값-1은 인덱스와 겹치지 않는 수를 사용
		int index=-1;
		
		System.out.println("검색할 이름을 입력하세요>");
		System.out.print("이름:");
		String inputname = sc.next();
		
		for (int i = 0; i < names.length; i++) {//0 1 2 3 4
			if(inputname.equals(names[i])) {
				index= i;
				break;
				}
			}
		//입력한 이름과 배열에 저장된 이름을 찾았을 때
		if(index >= -1) {
			System.out.println(inputname + "는(은) 배열의 인덱스"
					+ index + "에서 찾았습니다.");
		}else { //찾지 못했을 때
			System.out.println(inputname + "는(은) 배열방에서 찾지 못했습니다.");
		}
		sc.close();
		}
	}