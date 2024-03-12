package ex13_5;

public class Circle2 {
	int radius; // 반지름

	Circle2(int radius) {
		this.radius = radius;
	}

	public String toString() {
		return "radius=" + radius;
	}

	//obj가 Object타입이므로 radius를참조하기 위해서 Circle2타입으로 형변환이 필요
	public boolean equals(Object obj) {
	/*
	* 1. obj가 null이 아니고 obj를 Circle2로 형변환 가능한지 체크합니다. instanceof
	* 
	* 2. 조건을 만족하면 obj를 Circle2로 형 변환하고 형변환한 obj의 radius값과 현재 객체의 
	* radius값을 비교해서 같으면 true를 아니면 false를 리턴합니다.
	* 
	* 3.1번 조건을 만족하지 않으면 false 리턴합니다.
	*/
		if(obj !=null && obj instanceof Circle2) {
			Circle2 obj2 = (Circle2)obj;
			return this.radius == obj2.radius;
		}else {
			return false;
		}
	}
}