package ex07_18_Student_static;

public class Student_main1_method_array1 {

	private static Student pringtStudent;
	public static void main(String[] args, Object student1) {
		
		Student[] students = {
				new Student("강호동", 85,60,70),
				new Student("이승기", 90,95,80),
				new Student("유재석", 75,80,100),
				new Student("하하", 80,70,95),
				new Student("이광수", 100,65,80)};
		
		
		pringtStudent(students);
		pringtStudent.sort(students);

	}//main



	static void pringtStudent(Student[] students) {
		
		System.out.println("=========== 학생별  /  과목별 총점 구하기 ===========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		for(Student Student : students) {
			PrinterInfo(Student);
		}
		
		for(int j=0; j<45; j++) {
			System.out.print("=");
		}
		System.out.print("\n총점\t");
			System.out.print(Student.korTotal+"\t"
						+Student.engTotal+"\t"
						+Student.mathTotal);
		
	}
	//평균구하기
	static void PrinterInfo(Student student) {
		System.out.print(student.name+"\t"+student.kor+"\t"+student.eng+"\t"+
					student.math+"\t"+student.getTotal()+"\t");
		System.out.printf("%.1f\n",student.getAverage());
	
	}
}
