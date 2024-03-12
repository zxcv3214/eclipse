//문자열 추출 메소드
/*
 * 1. substring(int beginIndex) : beginIndex부터 문자열 끝까지 부분 문자열 리턴
 * 2. substring(int beginIndex, int endIndex) : beginIndex부터 endIndex-1 까지 부분 문자열 리턴
 * 
 * *
 */
package ex11_1_String_test2;

public class StringTest03 {

	public static void main(String[] args) {
		String jumin = "123456-4123456";
		
		if(jumin.charAt(7) == '1') {
			System.out.println("추출한 숫자는" + jumin.charAt(7)+ "이고 남자입니다.");
		}else if (jumin.charAt(7)== '2') {
			System.out.println("추출한 숫자는" + jumin.charAt(7)+ "이고 여자입니다.");
		}else if (jumin.charAt(7)== '3') {
			System.out.println("추출한 숫자는" + jumin.charAt(7)+ "이고 남자입니다.");
		}else if (jumin.charAt(7)== '4') {
			System.out.println("추출한 숫자는" + jumin.charAt(7)+ "이고 여자입니다.");
		}else {
			System.out.println("추출한 숫자는" + jumin.charAt(7)+ "그 외는 외국인입니다.");
		}
	}
}
