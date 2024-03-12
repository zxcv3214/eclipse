package ex18_5_Buffered_test_no_rank;

import java.util.ArrayList;

public class Student {
	private String name;
	private int kor, eng, math;
	public static int korTotal;
	public static int engTotal;
	public static int mathTotal;

	int getTotal() {
		int tot=kor + eng + math;
		return tot;
		 
	}
	
	float getAverage() {
		float avg=Math.round(getTotal()/ 3.0*10)/10f;
		return avg;

	}	

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		korTotal += kor;
		engTotal += eng;
		mathTotal += math;
	}


	// 학생별 총점을 기준으로 정렬하기
		static void sort(ArrayList<Student> as) {
			int size=as.size();//size변수로 size를 담았다
			for (int i = 0; i < size-1; i++) {
	 			for (int j = i+1; j < size; j++) {
	 				if(as.get(i).getTotal() < as.get(j).getTotal()) {
	 					//학생.총점를 비교하기
	 					Student imsi = as.get(i);
	 					as.set(i, as.get(j));
	 					as.set(j, imsi);
	 				}//if
	 			}//for j
	 		}//for i
		}

	public String toString() {
	    return name + "\t" + kor + "\t" + eng + "\t" + math +"\t"+ getTotal() +  "\t" +getAverage();
	}

}


