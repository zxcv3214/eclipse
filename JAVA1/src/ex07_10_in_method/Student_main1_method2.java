package ex07_10_in_method;

import javax.print.attribute.standard.PrinterInfo;

public class Student_main1_method2 {

	public static void main(String[] args) {
		/*
		Student h1= new Student("강호동", 85,60,70);
		Student h2= new Student("이승기", 90,95,80);
		Student h3= new Student("유재석", 75,80,100);
		Student h4= new Student("하하", 80,70,95);
		Student h5= new Student("이광수", 100,65,80);
		Student[] students = {h1,h2,h3,h4,h5};
		*/
		//int[] a= {1,2,3};
		
		Student[] students = {
				new Student("강호동", 85,60,70),
				new Student("이승기", 90,95,80),
				new Student("유재석", 75,80,100),
				new Student("하하", 80,70,95),
				new Student("이광수", 100,65,80)};
		
		
		int subject[] = getTotal(students);
		print(students,subject);

	}//main

	private static int[] getTotal(Student[] students) {
		int[] subject=new int[3];
		/*
		subject[0]=h1.kor+h2.kor+h3.kor+h4.kor+h5.kor;
		subject[1]=h1.eng+h2.eng+h3.eng+h4.eng+h5.eng;
		subject[2]=h1.math+h2.math+h3.math+h4.math+h5.math;
		*/
		/*
		for(int i=0; i<subject.length; i++) {
			for(int j=0; j<students.length; j++) {
			}
		}
		*/
		for(Student student : students) {
			subject[0] += student.kor;
			subject[1] += student.eng;
			subject[2] += student.math;
		}
		return subject;
	}
	
	static void print(Student[] students, int[] subject) {
		
		System.out.println("=========== 학생별  /  과목별 총점 구하기 ===========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		/*
		int[] subject=new int[3];
		subject[0]=h1.kor+h2.kor+h3.kor+h4.kor+h5.kor;
		subject[1]=h1.eng+h2.eng+h3.eng+h4.eng+h5.eng;
		subject[2]=h1.math+h2.math+h3.math+h4.math+h5.math;
		*/
		
		for(Student Student : students) {
			PrinterInfo(Student);
		}
		
		for(int j=0; j<45; j++) {
			System.out.print("=");
		}
		System.out.print("\n총점\t");
		for(int i=0; i<subject.length;i++)
			System.out.print(subject[i]+"\t");
		
	}

	static void PrinterInfo(Student student) {
		System.out.print(student.name+"\t"+student.kor+"\t"+student.eng+"\t"+
					student.math+"\t"+student.getTotal()+"\t");
		System.out.printf("%.1f\n",student.getAverage());
	
	}

}
