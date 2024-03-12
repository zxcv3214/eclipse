package ex04_04_Consting;

public class Constintg1_int_double2 {
	public static void main(String[] args) {
		
		double d2=10.62345;
		
		// 에러 발생
		//int i2 = d2 //정수형 변수에 실수형 값을 저장할 수없다.
		
		//2. 명시적 형 변환
		//double -> int 앞에 괄호 안에 데이터타입을 설정해주기
		int i2= (int) d2;
		
		float ft= (float) 3.14;
		//Type mismatch: cannot convert from double to float
		//데이터범위가 초과되서 가질수없다.(float)를 사용한다.

		System.out.println("d2데이터는 " + i2 + "입니다.");
		System.out.println(ft);
	}

}