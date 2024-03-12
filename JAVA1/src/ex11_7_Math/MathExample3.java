//0이상 1미만의 난수 발생하는 프로그램
package ex11_7_Math;

import java.util.Arrays;
import java.util.Random;

public class MathExample3 {

	public static void main(String[] args) {
		
		// 1부터 45까지 난수 발생하고 중복제거 정렬하기
		int[] num2 = new int[6];// 중복된 데이터를 확인하고자 배열을 사용함

		for (int i = 0; i < num2.length; i++) {
			num2[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (
		num2[i] == num2[j]) {
					i--;
					break;
				} // if 문
			} // j for문
		} // i for문
		System.out.println("\n==================정렬 후===================");
		for (int i = 0; i < num2.length; i++) {
			for (int j = 1; j < num2.length; j++) {
				int imsi = num2[i];{
				num2[i] = num2[j];
				num2[j] = imsi;
			}
		}
	}
	for (int k : num2) {
		System.out.print(k + "\t");

		}
	}
}
