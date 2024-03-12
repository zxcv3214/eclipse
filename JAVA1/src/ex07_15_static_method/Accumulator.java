/*정적 필드가 있는 클래스
 * total 필드는 객채마다 따로 생기지만
 * grandTotal 필드는 특정 객체에 상관없음
 * */
package ex07_15_static_method;
public class Accumulator {
	int total;
	static int grandTotal;
	
	void accymylate(int amount) {
		total += amount;
		grandTotal += amount;
		
	}
	/*
	 * 정적 메서드안에서는 인스턴스 변수, 인스턴스 메서드 사용할 수 없습니다.
	 * 인스턴스 변수와 인슨턴스 메서드는 객체 생성시 사용할 수 있는 맴버들이기 때문에
	 * 인스턴스 생성과 관련없는 static 메서드안에서는 사용할 수 없습니다.
	 * 따라서 this도 사용할 수 없습니다.
	 * */
	static int getGrandTotal() { //정적 메서드 선언
		//total= 5;				//에러 발생
		//Accumulator(100);		//에러 발생
		return grandTotal;
	}
}
