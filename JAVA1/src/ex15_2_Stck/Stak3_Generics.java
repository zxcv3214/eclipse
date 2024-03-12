package ex15_2_Stck;

import java.util.Stack;

public class Stak3_Generics {

	public static void main(String[] args) {
		//Stack 객체 생성
		Stack<String> s = new Stack<>();
		System.out.println("비었나요?" + s.empty());//true - 참과 거짓 판단으로 비어있는지를 본다
		
		//Stak에 값 추가
		s.push("좋아요");
		s.push("자바");
		
		System.out.println("비었나요?" + s.empty()); //false:비었는지 판단
		
		//스택에서 객체를 제거하지 않고 접근합니다.
		System.out.println("맨 마지막 데이터 : " + s.peek());
		
		
		//Stak의 값을 출력
		while (!s.empty()) {
			System.out.println("데이터 출력 :" + s.pop());//스택의 최상에 있는 객체를 제거
			System.out.println("남은 데이터 갯수 : "+ s.size());
		}
		System.out.println("비었나요?" + s.empty());//true - 비어있는지 판단
	}
}
