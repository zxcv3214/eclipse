package ex06_2_method;

import java.util.Scanner;

/*
 * 1.최댓값을 구하는 메서드  max
 *  
 * 2.최솟값을 구하는 메서드 min
 * 
 * 3.input()
 *   기능 : 배열 data의 모든 데이터 중에서 최솟값을 구합니다.
 *   반환값 : 최솟값
 *   반환형 : int
 */	
public class MethodExample5_array {
	
	private static int max(int[] data) {
		int max=data[0];
		for(int i=1; i<data.length; i++) {
			if(max < data[i])
				max = data[i];
	}
		return max;
}
	private static int min(int[] data) {
		int min=data[0];
		for(int i=1; i<data.length;i++) {
			if(min > data[i])
				min = data[i];
	}
		return min;
}
	private static int[] input() {
		int data[] = new int[5];
		System.out.print("5개의 정수를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<data.length; i++) {
			data[i]=sc.nextInt();
		}
		sc.close();
		return data;
	}
	
	public static void main(String[] args) {
		int[] data=input();
		
		int max2 = max(data);
		int min2 = min(data);
		
		System.out.println("max = " + max2);
		System.out.println("min = " + min2);
	}
	
	
		
	
}

