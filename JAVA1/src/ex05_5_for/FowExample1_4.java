package ex05_5_for;

import java.util.Iterator;

public class FowExample1_4 {
	public static void main (String args[]) {
		
		//1~10까지 홀수 출력
		for(int cnt=0; cnt<10; cnt++) {
			cnt++;
			System.out.println("홀수 출력:"+cnt);
		}
		//1~10까지 짝수 출력
		for(int cnt=1; cnt<=10; cnt++) {
			cnt++;
			System.out.println("짝수 출력:"+cnt);
		}
		//1~10 합 구하기
		int sum=0;
		for(int cnt=1; cnt<=10; cnt++) {
			sum=sum+cnt;
		}
		System.out.println("1~10까지 합:"+ sum);
		int sum1=0;
		//1~10까지 짝수 합
		for(int cnt=1; cnt<=10; cnt+=2) {
			sum1=sum1+cnt;
				}
		System.out.println("1~10까지 짝수 합:"+sum1);
				
		//1~10까지 홀수 합
		int sum2=0;
		for(int cnt=0; cnt<=11; cnt+=2) {
			sum2=sum2+cnt;
		}
		System.out.println("1~10까지 홀수 합:"+sum2);
		
	
	}
}
