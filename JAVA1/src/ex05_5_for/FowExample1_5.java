package ex05_5_for;

import java.util.Iterator;

public class FowExample1_5 {
	public static void main (String args[]) {
		int dan=2;
		System.out.println(dan+"단");
		for(int i=1; i<10; i++) {
			System.out.println(dan+"*" +i+ "="+ dan*i);
		}
		int dan1=3;
		System.out.println(dan1+"단");
		for(int i=1; i<10; i++) {
			System.out.println(dan1+"*" +i+ "="+ dan1*i);
		}
		int dan2=4;
		System.out.println(dan2+"단");
		for(int i=1; i<10; i++) {
			System.out.println(dan2+"*" +i+ "="+ dan2*i);
		}
	}
}