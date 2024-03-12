package ex04_04_Consting;

public class Const {
	
//상수 값을 한번 만 저장할 수 있는 공간
//상수 만드는 법 : 변수 타입 앞에 기워드 final만 붙여 주기만 하면 된다.
//일반적으로 상수의 이름은 대문자로 사용함
	public static void main(String[] args) {
		final int MAX = 500;
		System.out.println(MAX);
		//MAX=1000; //값을 변경하는 문장을 사용하면 에러가 발생합니다.
	}

}
