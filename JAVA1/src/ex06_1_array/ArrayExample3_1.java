package ex06_1_array;

import java.util.Iterator;

public class ArrayExample3_1 {
	public static void main(String[] args) {
		int arr[]; 
		arr=new int[5]; 
						 
	//배열사용
	arr[0]=10;arr[1]=20;arr[2]=30;arr[3]=40;arr[4]=50;
	System.out.println("========1번쨰 방법========");
	//1번째 배열 방법
	System.out.println("arr[0]=" + arr[0]);
	System.out.println("arr[1]=" + arr[1]);
	System.out.println("arr[2]=" + arr[2]);
	System.out.println("arr[3]=" + arr[3]);
	System.out.println("arr[4]=" + arr[4]);
	
	System.out.println("========2번쨰 방법========");
	//2번째 배열 방법
	for (int i = 0; i < arr.length; i++) {
		System.out.println("arr[" + i + "]=" + arr[i]);	
	}
	System.out.println("========3번쨰 방법========");
	int[] arr1 = {10,20,30,40,50};
	for (int i = 0;  i< arr1.length; i++) {
		System.out.println("arr[" + i + "]" + "=" +arr1[i]);
	}
}
	

}
