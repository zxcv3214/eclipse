package ex06_1_array;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTest04 {
	public static void main(String[] args) {
		int[] data =new int[5];
		
		System.out.println("정수 5개를 입력하세요>");
		Scanner sc = new Scanner(System.in);
		data[0]=sc.nextInt();
		int max=data[0], min=data[0];
		
		for (int i = 1; i < data.length; i++) {
			data[i]=sc.nextInt();
			if(data[i]> max) max=data[i];
			if(data[i]< min) min=data[i];
		}
	
		System.out.println("max="+ max);
		System.out.println("min="+ min);
		sc.close();
	}
}