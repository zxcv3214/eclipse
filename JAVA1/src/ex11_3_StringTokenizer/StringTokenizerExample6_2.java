/*StringTokenizer의 기능
 * StringTokenizer의 기능과 유사한 String의 split메소드 사용법
 * 
 * *** StringTokenizer : 010-1234-5678 토큰 분리***
 * 
 * 010
 * 1234
 * 5678
 * *** String의 split 메소드 사용 : 010-1234-5678 토큰 분리
 * 010
 * 1234
 * 5678
 * 
 * */
package ex11_3_StringTokenizer;
import java.util.StringTokenizer;
public class StringTokenizerExample6_2 {
	public static void main(String[] args) {
		
		// true: 구분자도 토큰으로 추출하도록 만드는 인자
	String phone="010-1234-5678";
	phone.split(phone);
	
	String[] token =phone.split("-");
	
	//배열의 갯수가 가변적일때 length 속성을 이용한다
	for(int i=0; i<token.length; i++) {
		System.out.println(token[i]);
	}
	
	System.out.println("=================향상된 for 문===================");
	for(String token1 :token) {
		System.out.println(token1);
	}
	}
}