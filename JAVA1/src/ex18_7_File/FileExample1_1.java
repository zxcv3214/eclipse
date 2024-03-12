package ex18_7_File;

import java.io.File;
import java.util.GregorianCalendar;

public class FileExample1_1 {

	public static void main(String[] args) {
		//파일 관리에 사용되는 File 클래스
		//현재 디렉토리 경로명을 가지고 File 객체를 생성
		File file = new File(".");//현재디렉토리(.), 상위디렉토리(..)

		File arr[] = file.listFiles();
		
		for(int cnt= 0; cnt<arr.length; cnt++) {//서브 디렉토리와 파일 목록을 가져온다.
			String name = arr[cnt].getName();//이름을 리턴
			
			if(arr[cnt].isFile())//파일이면 true 아니면 false
				//arr[cnt].length():파일의 크기 (바이트)
				System.out.printf("%-25s %7d \t", name,arr[cnt].length());
			else
				System.out.printf("%-25s   <DIR> \t", name);
			
			//1970년 1월 1일 0시 0분 0초 기점으로 경과한 밀리세컨드 값을 리턴
			//사람이 이해할 수 있는 날짜와 시간으로 변경할 필요가 있다.
			long time = arr[cnt].lastModified();
			System.out.printf("%d\n", time);
			
			GregorianCalendar calender = new GregorianCalendar();
			//setTimeInMilis() 메소드는 객체가 가지고 있는 시작 정보를 파라미터 값으로 갱싱하는 메소드
			//이떄 파마미터는 1970년 1월 1일 0시 0분 0초 기점으로 경과한 밀리세컨드 값이어야 한다
			calender.setTimeInMillis(time);
			//1$ : 포맷 문자열 다음에 오는 첫 번째 파라미터 (calender)
			//%1$tF : yyyy-MM-dd 포매의 날짜
			//%1$tT : HH:mm:ss 포맷
			//System.out.printf("%1$tF %1$tT \n", calender);
			System.out.printf("%tF %tT \n", calender, calender);
		}
	}

}
