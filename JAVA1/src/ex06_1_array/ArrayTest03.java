package ex06_1_array;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTest03 {
	public static void main(String[] args) {
		int data[] ={20,30,40,80,10};
		//max, min의 초기값으로 배열의 값 중에서 설정합니다.
		int max=data[0];
		int min=data[0];
		for (int i = 0; i < data.length; i++) {
			if(data[i]> max) max=data[i];
			if(data[i]< min) min=data[i];
		}
		/*
		 * for(int i = 1; i<data.length; i++) {
		 * max= (max > data[i]) ? max : data[i];
		 * min= (min < data[i]) ? min : data[i];
		 * }
		 * */
		
		System.out.println("max="+ max);
		System.out.println("min="+ min);
	}
}