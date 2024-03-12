package ex06_1_array;

import java.util.Iterator;
import java.util.Scanner;

public class TwoArrayExample3 {
	public static void main(String args[]) {	
		int table[][]= {
				{1, 2, 3, 4 },
				{5, 6, 7, 8 },
				{9, 10, 11, 12}
						};
		for(int i=0; i<3; i++)
			for(int j=0; j<4; j++)
				System.out.println("table["+ i +"][" + j + "] =" + table[i][j]);
		System.out.println("===============2번===============");
	for(int i=0; i<table.length; i++)
		for(int j=0; j<table[i].length; j++)
			System.out.println("table["+ i +"][" + j + "] =" + table[i][j]);
		
	}
}