package ex06_1_array;

import java.util.Iterator;
import java.util.Scanner;

public class TwoArrayExample1_int2 {
	public static void main(String args[]) {	
		String arr[][]= {
				{"과일", "사과"},
				{"아이스크림","메로나"},
				{"커피"}
				};
		
		for(String[] i : arr) { // arr 이 가르키고 있는 각 요소들은 일차원 배열입니다.
			for(String j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
			
		
	}			
}
