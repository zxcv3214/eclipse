package ex06_1_array;

import java.util.Iterator;

public class ArrayTest01 {
	public static void main(String[] args) {
		int score[]= {95,70,80,75,100};
		int sum=0;
		for (int i=0; i<score.length; i++) {
		sum += score[i];
		System.out.println("score["+ i +"]="+score[i]);
		}
		System.out.println("총점="+ sum);
	}
}