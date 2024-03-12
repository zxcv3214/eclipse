package ex18_5_Buffered_test_no_rank;

import java.io.*;
import java.util.ArrayList;


public class BufferedWriterExample_test1 {

	public static void main(String[] args) {
		BufferedReader reader =null;
		try {
			reader = new BufferedReader
					(new FileReader("E:\\jaeyun\\HTML\\src\\ex18_5_Buffered_test_no_rank\\jumsu.txt"));
			ArrayList<Student> list =new ArrayList<Student>();
			while (true) {
				String str = reader.readLine(); //파일로 부터 한 행씩 읽어오기
				if(str == null)
					break;
				String[] sep= str.split(" ");
				list.add(new Student(
						sep[0],
						Integer.parseInt(sep[1]),
						Integer.parseInt(sep[2]),
						Integer.parseInt(sep[3])
						)
						);
			}
			print(list);
			
		}catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}finally {
			try {
				if(reader != null)
					reader.close();
			} catch (IOException e) {
				System.out.println("닫는 중 오류입니다.");
			}
		}
	}

	static void print(ArrayList<Student> list) {
		System.out.println("==========    학생별   /  과목별 총점구하기  ==========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

		for (Student s : list) {
			System.out.println(s.toString());
		}
		for (int j = 0; j < 50; j++) {
			System.out.print("=");
		}
		System.out.print("\n총점\t");
		System.out.print(Student.korTotal + "\t");
		System.out.print(Student.engTotal+ "\t");
		System.out.print(Student.mathTotal + "\t");
	}

	
}
