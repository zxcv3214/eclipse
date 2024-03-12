/*
	열거 타입에 대해 valueOf메소드를 호출하는 예
	
	2.public static ex09_11_enum_method.Day
 * 								valueOf(java.lang.String);
 * 		열거 상수의 이름을 문자열로 남겨주면 그에 해당하는 열거 상수를 리턴하는 메소드
 * */
package ex09_11_enum_method;
class EnumExample2 {
	public static void main(String args[]) {
		printDay("MONDAY");
		printDay("WEDNESDAY");
		printDay("FRIDAY");
		//printDay("FRIDAY2");
	}
		static void printDay(String name) {
			Day day =Day.valueOf(name);
			System.out.print(day + ":");
			
			int value=day.ordinal(); //열거형 상수가 정의된 순서를 반환합니다.
			System.out.println(value);
		}
	}
