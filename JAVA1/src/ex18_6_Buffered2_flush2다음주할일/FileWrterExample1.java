package ex18_6_Buffered2_flush2다음주할일;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrterExample1 {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			
			fw = new FileWriter("E:\\jaeyun\\HTML\\src\\ex18_6_Buffered2_flush2\\output.txt");
			
			//두 번째 인자는 버퍼 사이즈를 의미 - 버퍼에 5개의 문자를 저장할 수 있다.
			//두 번째 인자가 생략된 경우는 defaultCharBufferSize = 8192로 설정 되어있다.
			bw = new BufferedWriter(fw,5);
			
			char arr[] = {'내','꺼','인','1','듯',
						  '2','내','꺼','3','아',
						  '닌','4','내','꺼','5',
						  '같','은','6','너'
						  //버퍼를 5개로 저장했는데 마지막 4개는 나올까?
			};
			for (int cnt =0; cnt<arr.length; cnt++) {
				bw.write(arr[cnt]);
				/*
				 * 버퍼가 다 차기 전까지는 파일에 실제로 데이터를 쓰지 않습니다.
				 * */
			}
		} catch (IOException ioe) {
			System.out.println("파일로 출력 할 수 없습니다.");
		}finally {
			try {
				if(fw !=null)
					fw.close();//아직 버퍼에 데이터가 남아 있는데 출력 스트림 닫습니다.
				
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
