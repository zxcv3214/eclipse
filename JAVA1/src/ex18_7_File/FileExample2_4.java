//File 클래스를 디렉토리 생성
//실행 한번 후 : 새로 만든 디렉토리 이름
//실행 두번 후 : 이미 있는 디렉토리 이름
package ex18_7_File;
import java.io.File;
import java.io.IOException;
public class FileExample2_4 {

	public static void main(String[] args) {
		
		String dir = "E:\\newDirectory\\newFile.txt";
		//파일 삭제
		File f3 = new File(dir);
		if(f3.exists()) {//E:\\newDirectory 디렉토리가 없는 경우
			if(f3.delete()) {// 파일 삭제
				System.out.println(f3.getPath() + "삭제 했습니다.");
			}else {
				System.out.println(f3.getPath() + "삭제에 실패했습니다.");
			}
		}else {//E://newDirectory 디렉토리가 있는 경우
			System.out.println(f3.getPath() + "에 삭제하고자 하는 파일이 없습니다.");
		}
	}
}