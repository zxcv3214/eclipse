package ex11_3_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample1_2 {

	public static void main(String[] args) {
		StringTokenizer stok=new StringTokenizer("사과 배 복숭아");
		
		String s1 = stok.nextToken();
		System.out.println(s1);
		
		String s2 = stok.nextToken();
		System.out.println(s2);
		
		String s3 = stok.nextToken();
		System.out.println(s3);
		
		String s4 = stok.nextToken();
		System.out.println(s4);
	}
}