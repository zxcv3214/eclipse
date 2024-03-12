package ex04_04_Consting;

public class Constintg1_int_double1 {
	public static void main(String[] args) {
		
		int il=10;
		//1. 자동 형변환, 묵시적 형변환, 암시적 형변환
		//자동 형변환은 변수에 값을 저장하거나 메서드의 인지값이 매개변수로 전달될 때
		//일치하지 않은 자료형인 경우 컴파일러가 자동으로 형변환을 해주는 것이다.
		double d1=il;
		System.out.println("d1데이터는 " + d1 + "입니다.");
	}

}
