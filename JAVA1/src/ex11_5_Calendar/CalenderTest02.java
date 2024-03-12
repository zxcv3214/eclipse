package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalenderTest02 {
	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in);
		System.out.print("출력할 년도를 입력하세요>");
		int year1 = scanner1.nextInt();
		System.out.print("출력할 달 입력하세요>");
		int month1 = scanner1.nextInt();
		scanner1.close();
		
		Calendar c = new GregorianCalendar(year1, month1-1, 1);
		// GregorianCalendar 입력한 값을 받아서 내가 구하고자하는 요일을 구한다.
		int maxday = c.getActualMaximum(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_MONTH);//1:일요일,2:월요일~7:토요일
		
		String yoil[]= {"일","월","화","수","목","금","토"};
		System.out.print("\t\t\t" + c.get(Calendar.YEAR)+ "년도");
		System.out.println((c.get(Calendar.MONTH) +1) + "월"+"\n");
		for(int i=0; i< yoil.length; i++) {
			System.out.print(yoil[i] +'\t');
		}
		System.out.println();
		for (int i =0; i <51; i++)
			System.out.print("=");
		System.out.println();
	
		//공백을 찍어요
		
		/*
		 * c.get(Calendar.DAY_OF_WEEK)=1 일요일 공백 없음
		 * c.get(Calendar.DAY_OF_WEEK)=2 월요일 공백 한개
		 * c.get(Calendar.DAY_OF_WEEK)=3 화요일 공백 두개
		 * */
	
		for(int i =1; i<day; i++) {
			System.out.print("\t");
		}
			//날짜를 찍어요
			for(int i =1; i < maxday; i++) {	//day=1이면 i=(7,14,21,28)일때 줄 바뀌어요.
												//day=2이면 i=(6,13,20,27)일때 줄 바뀌어요.
				System.out.print(i + "\t");		//day=3이면 i=(7,14,19,26)일때 줄 바뀌어요.
				
				if((day+i) %7 == 1) {
					System.out.println("\n");
				}
			}
		}
	}


