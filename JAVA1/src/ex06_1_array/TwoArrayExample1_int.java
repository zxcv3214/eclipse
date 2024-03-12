package ex06_1_array;

import java.util.Iterator;
import java.util.Scanner;

public class TwoArrayExample1_int {
	public static void main(String args[]) {	
		int arr[][]= {
				{10, 20},
				{30, 40},
				{50}
						};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
					
			}
			System.out.println();
		}
		System.out.println("=================");
	}			
}
