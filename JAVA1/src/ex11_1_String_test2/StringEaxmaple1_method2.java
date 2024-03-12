package ex11_1_String_test2;

public class StringEaxmaple1_method2 {
		
	 boolean check_length(String zumin) {
		return zumin.length() == 14;//true,false를 생략하면 자동으로 순서가 된다.
	}
	 static boolean check_hyphen(String zumin) {
		 return zumin.substring(6,7).equals("-");
	 }

	static String pandan_gender(String zumin) {
		String gender= zumin.substring(7,8);
		String result = "외국인";
		switch (gender) {
		case "1","3":
			result = "남자";
			break;
			case "2","4":
			result = "여자";
		}
		return result;
}
	public static void main (String args[]) {
		String zumin="123456a2890123";
		print(zumin);
	
	}//main end

	static void print(String zumin) {
		if(zumin.length() == 14) {
			if(check_hyphen(zumin)) {
				System.out.println(pandan_gender(zumin));
			}else {
				System.out.println("-를 넣어주세요");
			}
			
			}else{
			System.out.println("주민번호 14자리를 입력하세요.");
			
		}
	}
	
}