package ex21_4_5_PreparendStatement_Stidemt3;

import java.util.ArrayList;
import java.util.Scanner;

import ex21_4_4_DAO1.Emp;
import ex21_4_4_DAO1.Emp_DAO1;

public class Student_main {
	static String menus[] = {"입력","조회","수정","삭제","모두조회","종료"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		Student_DAO dao = new Student_DAO();
		
		do {
			int menu = menuselect(sc);
			switch (menu) {
			case 1:
				insert(sc, dao);
				break;
			case 2:
				select(sc, dao);
				break;
			case 3:
				update(sc, dao);
				break;
			case 4:
				delete(sc, dao);
				break;
			case 5:
				selectAll(dao);
				break;
			case 6:
			     sc.close();
				 return;
			}
		} while (true);
	}
	
	private static int menuselect(Scanner sc) {
		int i=0;
		
		System.out.println("=======================================================");
		for(String menu :menus) {
			System.out.println(++i +"."+ menu);
		}
		
		System.out.println("=======================================================");
		System.out.print("메뉴를 선택하세요>");
		return inputNumber(sc, 1, menus.length);
	}

	private static int inputNumber(Scanner sc, int start, int end) {
		int input=0;
		while (true)
			try {
				input = Integer.parseInt(sc.nextLine());
				if(input <= end && input >= start) {
					break;
				}else {
					System.out.print(start + "~" + end + "사이의 숫자를 입력하세요>");	
				}
			} catch (NumberFormatException e) {
				System.out.print("숫자로 입력하세요>");
			}
		return input;
	};
	
	private static void insert(Scanner sc, Student_DAO dao) {
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("국어점수를 입력하세요>");
		int kor = inputNumber(sc, 0, 100);
		
		System.out.println("수학점수를 입력하세요>");
		int math = inputNumber(sc, 0, 100);
		
		System.out.println("영어점수를 입력하세요>");
		int eng = inputNumber(sc, 0, 100);
		//객체 생성하면서 tot, avg를 구합니다.
		Student student = new Student(name, kor, math, eng);
		int result = dao.insert(student);
		if(result == 1) 
			System.out.println("삽입 되었습니다.");
		else {
			System.out.println("삽입 실패되었습니다.");
		}
	}
	
	private static void select(Scanner sc, Student_DAO dao) {
		// TODO Auto-generated method stub
		
	}
	
	private static void update(Scanner sc, Student_DAO dao) {
		// TODO Auto-generated method stub
		
	}
	
	private static void delete(Scanner sc, Student_DAO dao) {
		// TODO Auto-generated method stub
		
	}
	
	private static void selectAll(Student_DAO dao) {
		String selAll[]= {"번호","이름","국어","수학","영어","총점","평균","학점"};
		ArrayList<Student> list = dao.selectAll();

		if (list.isEmpty()) {
			System.out.println("테이블에 데이터가 없습니다.");
		} else {
			System.out.printf("%s\t%s\t%s\t\t%s\t%s\t\t%s\t%s\t%s\t\n", 
					selAll[0], selAll[1], selAll[2], selAll[3], selAll[4], selAll[5], selAll[6], selAll[7], selAll[8]);
			for(int i=0;i<=80;i++)
			 System.out.print("=");
			
			System.out.println();
			
			for (Student s : list) {
				System.out.println(s.toString());
			}
		}
		
	}
}
