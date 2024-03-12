/*
 * - 열거 타입 이름은 소스 파일명과 대소문자 모두 일치해야 한다.
 * 
 * - 열거 타입은 컴파일을 하고 나면 내부적으로 클래스로 만들어 지는데
 * 	이 때 values()와 valueOf(String s)라는 정적 메소드가 자동으로 추가됩니다.
 * 
 * 1.public stacic ex09_11_enum_method.Day[] values();
 * 		열거 타입에 속하는 모든 열거 상수들을 배열에 담아서 리턴하는 메소드
 * 
 * 2.public static ex09_11_enum_method.Day
 * 								valueOf(java.lang.String);
 * 		열거 상수의 이름을 문자열로 남겨주면 그에 해당하는 열거 상수를 리턴하는 메소드
 
 */
package ex09_12_enum;
enum Day {
	MONDAY ,TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
	SATURDAY, SUNDAY
}
