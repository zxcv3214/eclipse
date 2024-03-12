package ex03;

public class Varible3_char {
	public static void main(String[] args) {

		/*
		 * 컴퓨터가 숫자밖에 모르기 떄문에 문자가 숫자로 변환되어 저장되는데 어떤 기준으로 저장될까요? 문자에 해당하는 유니코드입니다.
		 * 
		 * 'A' -> 65 : 문자를 코드로 변환하는 것을 문자 인코딩(encoding)이라고 합니다. 65 ->'A' : 코드를 문자로 변환하는
		 * 것을 문자 디코딩(decoding)이라고 합니다.
		 * 
		 * 문자형에 정수를 배정하면 정수에 해당하는 유니코드를 찾아서 변수로 저장
		 */
		char c4 = 65; // 영문'A' 를 의미
		char c5 = '\uAC00'; // 한글 유니코드'가'를 의미
		
		System.out.println("c4=" + c4 + "c5=" + c5);
		int s = 1234;
		System.out.println(s);
	}
}