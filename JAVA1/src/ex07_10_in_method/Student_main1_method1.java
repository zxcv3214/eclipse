package ex07_10_in_method;

import javax.print.attribute.standard.PrinterInfo;

public class Student_main1_method1 {

	public static void main(String[] args) {
		
		Student h1= new Student("강호동", 85,60,70);
		Student h2= new Student("이승기", 90,95,80);
		Student h3= new Student("유재석", 75,80,100);
		Student h4= new Student("하하", 80,70,95);
		Student h5= new Student("이광수", 100,65,80);
		
		int subject[] = getTotal(h1,h2,h3,h4,h5);
		print(h1,h2,h3,h4,h5,subject);

}

	private static int[] getTotal(Student h1, Student h2, Student h3,
									Student h4,Student h5) {
		int[] subject=new int[3];
		subject[0]=h1.kor+h2.kor+h3.kor+h4.kor+h5.kor;
		subject[1]=h1.eng+h2.eng+h3.eng+h4.eng+h5.eng;
		subject[2]=h1.math+h2.math+h3.math+h4.math+h5.math;
		return subject;
	}
	
	private static void print(Student h1, Student h2, Student h3,
			Student h4, Student h5, int[] subject) {
		System.out.println("=========== 학생별  /  과목별 총점 구하기 ===========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		PrinterInfo(h1);
		PrinterInfo(h2);
		PrinterInfo(h3);
		PrinterInfo(h4);
		PrinterInfo(h5);
		
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
