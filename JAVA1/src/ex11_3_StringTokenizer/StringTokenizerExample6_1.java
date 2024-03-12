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
public class StringTokenizerExample6_1 {
	public static void main(String[] args) {
		
		// true: 구분자도 토큰으로 추출하도록 만드는 인자
	String phone="010-1234-5678";
	StringTokenizer token=new StringTokenizer(phone,"-");
	while (token.hasMoreTokens()) {
		String str= token.nextToken();
			System.out.println(str);
	}	
		}
	}