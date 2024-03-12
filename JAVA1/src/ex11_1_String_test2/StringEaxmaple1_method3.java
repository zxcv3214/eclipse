package ex11_1_String_test2;

public class StringEaxmaple1_method3 {
		
	

	boolean check_length(String zumin) {
		return zumin.length() == 14;//true,false를 생략하면 자동으로 순서가 된다.
	}
	 static boolean check_hyphen(String zumin) {
		 return zumin.substring(6,7).equals("-");
	 }
	 
	 static int isNumber(String zumin) {
		int index=-1;
		int len= zumin.length();
		
		for (int i=0; i <len; i++) {
			if (i == 6) //continue를 통해 - 빼고 for이 돌아간다
				continue;
		
		char test = zumin.charAt(i);//
		if(test <'0' || test > '9') {//자동으로 숫자형으로 변환되어 값을 숫자로 비교했다.
			index = i;
			break;
		}
		}
		 return index;
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
	
	 static String inNumber_Message(String zumin) {
		 int index= isNumber(zumin);
		 
		 if(index >=0 && index<=5) {
			 System.out.println("주민번호 앞자리를 숫자로 입력하세요.");
		 }else if (index >=7 && index <=13) {
			 System.out.println("주민번호 뒷자리를 입력하세요.");
		}else if (index == -1) {
			System.out.println(pandan_gender(zumin) + " 입니다.");
		}
		 return zumin;
	 }
	public static void main (String args[]) {
		String zumin="123456-a890123";
		print(zumin);
	
	}//main end
	
	static void print(String zumin) {
		if(zumin.length() == 14) {
			if(check_hyphen(zumin)) {
				System.out.println(inNumber_Message(zumin));
			}else {
				System.out.println("-를 넣어주세요");
			}
			
			}else{
			System.out.println("주민번호 14자리를 입력하세요.");
		}
	}
}