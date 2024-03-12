package ex06_1_array;

import java.util.Iterator;
import java.util.Scanner;

public class TwoArrayTest01_3 {
	public static void main(String args[]) {	
		String name[] = { "강호동", "이승기", "유재석", "하하", "이광수" };
		String sub_name[] = { "국어", "수학", "영어" };

		int[][] score = {
				{ 85, 60, 70 }, // 0행(1번학생)
				{ 90, 95, 80 }, // 1행(2번학생)
				{ 75, 80, 100 }, // 2행(3번학생)
				{ 80, 70, 95 }, // 3행(4번학생)
				{ 100, 65, 80 } // 4행(5번학생)
		};
		
		int korTotal=0, engTotal=0, mathTotal=0; // 과목저장할 변수
		int[] subject = new int[3]; // 과목총점 저장
		double[] avg = new double[3]; //과목 평균 저장
		int[] student = new int[5]; // 학생의 총점 저장
		int i,j;
		// 강호동 학생 국어 수학 영어 구하기
		//System.out.printf(score[0][0],score[0][1],score[0][2]);
		
		System.out.println("=====학생별  /  과목별 총점 구하기=====");
		System.out.println(" 국어 "+" 수학 "+" 영어 "+" 총점 "+" 평균 ");
		for(i=0; i<5; i++) {
			for(j=0; j<3; j++) {
				student[i]+=score[i][j];
			}
				System.out.println(name[i]+"   "+student[i]);
		}
		
		System.out.println("==============================");
		for( i=0; i < 3; i++) {
			for( j=0; j < 5; j++) {
				//subject[i] = subject[i] + subject[i][j];
				subject[i]+=score[j][i];	
			}
			System.out.print("   "+ subject[i]);
		}
			
	}
}