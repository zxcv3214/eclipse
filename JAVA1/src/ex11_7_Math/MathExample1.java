package ex11_7_Math;

public class MathExample1 {

	public static void main(String[] args) {
		
		System.out.println("12.45 반올림=>" + Math.round(12.45));//12
		System.out.println("124.5 반올림=>" + Math.round(124.5));//125
		
		//12.45를 반올림해서 12.5로 만들기 f는 소수점 자리 출력
		
		System.out.println("12.45 반올림=>" +  Math.round(124.5)/10f);
		System.out.println("12.45 반올림=>" +  Math.round(124.5)/10.0);
	}
}
