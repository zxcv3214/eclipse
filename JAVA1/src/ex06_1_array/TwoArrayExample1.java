package ex06_1_array;

import java.util.Iterator;
import java.util.Scanner;

public class TwoArrayExample1 {
	public static void main(String args[]) {	
		int table[][] = new int [3][4];//3행 4열의 크기로 생성
		
		table[0][0]=10;
		table[1][1]=20;
		table[2][3]=table[0][0]+table[1][1];
		
		System.out.println(table[0][0]);
		System.out.println(table[1][1]);
		System.out.println(table[2][3]);
		
		System.out.println("table[0][0] = "+ table[0][0]);
		System.out.println("table[0][1] = "+ table[0][1]);
		System.out.println("table[0][2] = "+ table[0][2]);
		System.out.println("table[0][3] = "+ table[0][3]);
		
		System.out.println("table[1][0] = "+ table[1][0]);
		System.out.println("table[1][1] = "+ table[1][1]);
		System.out.println("table[1][2] = "+ table[1][2]);
		System.out.println("table[1][3] = "+ table[1][3]);
		
		System.out.println("table[2][0] = "+ table[2][0]);
		System.out.println("table[2][1] = "+ table[2][1]);
		System.out.println("table[2][2] = "+ table[2][2]);
		System.out.println("table[2][3] = "+ table[2][3]);
		
		System.out.println("===========================");
		
		for (int i = 0; i <4; i++) {
			System.out.println("table[0][" + i + "] =" + table[0][i]);	
		}
		for (int i = 0; i <4; i++) {
			System.out.println("table[0][" + i + "] =" + table[0][i]);
		}
		for (int i = 0; i <4; i++) {
			System.out.println("table[0][" + i + "] =" + table[0][i]);
		}
		for (int j = 0; j <3; j++) {
			System.out.println("table[0][" + j + "] =" + table[1][j]);
		}
		System.out.println("===========================");
		
		for(int i=0; i<3; i++)
			for(int j=0; j<4; j++)
				System.out.println("table["+ i +"][" + j + "] =" + table[i][j]);
		
	}
}