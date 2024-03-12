package ex03;

public class Varible5_reference {
	public static void main(String[] args) {
		// s1,s2 참조형 변수, new는 연산자,
		// new String("자바"); 에서 String("자바")은 생성자
		String s1 = "자바";

		// String은 제공되는 클래스
		// 객체 생성
		// 클래스 참조형변수 = 연산자 생성자 호출
		String s2 = new String("자바");

		System.out.println("s1=" + s1 + "s2=" + s2);

		// 주소값 같은지 비교
		if (s1 == s2) {
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		}
		// 내용값 같은지 비교
		if (s1 == s2) {
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}

		String n1 = "심재윤";
		int a1 = 1;
		double a2 = 0.2;
		double a3 = 0.3;
		String n2 = "돈까스";
		String n3 = "야구";
		char n4 = 69;
		boolean m = true;
		//boolean n = false;

		System.out.println("=============" + 
		"\n이름: " + n1 + 
		"\n좋아하는 숫자= " + a1 + 
		"\n좌= " + a2 + 
		"\n우= " + a3 + 
		"\n좋아하는 음식= " + n2 + 
		"\n좋아하는 운동= " + n3 + 
		"\n좋아하는 알바벳= " + n4 + 
		"\n당신은 노래를 좋아하나요? " + m);
	}

}
