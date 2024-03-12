/*
 * 실행1. 배열 요소의 값 중 입력한 경우
 * 실행결과화면)
 * 검색할 이름을 입력하세요?
 * 이름:홍길동
 * 홍길동는(은) 배열의 인덱스 2에서 찾았습니다.
 * 
 * 실행2. 배열 요소의 값이 아닌 데이터를 입력한 경우
 * 실행결과화면)
 * 검색할 이름을 입력하세요?
 * 이름:HTA
 * HTA는(은) 배열방에서 찾지 못했습니다.
 * */
package ex06_1_array;
/*
 * 1.이클립스 실행 순서(146페이지)
 * 1) 해당 소스에서 Ctrl + F11
 * 2) 해당 소스에서 마우스 오른쪽 버튼 클릭
 * -> 오른쪽 화면의 Arguments 탭 선택 후
 * -> Program arguments 상자에서 값을 입력합니다.
 * -> 두개 이상 사용시에는 balnk또는 엔터로 구분합니다.
 *    만약 공백이 들어간 문자열인 경우 더블코드(")안에서 문자열을 넣습니다.
 *    대한 민국 만세
 * 2. cmd 창에서 실습
 *  1) Java프로젝트 경로의 bin폴더로 이동
 *  2) java 패키지명.클래스이름 대한 민국 만세 입력 후 엔터
 *  예)e:work\java\bin>java ex06_array_Main_arg2 대한 민국 만세
 * */
import java.util.Iterator;
import java.util.Scanner;

public class Main_arg2 {
	public static void main(String args[]) {	
		for(String main : args) {
			System.out.println(main);
		}
	}
}