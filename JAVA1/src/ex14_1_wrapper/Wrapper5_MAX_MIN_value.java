//Wrapper 객체 -> 기본형 값으로 자동(오토) Unboxing 하는 예
//기본형의 값을 써야 할 자리에 Wrapper 객체를 사용하면
//그 Wrapper 객체로 부터 기본형의 값이 자동으로 추출되어 사용됩니다.

package ex14_1_wrapper;
public class Wrapper5_MAX_MIN_value {
	public static void main(String[] args) {
		//문자열 "10"을 Wrapper 객체 Integer로 바꿈
		Integer obj = Integer.valueOf("10");
		
		//Integer 객체와 int 타입의 값을 더하는 명령문
		int sum = obj +20;
		//int sum = obj.inValue() + 20;
		
		System.out.println(sum);
		
		String a = obj + "" + 20;//""로 인해 문자열로 변경되었다.
		System.out.println(a);
		
		String b =obj.toString() + 20;//toString()로 인해 문자열로 변경
		System.out.println(b);
	}
}