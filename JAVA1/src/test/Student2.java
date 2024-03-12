package test;

import ex07_18_Student_static.Student;

public class Student2 {
	private String name;
	private int kor, eng, math;
	public static int korTotal;
	public static int engTotal;
	public static int mathTotal;

	int getTotal() {
		return kor + eng + math;
		 
	}
	
	float getAverage() {
		return Math.round(getTotal()/ 3.0*10)/10f;

	}	

	public Student2(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		korTotal += kor;
		engTotal += eng;
		mathTotal += math;
	}


	// 학생별 총점을 기준으로 정렬하기
		static void sort(Student2[] students) {
			for (int i = 0; i < students.length-1; i++) {
	 			for (int j = i+1; j < students.length; j++) {
	 				if(students[i].getTotal() < students[j].getTotal()) {
	 					//학생.총점를 비교하기
	 					Student2 imsi = students[i];
	 					students[i]= students[j];
	 					students[j]= imsi;
	 				}//if
	 			}//for j
	 		}//for i
		}

	public String toString() {
	    return name + "\t" + kor + "\t" + eng + "\t" + math +"\t"+ getTotal() +  "\t" +getAverage();
	}

}


