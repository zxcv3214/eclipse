package ex11_3_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample5 {

	public static void main(String[] args) {
		
		// true: 구분자도 토큰으로 추출하도록 만드는 인자
		StringTokenizer stok=new StringTokenizer("사과=10|처콜렛=3|삼페인=1", "=|",true);
		
		System.out.println("상품이름\t상품 수");
		
		while (stok.hasMoreTokens()) {
			String str= stok.nextToken();
			if (str.equals("=")) {
				System.out.print("\t"); //탭만큼 띄어쓰기(4칸정도 소모)
			}else if (str.equals("|")) {
				System.out.print("\n"); //\n줄바꿈
			}else {
				System.out.print(str);
			}
			
			
		}
	}
}