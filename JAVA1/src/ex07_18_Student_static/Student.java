package ex07_18_Student_static;

public class Student {
	
	 String name; 
	 int  kor, eng,  math;
	 
	 static int korTotal,mathTotal,engTotal;
	 
	 Student(String name,int kor, int eng, int math){
		 this.name = name;
		 this.kor = kor;
		 this.eng = eng;
		 this.math = math;
		 korTotal += kor;
		 mathTotal+= math;
		 engTotal += eng;
	 }
	 
     int getTotal() {
    	 return kor + eng + math; 
     }
     
     float getAverage(){ 
    	 return (getTotal() / 3f);
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
}
