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

public class ForExample1 {
	public static void main(String args[]) {	
		int arr[] = {10,20,30,40,50};
		
		for(int cnt=0; cnt<=arr.length-1; cnt++) {
			System.out.println(arr[cnt]);
		}
			System.out.println("End.");
		}
	
	}