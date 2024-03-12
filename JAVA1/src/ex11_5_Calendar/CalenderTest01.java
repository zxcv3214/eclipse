package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalenderTest01 {
	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in);
		System.out.print("출력할 년도를 입력하세요>");
		int year1 = scanner1.nextInt();
		System.out.print("출력할 달 입력하세요>");
		int mouth1 = scanner1.nextInt();
		scanner1.close();
		

		System.out.println(year1 + "년 " + mouth1 + "월");
		Calendar c1 = new GregorianCalendar(year1, mouth1 - 1, 1);

		int i = 0;
		int day = c1.get(Calendar.DAY_OF_WEEK);
		int maxday = c1.getActualMaximum(Calendar.DATE);

		System.out.printf(
				 "일" + "\t" + "월" + "\t" + "화" + "\t" + "수" + "\t" + "목" + "\t" + "금" + "\t" + "토" + "\n");
		System.out.println("==============================================================");

		// System.out.println(c1.get(Calendar.DAY_OF_WEEK));

		for (i = 1; i < day; i++) {
			System.out.printf("\t");

		}
		int cnt = 1;
		while (cnt <= maxday) {

			if ((cnt + day - 1) % 7 == 0) {
				System.out.println(cnt);
			} else {
				System.out.printf("%d\t", cnt);
			}
			cnt++;
		}
	}
}

