package ex06_1_array;

import java.util.Iterator;
import java.util.Scanner;

public class TwoArrayTest01_2 {
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
		
		int[] subject = new int[3]; // 과목총점 저장
		int[] student = new int[5]; // 학생의 총점 저장
		
		int korTotal=0, engTotal=0, mathTotal=0;
		System.out.println("=====각 과목별 총점 구하기=====");
		/*
		//국어 과목 총점
		subject[0] = score[0][0] + score[1][0] + score[2][0] + score[3][0] + score[4][0];
		for(i=0; i<5; i++)
		subject[0]= subject[0] + subject[j][0];
		//수학 과목 총점
		subject[1] = score[0][1] + score[1][1] + score[2][1] + score[3][1] + score[4][1];
		subject[1]= subject[1] + subject[j][1];
		//영어 과목 총점
		subject[2] = score[0][2] + score[1][2] + score[2][2] + score[3][2] + score[4][2];
		subject[2]= subject[2] + subject[j][2];
		*/
		int i,j;
		for( i=0; i < 3; i++) {
			for( j=0; j < 5; j++) {
				//subject[i] = subject[i] + subject[i][j];
				subject[i]+=score[j][i];	
			}
			System.out.println(sub_name[i]+"의 총점 = "+ subject[i]);
		}
		
		System.out.println("=======학생별 총점=======");
		/*
		// 강호동 학생 총점 구하기
		student[0] = score[0][0]+score[0][1]+score[0][2];
		// 이승기 학생 총점 구하기
		 * student[1] = score[1][0]+score[1][1]+score[1][2];
		// 유재석 학생 총점 구하기
		 * student[2] = score[2][0]+score[2][1]+score[2][2];
		// 하하 학생 총점 구하기
		 * student[3] = score[3][0]+score[3][1]+score[3][2];
		// 이광수 학생 총점 구하기
		 * student[4] = score[4][0]+score[4][1]+score[4][2];
		 * 
		 * for(j=0; j<3; j++)
		 * 	student[4] = student[4]+ score[4][j]
		 * 
		 * for(i=0; i< 5; i++){
		 * 	System.out.println(name[i]+"의 총점 ="+student[i]);
		 * };
		*/
		for(i=0; i<5; i++) {
			for(j=0; j<3; j++) {
				student[i]+=score[i][j];
			}
				System.out.println(name[i]+"의 총점 ="+student[i]);
		}
	}
}