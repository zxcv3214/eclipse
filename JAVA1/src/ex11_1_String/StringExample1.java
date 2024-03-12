package ex11_1_String;

public class StringExample1 {

	public static void main(String[] args) {
		String str = "집에 가고 싶어요.";
		int len = str.length();
		
		for (int cnt = 0; cnt < len; cnt++) {
			char ch = str.charAt(cnt); //charAt 메서드 호출
			System.out.println("index = " + cnt + "문자 =" + ch);
		}
		char ch = str.charAt(7);
		System.out.println(ch);
	}
}
