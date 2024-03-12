/*
 * 열거 타입(enum)
 * 1. 여러 상수를 선언할 때 편리하게 선언할 수 있는 방법이다.
 * 2. 형식
 * 	enum 열거타입이름 {
 * 		열거 상수 목록
 * }
 * 3. 열거타입이름은 소스 파일명과 대소문자 모두 일치해야 합니다.
 * 4. 상수에 따로 값을 지정해 주지 않아도 자동적으로 0부터 정수값이 할당됩니다.
 * 5. 열거형은 내부적으로 클래스로 취급합니다.
 * 
 * */
package ex09_09_enum;
enum Season {		//Season : 열거 타입이름
	SPRING, SUMMER, FALL, WINTER //열거 상수 목록
}

