//File 클래스를 디렉토리 생성
//실행 한번 후 : 새로 만든 디렉토리 이름
//실행 두번 후 : 이미 있는 디렉토리 이름
package ex18_7_File;
import java.io.File;
import java.io.IOException;
public class FileExample2_3 {

	public static void main(String[] args) {
		//디렉토리 삭제
		/*
		 *	boolean java.io.File.delete() : 디렉토리를 삭제합니다.
		 *	단 디렉토리 안에 파일이 있으면 삭제하지 못합니다.
		 *	이때 반환값은 false가 됩니다.
		 */
		String dir = "E:\\newDirectory";
		//파일 삭제
		File f4 = new File(dir);
		if(f4.exists()) {//E:\\newDirectory 디렉토리가 없는 경우
			if(f4.delete()) {// 파일 삭제
				System.out.println(f4.getPath() + "삭제 했습니다.");
			}else {
				System.out.println(f4.getPath() + "삭제에 실패했습니다.");
			}
		}else {//E://newDirectory 디렉토리가 있는 경우
			System.out.println(f4.getPath() + "에 삭제하고자 하는 디렉토리가 없습니다.");
		}
	}
}