package ex06_1_array;

import java.util.Iterator;
import java.util.Scanner;

public class TwoArrayExample2 {
	public static void main(String args[]) {	
		int[] a= {10,2,33,4,25,66,8,5,72,1};
		
		for (int i = 0; i < a.length-1; i++) {
			for(int j =i+1; j <a.length; j++) {
				if(a[i] > a[j]) {//오름차순
				int tmp =a[i];
				a[i]=a[j];
				a[j]=tmp;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			if (i+1 != a.length) {
				System.out.print(",");
			}
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for(int j =i+1; j <a.length; j++) {
				if(a[i] < a[j]) {//내림차순
				int tmp =a[i];
				a[i]=a[j];
				a[j]=tmp;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			if (i+1 != a.length) {
				System.out.printf(",");
			}
		}
	}
}