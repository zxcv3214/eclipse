package ex07_10_in_method;

import javax.print.attribute.standard.PrinterInfo;

public class Student_main1_method3_array_sort {

	public static void main(String[] args) {
		
		Student[] students = { 
				new Student("강호동", 85, 60, 70), 
				new Student("이승기", 90, 95, 80),
				new Student("유재석", 75, 80, 100), 
				new Student("하하", 80, 70, 95), 
				new Student("이광수", 100, 65, 80) 
		};

		int subject[] = getTotal(students);
		
		sort(students);
		
		print(students, subject);
}
	//학생들 점수
	static int[] getTotal(Student[] students)  {
		int[] subject=new int[3];
		
		for(Student student : students) {
			subject[0] += student.kor;
			subject[1] += student.eng;
			subject[2] += student.math;
		}
		return subject;
	}
	
	//학생 총점 오름차순
	static void sort(Student[] students) {
		for (int i = 0; i < students.length-1; i++) {
			for (int j = i+1; j < students.length; j++) {
				if(students[i].getTotal() < students[j].getTotal()) {
					//학생.총점를 비교하기
					Student imsi = students[i];
					students[i]= students[j];
					students[j]= imsi;
					
				}//if
				
			}//for j
			
		}//for i
		
	}
	
	private static void print(Student[] students, int[] subject) {
		System.out.println("=========== 학생별  /  과목별 총점 구하기 ===========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		for(Student student : students) {
			PrinterInfo(student);
		}
		
		for(int j=0; j<45; j++) {
			System.out.print("=");
		}
		System.out.print("\n총점\t");
		for(int i=0; i<subject.length;i++)
			System.out.print(subject[i]+"\t");
		
	}
	//평균 출력
	static void PrinterInfo(Student students) {
		System.out.print(students.name+"\t"+students.kor+"\t"+students.eng+"\t"+
					students.math+"\t"+students.getTotal()+"\t");
		System.out.printf("%.1f\n",students.getAverage());
	}

}
