package ex11_3_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample4 {

	public static void main(String[] args) {
		
		// true: 구분자도 토큰으로 추출하도록 만드는 인자
		StringTokenizer stok=new StringTokenizer("사과=10|처콜렛=3|삼페인=1", ",|",true);
		
		while (stok.hasMoreTokens()) {
			String str= stok.nextToken();
			
			System.out.println("상품이름\t상품");
			
			
		}
	}
}