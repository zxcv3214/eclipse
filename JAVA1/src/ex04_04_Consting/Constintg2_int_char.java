package ex04_04_Consting;

public class Constintg2_int_char {
	public static void main(String[] args) {
		//int -> char(명시적 형변환)
		int i3 = 97;
		char c1 = (char) i3;
		System.out.println
		("i3데이터는 " + i3 + "입니다." +
		 "\nc1데이터는 " + c1 + "입니다.");
		
		i3 = 65;
		c1 = (char) i3;
		System.out.println
		("i3데이터는 " + i3 + "입니다." +
		 "\nc1데이터는 " + c1 + "입니다.");
		
		//char -> int (자동 형변환)
		i3='A';
		System.out.println("i3='A' 데이터는 " + i3 +"입니다.");
		
		i3='가';// 유니코드 '가'에 해당하는 값을 정수형 변수 i3에 대입
		System.out.println("i3= '가' 데이터는 " + i3 + "입니다.");
	}

}