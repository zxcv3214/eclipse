package ex06_1_array;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String[] args) {
		int sum=0;
		double avg=0;
		int[] score =new int[5];
		
		/* 1번째 방법
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 5개입력하세요>");
		score[0]=sc.nextInt();
		score[1]=sc.nextInt();
		score[2]=sc.nextInt();
		score[3]=sc.nextInt();
		score[4]=sc.nextInt();
		
		sum = score[0]+score[1]+score[2]+score[3]+score[4];
		avg = sum/(score.length);//
		
		
		System.out.println("총점=" + sum);
		System.out.println("평균=" + avg);
		sc.close();
		*/
		
		//2번째 방법
		System.out.println("정수 5개를 입력하세요>");
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<score.length; i++) {
			score[i]=sc.nextInt();
			sum +=score[i];
			avg = sum/score.length;
		}
		System.out.println("총점=" + sum);
		System.out.println("평균=" + avg);
		sc.close();
		
	}
}