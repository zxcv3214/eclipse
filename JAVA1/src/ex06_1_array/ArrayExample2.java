package ex06_1_array;

import java.util.Iterator;

public class ArrayExample2 {
	public static void main(String[] args) {
		int arr[]; //배열 변수 선언
		arr=new int[10]; //배열 생성 : 생성과 동시에 자동적으로 자신의 타입에
						 // 해당하는 기본값으로 초기화 됩니다.
		
	System.out.println("============10개의 println()이용============");
	System.out.println("arr[" + 0 + "]=" + arr[0]);
	System.out.println("arr[" + 1 + "]=" + arr[1]);
	System.out.println("arr[" + 2 + "]=" + arr[2]);
	System.out.println("arr[" + 3 + "]=" + arr[3]);
	System.out.println("arr[" + 4 + "]=" + arr[4]);
	System.out.println("arr[" + 5 + "]=" + arr[5]);
	System.out.println("arr[" + 6 + "]=" + arr[6]);
	System.out.println("arr[" + 7 + "]=" + arr[7]);
	System.out.println("arr[" + 8 + "]=" + arr[8]);
	System.out.println("arr[" + 9 + "]=" + arr[9]);
	
	System.out.println("============for문 이용============");
	for(int i=0; i<10; i++) {
		System.out.println("arr[" + i + "]=" + arr[i]);
		
		
	System.out.println("============length 이용============");
	System.out.println(arr.length);// 배열의 크기를 출력한다.
	//arr.length:배열의 크기
		for(int j = 0; j <arr.length; j++)
			System.out.println("arr[" + j + "]=" + arr[j]);
	}
}

}
